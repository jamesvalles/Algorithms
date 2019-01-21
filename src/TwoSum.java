import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Hashtable;

//Linear time, sorted array
public class TwoSum {

    public static void main(String[] args) {
        int s = 15;
        int[] numbers = new int[]{1, 3, 10, 15, 25};
        int target = 40;
        int i = 0;
        int j = numbers.length -1 ;


        while(i < numbers.length - 1  && j > 0 ){
            int sum = numbers[i] + numbers[j];
            if( sum == target){
                System.out.println("2-SUM Match found.");
                break;
            }else if (sum < target){
                i++;
                continue;
            } else if (sum > target){
                j--;
                continue;
            }else {}


        }

    }
}