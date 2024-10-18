import java.util.HashMap;
import java.util.Set;

public class Majority_element {
    public static void main(String[] args) {
        //HashMap<Integer,Integer> hash = new HashMap<>();
        int max=0;
        int [] arr = {1,2,1,2,1,2,1,2,1,2,6,1,2,4,2,2,2,2,2,2,2,2,2,};
        for(int i =0; i<arr.length;i++){
            int count =0;
            for(int j =i+1; j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>(arr.length/2)){
                max=count;
            }
        }
        System.out.println(arr.length);
        System.out.println(max);
    }



}
