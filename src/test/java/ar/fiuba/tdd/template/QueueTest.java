package ar.fiuba.tdd.template;

import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {
    @Test
    public void isEmptyReturnsTrueWhenItIsEmpty() throws Exception {
        Queue<Integer> queue = new Queue<Integer>();
        assertTrue(queue.isEmpty());
    }

    @Test
    public void isEmptyReturnsFalseWhenItHasOneElement() throws Exception {
        Queue<Integer> queue = new Queue<Integer>();
        queue.add(0);
        assertFalse(queue.isEmpty());
    }

    @Test
    public void isEmptyReturnsTrueWhenItIsEmptyAfterBeingNotEmpty() throws Exception {
        Queue<Integer> queue = new Queue<Integer>();
        queue.add(0);
        queue.remove();
        assertTrue(queue.isEmpty());
    }

    @Test
    public void isEmptyReturnsFalseWhenItHasTwoElements() throws Exception {
        Queue<Integer> queue = new Queue<Integer>();
        queue.add(0);
        queue.add(1);
        assertFalse(queue.isEmpty());
    }

    @Test
    public void isEmptyReturnsFalseWhenItStillHasAnElementAfterARemove() throws Exception {
        Queue<Integer> queue = new Queue<Integer>();
        queue.add(0);
        queue.add(1);
        queue.remove();
        assertFalse(queue.isEmpty());
    }

    @Test
    public void sizeReturns0WhenEmpty() throws Exception {
        Queue<Integer> queue = new Queue<Integer>();
        assert (queue.size() == 0);
    }

    @Test
    public void sizeReturns1WhenItHasOneElement() throws Exception {
        Queue<Integer> queue = new Queue<Integer>();
        queue.add(0);
        assert (queue.size() == 1);
    }

    @Test
    public void sizeReturns2WhenItHasTwoElements() throws Exception {
        Queue<Integer> queue = new Queue<Integer>();
        queue.add(0);
        queue.add(1);
        assert (queue.size() == 2);
    }

    @Test
    public void sizeReturns1WhenItHasOneElementAfterARemove() throws Exception {
        Queue<Integer> queue = new Queue<Integer>();
        queue.add(0);
        queue.add(1);
        queue.remove();
        assert (queue.size() == 1);
    }

    @Test
    public void sizeReturn0WhenItIsEmptyAfterTwoRemoves() throws Exception {
        Queue<Integer> queue = new Queue<Integer>();
        queue.add(0);
        queue.add(1);
        queue.remove();
        queue.remove();
        assert (queue.size() == 0);
    }

    @Test
    public void addAndTopWithOneElement() throws Exception {
        Queue<Integer> queue = new Queue<Integer>();
        queue.add(0);
        assert (queue.top() == 0);
    }

    @Test
    public void addAndTopWithTwoElements() throws Exception {
        Queue<Integer> queue = new Queue<Integer>();
        queue.add(0);
        queue.add(1);
        assert (queue.top() == 0);
    }

    @Test
    public void addAndTopAfterOneRemove() throws Exception {
        Queue<Integer> queue = new Queue<Integer>();
        queue.add(0);
        queue.remove();
        queue.add(1);
        assert (queue.top() == 1);
    }


    @Test(expected = AssertionError.class)
    public void topThrowsAssertionErrorWithEmptyQueue() throws Exception {
        Queue<Integer> queue = new Queue<Integer>();
        queue.top();
    }

    @Test(expected = AssertionError.class)
    public void removeThrowsAssertionErrorWithEmptyQueue() throws Exception {
        Queue<Integer> queue = new Queue<Integer>();
        queue.remove();
    }

    @Test(expected = AssertionError.class)
    public void topThrowsAssertionErrorWithEmptyQueueAfterOneRemove() throws Exception {
        Queue<Integer> queue = new Queue<Integer>();
        queue.add(0);
        queue.remove();
        queue.top();
    }

    @Test(expected = AssertionError.class)
    public void removeThrowsAssertionErrorWithEmptyQueueAfterOneRemove() throws Exception {
        Queue<Integer> queue = new Queue<Integer>();
        queue.add(0);
        queue.remove();
        queue.remove();
    }
}