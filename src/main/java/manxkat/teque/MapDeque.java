package manxkat.teque;

import java.util.HashMap;

public class MapDeque<E> extends HashMap<Integer, E> {

    /**
     * The index of the element at the head of the deque (which is the
     * element that would be removed by removeFirst()). The head grows
     * negatively.
     */
    transient int head = 0;

    /**
     * The index at which the next element would be added to the tail
     * of the deque. The tail grows posatively. 
     */
    transient int tail = -1;

    public void putFirst(E e) {
        head--;
        this.put(head, e);
    }

    public void putLast(E e) {
        tail++;
        this.put(tail, e);
    }

    public E removeFirst() {
        E e = this.remove(head);
        head++;
        return e;
    }

    public E removeLast() {
        E e = this.remove(tail);
        tail--;
        return e;
    }

    @Override
    public E get(Object key) {
        return super.get((int) key + this.head);
    }
    
}
