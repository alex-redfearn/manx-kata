package manxkat.birthdaymemorization;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class BirthdayCalendar {
    
    private final Map<LocalDate, Friend> birthdayMap;

    public BirthdayCalendar() {
        birthdayMap = new HashMap<>();
    }

    public void add(LocalDate birthday, String name, int rating) {
        birthdayMap.put(birthday, new Friend(name, rating));
    }

    public Friend get(LocalDate key) {
        return birthdayMap.get(key);
    }

    public void replace(LocalDate key, String name, int rating) {
        Friend removed = birthdayMap.remove(key);

        if (removed != null) {
            birthdayMap.put(key, new Friend(name, rating));
        }
    }

    public Collection<Friend> values() {
        return birthdayMap.values();
    }

}
