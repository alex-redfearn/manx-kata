package manxcat.birthdaymemorization;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.Collection;

import org.junit.jupiter.api.Test;

import manxkat.birthdaymemorization.BirthdayCalendar;
import manxkat.birthdaymemorization.Friend;

public class BirthdayMemorizationTest {
    
    @Test
    public void givenEmptyBirthdayCalendar_whenAddBirthday_thenGetBirthdayShouldReturnFriend() {
        // GIVEN
        BirthdayCalendar calendar = new BirthdayCalendar();
        
        // WHEN
        LocalDate birthday = LocalDate.now();
        String name = "Alex";
        int rating = 1;
        calendar.add(birthday, new Friend(name, rating));

        // THEN
        assertEquals("Alex", calendar.get(birthday).getName(), "Calendar should contain birthday for Alex.");
    }


    @Test
    public void givenBirthdayCalendarWithOneBirthday_whenReplaceBirthday_thenGetBirthdayShouldReturnNewFriend() {
        // GIVEN
        BirthdayCalendar calendar = new BirthdayCalendar();
        LocalDate birthday = LocalDate.now();
        String name = "Alex";
        int rating = 2;
        calendar.add(birthday, new Friend(name, rating));

        // WHEN
        calendar.replace(birthday, new Friend("Kevin", 1));

        // THEN
        assertEquals("Kevin", calendar.get(birthday).getName(), "Calendar should contain birthday for Kevin.");
    }

    public void givenBirthdayCalendarWithThreeFriends_whenGetValues_thenThreeFriendsShouldBeReturned() {
        // GIVEN
        BirthdayCalendar calendar = new BirthdayCalendar();
        LocalDate now = LocalDate.now();
        calendar.add(now, new Friend("Alex", 1));
        calendar.add(now.plusDays(1), new Friend("Kevin", 1));
        calendar.add(now.plusDays(2), new Friend("Peter", 1));

        // WHEN
        Collection<Friend> birthdays = calendar.values();

        // THEN
        assertEquals(3, birthdays.size(), "Calendar should contain three friends.");
    }
    
}
