import java.util.Scanner;

public class swap_nibbles {
    public static int swap(int k){
        return ((k & 0x0F)<<4 | (k & 0xF0)>>4);
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int input = inp.nextInt();
        System.out.println(swap(input));

    }
}
 //(k & 0x0F)<<4 | (k & 0xF0)>>4)