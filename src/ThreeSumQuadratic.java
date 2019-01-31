
import java.util.Arrays;


//Quadratic Time, sorted array
public class ThreeSumQuadratic {

    public static void main(String[] args) {
        int[] numbers = new int[]{10, 20, 15, 25, 35};
        int target = 55;
        boolean isMatch = false;

        Arrays.sort(numbers); // sort elements in array


        int j = 0; // element at beginning of array + 1
        int k = numbers.length - 1; //element at end of array

        for (int i = 0; i < numbers.length; i++) {
            int newTarget = target - numbers[i];

            while (j < k && i < numbers.length && k > 0) {

                int sum = numbers[j] + numbers[k]; // did we find two digits to add up to partial sum

                if (sum == newTarget) { // if they add we have a match
                    isMatch = true;
                    System.out.printf("Match found! Target[%d] %d, %d, %d \n", target, numbers[i], numbers[j], numbers[k]);
                    break;
                } else if (sum > newTarget) {
                    k--; // if we go over our target, we need to decrement and find another high value that will add up
                    continue;
                } else {
                    j++; // if we are under we can continue to increment with high value
                    continue;
                }
            }
        }
    }
}

