package ar.fiuba.tdd.template;

public class Queue<T> implements InterfaceQueue<T> {
    private LinkedList<T> linkedList = new LinkedList<T>();

    @Override
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    @Override
    public int size() {
        return linkedList.size();
    }

    //Adds one item.
    @Override
    public void add(T data) {
        linkedList.append(data);
    }

    //Returns first item, throws AssertionError if empty.
    @Override
    public T top() {
        return linkedList.top();
    }

    //Removes first item, throws AssertionError if empty.
    @Override
    public void remove() {
        linkedList.pop();
    }
}
