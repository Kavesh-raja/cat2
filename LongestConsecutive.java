import java.util.Scanner;

public class LongestConsecutive {
    public static int flip(int num){
        String num2 = Integer.toBinaryString(num);
        int current = 0;
        int previous =0;
        int max =0;
        for(int i =0; i<num2.length();i++){
            if(num2.charAt(i)=='1'){
                current++;
            }
            else{
                max = Math.max(max,current+previous+1);
                previous=current;
                current=0;
            }

        }
        max = Math.max(max,current+previous+1);
        return max;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println(flip(inp.nextInt()));
    }
}
