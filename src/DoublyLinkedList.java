public class DoublyLinkedList {
    private DLinkedNode head;
    private int size;


    public DoublyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    //Add node to the front
    public void addToFront(int data) {

        //check if there is a head, if not create one
        if (head == null) {
            head = new DLinkedNode(null, data, null);
        } else {
            DLinkedNode newNode = new DLinkedNode(null, data, head);
            head.previous = newNode;
            head = newNode;
        }
        size++;
    }

    // Add node at the very end
    public void addToBack(int data) {

        //check if there is a head (empty list) if not create one
        if (head == null) {
            head = new DLinkedNode(null, data, null);
        }

        DLinkedNode current = head;

        //traverse to end of list, set last element in list to current
        while(current.next != null){
          current = current.next;
        }
        //create node and set to end of list
        current.next = new DLinkedNode(current, data, null);
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


    public void print() {
        DLinkedNode current = head;
        while (current != null) {
            System.out.println(current.getData());
            current = current.next;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addToFront(34);
        list.addToFront(67);
        list.addToFront(38);
        list.addToFront(39);
        list.addToBack(39);



        list.print();
        System.out.println("Head of list: " + list.head.getData());
        System.out.println("Next item in list: " + list.head.next.getData());
        System.out.println("Size of this LinkedList: " + list.size);


    }

}
