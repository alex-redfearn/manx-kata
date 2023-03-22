package manxkat.teque;

import java.util.List;

public interface Deque<E> extends List<E> {
    
    void addFirst(E e);

    E removeFirst();

    void addLast(E e);

    E removeLast();

    E get(int index);

    int size();
    
}
