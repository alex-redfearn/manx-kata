package manxkat.teque;

public class Teque<E> {

    /**
     * The triple ended queue is two double ended queues. 
     * Add middle inserts a value at the front of the second double ended queue.
     */
    private final MapDeque<E> left;
    private final MapDeque<E> right;

    public Teque() {
        this.left = new MapDeque<E>();
        this.right = new MapDeque<E>();
    }

    public int size() {
        return left.size() + right.size();
    }

    public void addFirst(E e) {
        this.left.putFirst(e);

        if (this.left.size() > this.right.size() + 1) {
            this.right.putFirst(this.left.removeLast());
        }
    }

    public void addMiddle(E e) {
        this.right.putFirst(e);

        if (this.right.size() > this.left.size()) {
            this.left.putLast(this.right.removeFirst());
        }
    }

    public void addLast(E e) {
        this.right.putLast(e);

        if (this.right.size() > this.left.size()) {
            this.left.putLast(this.right.removeFirst());
        }
    }

    public E get(int index) {
        if (index < this.left.size()) {
            return this.left.get(index);
        } else {
            return this.right.get(index - this.left.size());
        }
    }

}
