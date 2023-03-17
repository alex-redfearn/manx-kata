package manxkat.teque;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayTeque<E> extends ArrayDeque<E> implements Teque<E> {

    private final ArrayDeque<E> arrayDeque;

    public ArrayTeque() {
        super();
        this.arrayDeque = new ArrayDeque<E>();
    }

    @Override
    public int size() {
        return super.size() + arrayDeque.size();
    }

    @Override
    public void addFirst(E e) {
        super.addFirst(e);

        if (super.size() > this.arrayDeque.size() + 1) {
            this.arrayDeque.addFirst(super.removeLast());
        }
    }

    public void addMiddle(E e) {
        this.arrayDeque.addFirst(e);

        if (this.arrayDeque.size() > super.size()) {
            super.addLast(this.arrayDeque.removeFirst());
        }
    }

    @Override
    public void addLast(E e) {
        this.arrayDeque.addLast(e);

        if (this.arrayDeque.size() > super.size()) {
            super.addLast(this.arrayDeque.removeFirst());
        }
    }

    @Override
    public E get(int index) {
        if (index < super.size()) {
            return iterateToIndex(super.iterator(), index);
        } else {
            return iterateToIndex(this.arrayDeque.iterator(), index - super.size());
        }
    }

    private E iterateToIndex(Iterator<E> iterator, int index) {
        int count = 0;
        while (iterator.hasNext()) {
            E e = iterator.next();

            if (count == index) {
                return e;
            }

            count++;
        }
        return null;
    }
}
