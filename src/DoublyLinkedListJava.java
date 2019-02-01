import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class DoublyLinkedListJava {


    //Linked List using Java built in library, including ListIterator and Iterator
    public static void main(String[] args) {
        LinkedList<String> groceryList = new LinkedList<>();
        groceryList.add("Pie");
        groceryList.add("Pepper");
        groceryList.add("Gum");
        groceryList.add("Mango");
        groceryList.add("Chocolate");
        groceryList.add("Cake");

        System.out.println(groceryList);

        ListIterator grocery = groceryList.listIterator(1);

        System.out.println("\n");
        System.out.println("\nList iterator starting a specific index. \n");
        while(grocery.hasNext()){
            System.out.println(grocery.next());
        }


       Iterator groceryReverse =groceryList.descendingIterator();

        System.out.println("\nList in reverse. \n");
        while (groceryReverse.hasNext()){
            System.out.println(groceryReverse.next());
        }
        System.out.println("\n");

        groceryList.removeLast();
        System.out.println("Size: " + groceryList.size());



    }
}
