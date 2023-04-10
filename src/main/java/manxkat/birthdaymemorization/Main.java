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
        BirthdayCalendar birthdayCalendar = new BirthdayCalendar();

        for (int i = 0; i < count; i++) {
            String name = io.getWord();
            int rating = Integer.parseInt(io.getWord());

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMAT);
            LocalDate birthday = LocalDate.parse(io.getWord() + "/" + DATE_YEAR, formatter);

            birthdayCalendar.add(birthday, name, rating);
        }

        return birthdayCalendar;
    }

    private static void outputNamesInCalendar(Kattio io, BirthdayCalendar calendar) {
        calendar.values()
                .stream()
                .sorted()
                .forEach(friend -> io.println(friend.getName()));
    }

}
