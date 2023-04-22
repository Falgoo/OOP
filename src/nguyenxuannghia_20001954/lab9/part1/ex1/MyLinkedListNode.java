package nguyenxuannghia_20001954.lab9.part1.ex1;

public class MyLinkedListNode {

    private Object payload;
    private MyLinkedListNode next;

    public MyLinkedListNode(Object payload) {
        this.payload = payload;
    }

    public MyLinkedListNode(Object payload, MyLinkedListNode next) {
        this.payload = payload;
        this.next = next;
    }

    public Object getPayload() {
        return payload;
    }

    public void setPayload(Object dataValue) {
        this.payload = dataValue;
    }

    public MyLinkedListNode getNext() {
        return next;
    }

    public void setNext(MyLinkedListNode nextValue) {
        this.next = nextValue;
    }
}
