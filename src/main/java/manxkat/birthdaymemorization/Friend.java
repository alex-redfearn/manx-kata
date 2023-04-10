package manxkat.birthdaymemorization;

public class Friend implements Comparable<Friend> {
    
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

	@Override
	public int compareTo(Friend o) {
		return this.name.compareTo(o.name);
	}
}
