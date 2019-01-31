
import java.util.Arrays;


//Quadratic Time, sorted array
public class ThreeSum {

    public static void main(String[] args) {
        int[] numbers = new int[]{10, 20, 15, 25, 35};
        int target =75;
        boolean isMatch = false;

        Arrays.sort(numbers); // sort elements in array
            int i = 0;
        //for(int i = 0; i < numbers.length - 2; i++ ) {
            int j = i + 1; // element at beginning of array + 1
            int k = numbers.length - 1; //element at end of array
            int partial_target = target - numbers[i]; //our target -  first element of array (we need to find two digits that will add up to this

            while (j < k ) {

                int partial_sum = numbers[j] + numbers[k]; // did we find two digits to add up to partial sum

                if (partial_sum  == partial_target) { // if they add we have a match
                    isMatch = true;
                    System.out.printf("Match found! target[%d] %d, %d, %d \n", target, numbers[i], numbers[j], numbers[k]);
                    break;
                } else if (partial_sum > partial_target) {
                    k--; // if we go over our target, we need to decrement and find another high value that will add up
                    continue;
                } else {
                    j++; // if we are under we can continue to increment with high value
                    continue;
                }


        }
    }
}
