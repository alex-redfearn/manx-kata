package manxcat.teque;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import manxkata.teque.Teque;

public class TequeTest {

    @Test
    public void givenTequeOfLengthTwo_whenAddMiddle_thenItemAddedAtIndexOne() {
        // GIVEN
        Teque<Integer> teque = new Teque<>();
        teque.addFirst(1);
        teque.addLast(3);

        // WHEN
        teque.addMiddle(2);

        // THEN
        assertEquals(2, teque.get(1));
    }

    @Test
    public void givenTequeOfLengthEleven_whenAddMiddle_thenItemAddedAtIndexSix() {
        // GIVEN
        Teque<Integer> teque = new Teque<>();

        // WHEN
        teque.addLast(9);
        teque.addFirst(3);
        teque.addMiddle(5);

        assertEquals(3, teque.get(0));
        assertEquals(5, teque.get(1));
        assertEquals(9, teque.get(2));

        teque.addMiddle(1);

        // THEN
        assertEquals(5, teque.get(1));
        assertEquals(1, teque.get(2));
    }

}
