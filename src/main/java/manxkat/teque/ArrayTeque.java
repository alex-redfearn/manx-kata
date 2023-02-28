package manxkat.teque;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collection;

public class ArrayTeque<E> extends ArrayDeque<E> implements Teque<E> {

    public ArrayTeque() {
        super();
    }

    public ArrayTeque(Collection<? extends E> c) {
        super(c);
    }

    @Override
    public void addMiddle(E e) {
        if (e == null)
            throw new NullPointerException();

        @SuppressWarnings("unchecked")
        E[] elements = (E[]) this.toArray();

        int index = calculateMiddleIndex();
        E[] array = shift(elements, index, 1);
        array[index] = e;

        this.clear();
        this.addAll(new ArrayTeque<>(Arrays.asList(array)));
    }

    private int calculateMiddleIndex() {
        return this.size() / 2;
    }

    private E[] shift(E[] array, int from, int offset) {
        E[] result = increaseCapacity(array, offset);
        System.arraycopy(result, from, result, from + offset, array.length - from);

        return result;
    }

    private E[] increaseCapacity(E[] array, int increase) {
        return Arrays.copyOf(array, this.size() + increase);
    }
}
