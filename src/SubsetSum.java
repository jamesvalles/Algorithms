public class SubsetSum {
    public static void main(String[] args) {
        int[] intArray = {100,500,500,200,300};
        int i = 0;
        int j = intArray.length - 1;
        int sum = 1000;
        int count = 0;
        while( i < j){
            if(intArray[i]+intArray[j]==sum) {
                System.out.println("Match.");
                count++;
            }
            else if(intArray[i] + intArray[j] < sum){
                i++;
                count++;
            }
            else{
                j--;
                count++;
            }
        }
                System.out.println(count);
    }
}
