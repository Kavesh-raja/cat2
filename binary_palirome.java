import java.util.Scanner;

public class binary_palirome {
    public static Boolean palinromeCheck(int bin){
        String str = Integer.toBinaryString(bin);
        int i =0; int j = str.length()-1;
        while (i<j){
            if (str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        if(palinromeCheck(inp.nextInt())==true){
            System.out.println("Palirome");
        }
        else {
            System.out.println("Not palirome");
        }
    }
}
