import java.util.Scanner;

public class Euclid {
    public static int GCG(int a, int b){
        if(b==0){
            return a;
        }
        else {
            return GCG(b,a%b);
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println(GCG(inp.nextInt(), inp.nextInt()));
    }
}
