package manxkat.teque;

import java.util.Deque;

public interface Teque<E> extends Deque<E> {

    void addMiddle(E e);
    E get(int index);

}
