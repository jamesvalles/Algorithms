import java.util.HashMap;

//Algorithm provides x+y = 1000 in O(n) when array is unsorted. Must ensure hashing is done properly. 

public class XYHash {

    public static void main(String[] args) {


        int target = 1000;

        int[] intArray = {100,1000,200,500,300};
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i = 0; i < intArray.length; i++){

           if(map.containsKey(intArray[i])){
               System.out.println("We have a match.");
               break;
           }else{
               map.put(target - intArray[i], intArray[i]);

           }
        }


    }
}
