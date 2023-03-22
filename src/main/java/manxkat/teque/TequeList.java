package manxkat.teque;

public class TequeList<E> implements Teque<E> {

    private final DequeList<E> left;
    private final DequeList<E> right;

    public TequeList() {
        this.left = new DequeList<E>();
        this.right = new DequeList<E>();
    }

    @Override
    public int size() {
        return left.size() + right.size();
    }

    @Override
    public void addFirst(E e) {
        this.left.addFirst(e);

        if (this.left.size() > this.right.size() + 1) {
            this.right.addFirst(this.left.removeLast());
        }
    }

    @Override
    public void addMiddle(E e) {
        this.right.addFirst(e);

        if (this.right.size() > this.left.size()) {
            this.left.addLast(this.right.removeFirst());
        }
    }

    @Override
    public void addLast(E e) {
        this.right.addLast(e);

        if (this.right.size() > this.left.size()) {
            this.left.addLast(this.right.removeFirst());
        }
    }

    @Override
    public E get(int index) {
        if (index < this.left.size()) {
            return this.left.get(index);
        } else {
            return this.right.get(index - this.left.size());
        }
    }
    
}
