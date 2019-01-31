public class DLinkedNode {

    private int data;
    public DLinkedNode previous;
    public DLinkedNode next;

    public DLinkedNode(int data) {
        this.data = data;
        previous = null;
        next = null;
    }

    public DLinkedNode(DLinkedNode previous, int data, DLinkedNode next) {
        this.data = data;
        this.previous = previous;
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public DLinkedNode getPrevious() {
        return previous;
    }

    public DLinkedNode getNext() {
        return next;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setPrevious(DLinkedNode previous) {
        this.previous = previous;
    }

    public void setNext(DLinkedNode next) {
        this.next = next;
    }
}
