package nguyenxuannghia_20001954.lab9.part1.ex1;

public class MyLinkedList extends MyAbstractList {

    private MyLinkedListNode head;
    private int size;

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    private MyLinkedListNode getNodeByIndex(int index) {
        MyLinkedListNode current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current;
    }
    @Override
    public void add(Object o) {
        add(o, size);
    }

    @Override
    public void add(Object o, int index) {
        checkBoundaries(index, size);
        if (index == 0) {
            head = new MyLinkedListNode(o, head);
        } else {
            MyLinkedListNode current = getNodeByIndex(index - 1);
            current.setNext(new MyLinkedListNode(o, current.getNext()));
        }
        size++;
    }

    @Override
    public void remove(int index) {
        checkBoundaries(index, size);

        MyLinkedListNode current = head;

        if (index == 0) {
            current = null;
        } else {
            MyLinkedListNode previous = head;

            for (int i = 0; i < index; i++) {
                previous = current;
                current = current.getNext();
            }

            if (index == size - 1) {
                previous.setNext(null);
            } else {
                previous.setNext(current.getNext());
            }
        }
        size--;
    }

    @Override
    public Object get(int index) {
        checkBoundaries(index, size - 1);
        return getNodeByIndex(index).getPayload();
    }

    @Override
    public int size() {
        return size;
    }
}
