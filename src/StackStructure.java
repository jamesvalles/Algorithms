import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class StackStructure {

    /* Stack uses for specific purposes. Worst case: Insertion - O(1); Deletion - O(1)
     *
     */
    public static void main(String[] args) {
        Stack<String> stack1 = new Stack<String>();
        stack1.push("Apple");
        stack1.push("Banana");
        stack1.push("Pie");
        stack1.push("Crackers");
        stack1.push("Ham");
        stack1.push("Water");
        stack1.push("Salad");

        System.out.println(stack1.search("Apple")); //index of element LIFO. Here index of Apple is 7 as it was added first. Salad was added last and is first.
        System.out.println(stack1.empty()); //stack is not empty
        System.out.println(stack1.peek()); //last in stack
        System.out.println(stack1.indexOf("Ham")); //returns index of
        System.out.println(stack1.size()); //size of stack
        System.out.println("Before: " + stack1);
        stack1.insertElementAt("Grapes", 3); //insert element at the following index
        System.out.println("After: " + stack1);
        stack1.pop(); //salad is the first out (Last in first out).
        Object[] stackArray = stack1.toArray(); //converting stack to array
        System.out.println("Printing Array: " + Arrays.toString(stackArray));
        System.out.println(stackArray.length); //array length
        System.out.println(stackArray[0]); //first element of array is "Apple"
        System.out.println("\n");
        System.out.println("\nIterating through Stack:");
        for(int i=0; i < stack1.size(); i++ ){
            System.out.println(stack1.get(i));
        }


    }
}

