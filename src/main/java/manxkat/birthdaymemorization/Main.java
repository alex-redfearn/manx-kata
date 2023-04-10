package manxkat.birthdaymemorization;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import manxkat.io.Kattio;

public class Main {

    private static final String DATE_FORMAT = "dd/MM/yyyy";
    private static final String DATE_YEAR = "2020";

    public static void main(String[] args) {
        try (Kattio io = new Kattio(System.in, System.out)) {
            int birthdays = io.getInt();
            BirthdayCalendar calendar = addBirthdaysToCalendar(io, birthdays);

            outputNamesInCalendar(io, calendar);
        }
    }

    private static BirthdayCalendar addBirthdaysToCalendar(Kattio io, int count) {
        BirthdayCalendar calendar = new BirthdayCalendar();

        for (int i = 0; i < count; i++) {
            String name = io.getWord();
            int rating = Integer.parseInt(io.getWord());
            Friend friend = new Friend(name, rating);

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMAT);
            LocalDate birthday = LocalDate.parse(io.getWord() + "/" + DATE_YEAR, formatter);

            addBirthdayToCalendar(calendar, birthday, friend);
        }

        return calendar;
    }

    private static void addBirthdayToCalendar(BirthdayCalendar calendar, LocalDate birthday, Friend friend) {
        Friend existingFriend = calendar.get(birthday);

        if (existingFriend != null) {
            if(Friend.RATING.compare(friend, existingFriend) > 0) {
                calendar.replace(birthday, friend);
            }
        } else {
            calendar.add(birthday, friend);
        }
    }

    private static void outputNamesInCalendar(Kattio io, BirthdayCalendar calendar) {
        io.println(calendar.values().size());

        calendar.values()
                .stream()
                .sorted(Friend.NAME)
                .forEach(friend -> io.println(friend.getName()));
    }

}
