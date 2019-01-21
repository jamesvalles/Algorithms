import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] numbers = new int[]{1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer> copy = new ArrayList<>();

        for(int i = numbers.length -1 ; i >= 0  ; i--){
            System.out.println(numbers[i]);
            copy.add(numbers[i]);

        }
        System.out.println(copy.toString());
    }
}
