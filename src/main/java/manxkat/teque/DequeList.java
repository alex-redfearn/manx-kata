package manxkat.teque;

import java.util.ArrayList;

public class DequeList<E> extends ArrayList<E> implements Deque<E> {

    @Override
    public void addFirst(E e) {
        this.add(0, e);
    }

    @Override
    public void addLast(E e) {
        this.add(e);
    }

    @Override
    public E removeFirst() {
        E e = this.get(0);
        this.remove(0);
        return e;
    }

    @Override
    public E removeLast() {
        int index = this.size() - 1;

        E e = this.get(index);
        this.remove(index);
        return e;
    }
    
}
