import java.util.ArrayList;
import java.util.Scanner;

public class Leader {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String str = inp.nextLine();
        ArrayList<Integer> arr = new ArrayList<>();
        int max = Integer.parseInt(Character.toString(str.charAt(str.length()-1)));
        arr.add(max);
        System.out.println(max);
        for(int i= str.length()-2;i>=0;i--){
            int temp = Integer.parseInt(Character.toString(str.charAt(i)));
            if(temp>max){
                arr.add(temp);
                max = temp;
            }
        }
        System.out.println(arr);
    }
}
