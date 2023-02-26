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

        int middle = calculateMiddle();
        addMiddle(Arrays.copyOf(elements, middle), e, Arrays.copyOfRange(elements, middle, this.size()));
    }

    private int calculateMiddle() {
        return (this.size() + 1) / 2;
    }

    private void addMiddle(E[] start, E middle, E[] end) {
        this.clear();
        this.addAll(new ArrayTeque<>(Arrays.asList(start)));
        this.addLast(middle);
        this.addAll(new ArrayTeque<>(Arrays.asList(end)));
    }
}
