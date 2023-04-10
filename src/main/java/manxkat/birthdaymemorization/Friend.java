package manxkat.birthdaymemorization;

import java.util.Comparator;

public class Friend {
    
    private final String name;
    private final int rating;

    public Friend(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    public String getName() {
        return this.name;
    }

    public int getRating() {
        return this.rating;
    }

    static final Comparator<Friend> NAME = new Comparator<Friend>() {
        public int compare(Friend f1, Friend f2) {
            return f1.getName().compareTo(f2.getName());
        }
    };

    static final Comparator<Friend> RATING = new Comparator<Friend>() {
        public int compare(Friend f1, Friend f2) {
            return Integer.compare(f1.getRating(), f2.getRating());
        }
    };
    
}
