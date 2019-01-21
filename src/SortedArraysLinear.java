import java.util.ArrayList;

public class SortedArraysLinear {


    // Problem 1
    public static void findMatch(int[] nuts_sizes, int[] bolts_sizes) {
        for (int i = 0, j = 0; i < nuts_sizes.length; ) {
            if(nuts_sizes[i] > bolts_sizes[j]) {
                j++;
                continue;
            } else if (nuts_sizes[i] < bolts_sizes[j]) {
                i++;
                continue;
            } else  {
                System.out.println("Match found.");
                break;
                }
            }

        }

    public static void main(String[] args) {
        int[] nuts_sizes = new int[]{0, 1, 2, 3, 17};
        int[] bolts_sizes = new int[]{4, 12, 13, 15, 18};

        findMatch(nuts_sizes, bolts_sizes);
    }
}