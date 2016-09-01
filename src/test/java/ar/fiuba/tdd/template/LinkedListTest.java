package ar.fiuba.tdd.template;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class LinkedListTest {
    @Test
    public void isEmptyReturnsTrueWhenItIsEmpty() throws Exception {
        LinkedList<Integer> list = new LinkedList<Integer>();
        assertTrue(list.isEmpty());
    }

    @Test
    public void isEmptyReturnsFalseWhenItHasOneElement() throws Exception {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.append(0);
        assertFalse(list.isEmpty());
    }

    @Test
    public void isEmptyReturnsTrueWhenItIsEmptyAfterBeingNotEmpty() throws Exception {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.append(0);
        list.pop();
        assertTrue(list.isEmpty());
    }

    @Test
    public void isEmptyReturnsFalseWhenItHasTwoElements() throws Exception {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.append(0);
        list.append(1);
        assertFalse(list.isEmpty());
    }

    @Test
    public void isEmptyReturnsFalseWhenItStillHasAnElementAfterAPop() throws Exception {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.append(0);
        list.append(1);
        list.pop();
        assertFalse(list.isEmpty());
    }

    @Test
    public void sizeReturns0WhenEmpty() throws Exception {
        LinkedList<Integer> list = new LinkedList<Integer>();
        assert (list.size() == 0);
    }

    @Test
    public void sizeReturns1WhenItHasOneElement() throws Exception {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.append(0);
        assert (list.size() == 1);
    }

    @Test
    public void sizeReturns2WhenItHasTwoElements() throws Exception {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.append(0);
        list.append(1);
        assert (list.size() == 2);
    }

    @Test
    public void sizeReturns1WhenItHasOneElementAfterAPop() throws Exception {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.append(0);
        list.append(1);
        list.pop();
        assert (list.size() == 1);
    }

    @Test
    public void sizeReturn0WhenItIsEmptyAfterTwoPops() throws Exception {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.append(0);
        list.append(1);
        list.pop();
        list.pop();
        assert (list.size() == 0);
    }

    @Test
    public void appendAndTopWithOneElement() throws Exception {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.append(0);
        assert (list.top() == 0);
    }

    @Test
    public void appendAndTopWithTwoElements() throws Exception {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.append(0);
        list.append(1);
        assert (list.top() == 0);
    }

    @Test
    public void appendAndTopAfterOnePop() throws Exception {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.append(0);
        list.pop();
        list.append(1);
        assert (list.top() == 1);
    }


    @Test(expected = AssertionError.class)
    public void topThrowsAssertionErrorWithEmptyList() throws Exception {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.top();
    }

    @Test(expected = AssertionError.class)
    public void popThrowsAssertionErrorWithEmptyList() throws Exception {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.pop();
    }

    @Test(expected = AssertionError.class)
    public void topThrowsAssertionErrorWithEmptyListAfterOnePop() throws Exception {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.append(0);
        list.pop();
        list.top();
    }

    @Test(expected = AssertionError.class)
    public void popThrowsAssertionErrorWithEmptyListAfterOnePop() throws Exception {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.append(0);
        list.pop();
        list.pop();
    }
}