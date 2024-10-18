import java.util.Scanner;

public class Block_Swap {
    public static String Rotate(int a,int rot ){
        String Str = Integer.toString(a);
        int red_rot = Str.length()%2;
        String last = "";
        for(int i=red_rot;i<Str.length();i++){
            last = last+Str.charAt(i);
        }
        //String first="";
        for (int i =0; i<red_rot;i++){
            last = last+Str.charAt(i);
        }
        return last;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println(Rotate(inp.nextInt(),inp.nextInt()));
    }
}
