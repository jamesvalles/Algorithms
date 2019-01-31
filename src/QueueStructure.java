import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class QueueStructure {
    /* Queue uses for specific purposes FIFO. Worst case: Insertion - O(1); Deletion - O(1)
     *
     */
    public static void main(String[] args) {
        Queue<String> queue1 = new LinkedList<String>();

        queue1.add("Apple");
        queue1.add("Banana");
        queue1.add("Pie");
        queue1.add("Crackers");
        queue1.add("Ham");
        queue1.add("Water");
        queue1.add("Salad");

        System.out.println("Poll: " + queue1.poll()); //reveals head, and then deletes it.
        System.out.println(((LinkedList<String>) queue1).indexOf("Pie")); //index of element LIFO. Here index of Apple is 7 as it was added first. Salad was added last and is first.
        System.out.println(queue1.peek()); //head of queue, print Banana
        System.out.println(queue1.size()); //size of queue
        System.out.println("Before: " + queue1);
        ((LinkedList<String>) queue1).removeFirst();
        System.out.println("After: " + queue1);
        Object[] queueArray = queue1.toArray(); //converting Queue to array
        System.out.println("Printing Array: " + Arrays.toString(queueArray));
        System.out.println(queueArray.length); //array length
        System.out.println(queueArray[0]); //first element of array is "Apple"
        System.out.println("\n");
        System.out.println("\nIterating through Queue:");
        for(int i=0; i < queue1.size(); i++ ){
            System.out.println(((LinkedList<String>) queue1).get(i));
        }


    }
}
