import java.util.ArrayList;

public class SortedArraysCompare {


    // Problem 1
    public static boolean findMatch(int[] nuts_sizes, int[] bolts_sizes) {
        boolean isMatch = false;
        for (int i = 0; i < nuts_sizes.length; i++) {
            for (int j = 0; j < bolts_sizes.length; j++) {
                if (nuts_sizes[i] == bolts_sizes[j]) {
                    isMatch = true;
                }
            }
        }
        return isMatch;
    }


    public static void main(String[] args) {
        int[] nuts_sizes = new int[]{2, 1, 3, 14, 5};
        int[] bolts_sizes = new int[]{0, 12, 1, 13, 16};

        System.out.printf("Is there a match? %b", findMatch(nuts_sizes,bolts_sizes));;

    }
}