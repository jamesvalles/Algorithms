public class DoublyLinkedList {
    private DLinkedNode head;
    private int size;


    public DoublyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void addNode(int data) {

        if (head == null) {
            head = new DLinkedNode(null, data, null);
        } else {
            DLinkedNode newNode = new DLinkedNode(null, data, head);
            head.previous = newNode;
            head = newNode;
        }
        size++;
    }


    public int getSize() {
        return size;
    }

    public DLinkedNode getHead() {
        return head;
    }

    public boolean isEmpty() {
        return head == null;
    }


    @Override
    public String toString() {
        return super.toString();
    }

    public void print() {
        DLinkedNode current = head;
        while (current != null) {
            System.out.println(current.getData());
            current = current.next;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addNode(34);
        list.addNode(67);
        list.addNode(38);
        list.addNode(39);

        list.print();
        System.out.println("Head of list: " + list.head.getData());
        System.out.println("Next item in list: " + list.head.next.getData());
        System.out.println("Size of this LinkedList: " + list.size);
    }

}
