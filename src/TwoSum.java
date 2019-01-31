import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Hashtable;

//Linear time, sorted array
public class TwoSum {

    public static void main(String[] args) {
        int[] numbers = new int[]{1, 3, 10, 15, 25};
        int target = 40;


        int i = 0; //start i at 0 index
        int j = numbers.length -1 ; //start j at ..length-1 index


        while(j > 0 && i < numbers.length - 1  && i < j){


            int sum = numbers[i] + numbers[j]; //what is the sum
            if( sum == target){ //if sum equals target
                System.out.println("Match found.");
                break;
            }else if (sum < target){ //if sum is smaller than target increment i
                i++;
                continue;
            } else if (sum > target){ //if sum is greater than target decrement j
                j--;
                continue;
            }else {}


        }

    }
}