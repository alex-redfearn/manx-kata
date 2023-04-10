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

    public void add(LocalDate birthday, Friend friend) {
        birthdayMap.put(birthday, friend);
    }

    public Friend get(LocalDate key) {
        return birthdayMap.get(key);
    }

    public void replace(LocalDate key, Friend friend) {
        Friend removed = birthdayMap.remove(key);

        if (removed != null) {
            birthdayMap.put(key, friend);
        }
    }

    public Collection<Friend> values() {
        return birthdayMap.values();
    }

}
