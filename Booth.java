import java.util.Scanner;

public class Booth {
    public static int multiply(int n1, int n2){
        int m =n1;
        int r=n2;
        int a=n1;
        int s=-n1;
        int p=0;

        int Count = Integer.SIZE;
        System.out.println(Count);

        while (Count>0){
            if((r&1)==1){
                p=p+a;
                s=s+m;
            }
            a<<=1;
            s<<=1;
            Count--;
            r>>=1;
        }
        return p;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println(multiply(inp.nextInt(),inp.nextInt()));
    }
}
