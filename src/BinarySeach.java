import java.util.Arrays;

public class BinarySeach {

    public static boolean searchRecursive(int[] numbers, int key, int left, int right){

        //if no match found return false
        if (left > right){
            return false;
        }

        //calculate midpoint of array
        int mid = left + (right - left) / 2;

        //if match found return true (base case
        if (numbers[mid] == key){
            return true;
        } else if (key < numbers[mid]){ // key is smaller than element at the midpoint, search to right and recalulate mid excluding previous mid
            return searchRecursive(numbers,key, left, mid -1);
        } else { // if key is larger than element at midpoint, search to the right, recalculate new mid excluding previous mid hence mid+1
            return searchRecursive(numbers,key, mid + 1, right);
        }
    }

    public static void main(String[] args) {
        int[] numbers = {7,8,9,0,10,11,12,14};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        int key = 1;
        int left = 0;
        int right = numbers.length;
        System.out.println(searchRecursive(numbers, key, left, right ));



    }


}
