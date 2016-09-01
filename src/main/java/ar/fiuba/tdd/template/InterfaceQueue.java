package ar.fiuba.tdd.template;

/* This interface can be considered the guideline of TP0.
The queue hereby laid out must be implemented with unit tests and the following restrictions:
    · One statement per method (secondary requirement).
    · The queue must be implemented using a linked list.
    · remove() and top() must throw AssertionError if queue is empty.
    · The implementation must not use conditional statements (if, case/switch, ternary operator).
    · The implementation must not use any available libraries (e.g. java.util.LinkedList, java.util.ArrayList).
    · No warnings (not even checkstyle warnings).*/

public interface InterfaceQueue<T> {
    boolean isEmpty();

    int size();

    //Adds one item.
    void add(T item);

    //Returns first item, throws AssertionError if empty.
    T top();

    //Removes first item, throws AssertionError if empty.
    void remove();
}
