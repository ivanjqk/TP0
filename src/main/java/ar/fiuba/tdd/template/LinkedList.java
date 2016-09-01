package ar.fiuba.tdd.template;

public class LinkedList<T> {

    //The last node of the list, exists always (can't be removed, acts like the '/0' at the end of a "C char[]").
    private class NullNode<T> {
        public int accumulateSize() {
            return 0; //Triggers the accumulation rollback.
        }

        public T getData() {
            throw new AssertionError(); //Nothing to return.
        }

        public NullNode<T> getNext() {
            throw new AssertionError(); //Nothing to return.
        }

        public void append(DataNode<T> tail, FirstNode<T> previous) {
            previous.insertNext(tail);
        }
    }

    //The first node of the list, exists always (can't be removed).
    private class FirstNode<T> extends NullNode<T> {
        private NullNode<T> head = new NullNode<T>();

        public int accumulateSize() {
            return head.accumulateSize();
        }

        public T getData() {
            return head.getData();
        }

        public NullNode<T> getNext() {
            return head;
        }

        public void append(DataNode<T> tail) {
            head.append(tail, this);
        }

        public void insertNext(DataNode<T> next) {
            head = next;
        }

        public void pop() {
            head = head.getNext();
        }
    }

    //The nodes of the list that hold data, there can be any amount including none (they can be added and removed).
    private class DataNode<T> extends FirstNode<T> {
        private T data;

        DataNode(T dataValue) {
            data = dataValue;
        }

        public int accumulateSize() {
            return getNext().accumulateSize() + 1; //The only node that counts for the size of the LinkedList.
        }

        public T getData() {
            return data;
        }

        public void append(DataNode<T> tail, FirstNode<T> previous) {
            getNext().append(tail, this);
        }
    }

    private FirstNode<T> first = new FirstNode<T>();

    public boolean isEmpty() {
        return first.accumulateSize() == 0;
    }

    public int size() {
        return first.accumulateSize();
    }

    public void append(T data) {
        first.append(new DataNode<T>(data));
    }

    public T top() {
        return first.getData();
    }

    public void pop() {
        first.pop();
    }
}
