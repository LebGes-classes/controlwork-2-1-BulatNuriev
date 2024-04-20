package krStack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StackTest {

    public CustomStack<Integer> stack;

    @Before
    public void setUp() {
        stack = new CustomStack<Integer>();
    }

    @Test
    public void testPushAndPeek() {
        stack.push(1);
        assertEquals(1, stack.peek());
    }

    @Test
    public void testPop() {
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.pop());
    }
}
