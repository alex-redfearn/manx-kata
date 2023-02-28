package manxcat.teque;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import manxkat.teque.ArrayTeque;

public class TequeTest {
    
    @Test
    public void givenTequeOfLengthTwo_whenAddMiddle_thenItemAddedAtIndexOne() {
        // GIVEN
        ArrayTeque<Integer> teque = new ArrayTeque<>();
        teque.add(1);
        teque.add(3);

        // WHEN
        teque.addMiddle(2);

        // THEN
        assertEquals(2, teque.toArray()[1]);
    }

    @Test
    public void givenTequeOfLengthEleven_whenAddMiddle_thenItemAddedAtIndexSix() {
        // GIVEN
        ArrayTeque<Integer> teque = new ArrayTeque<>();
        teque.add(0);
        teque.add(1);
        teque.add(2);
        teque.add(3);
        teque.add(4);
        teque.add(5);
        
        teque.add(7);
        teque.add(8);
        teque.add(9);
        teque.add(10);
        teque.add(11);
        teque.add(12);

        // WHEN
        teque.addMiddle(6);

        // THEN
        assertEquals(6, teque.toArray()[6]);
    }

}
