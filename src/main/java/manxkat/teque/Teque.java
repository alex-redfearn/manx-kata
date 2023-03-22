package manxkat.teque;

public interface Teque<E> {

    void addFirst(E e);

    void addMiddle(E e);

    void addLast(E e);

    E get(int index);

    int size();

}
