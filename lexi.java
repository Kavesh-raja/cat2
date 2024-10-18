import java.util.Scanner;

public class lexi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String str = inp.nextLine();

        int len = str.length();
        int max = 26;
        int [] frq = new int[max];
        for(int i = 0; i<str.length();i++){
            frq[str.charAt(i)- 'a']++;
        }
        if(LexiCheck(frq,len,max) == false){
            System.out.println("Not Lex");
            System.exit(0);
        }
        String mid = "";
        for(int i =0;i<max;i++){
            if(frq[i]%2!=0){
                frq[i]--;
                mid = mid+ (char)(i+ 'a');
            }
        }
        String start ="";
        String end = "";

        for(int i =0;i<max;i++){
            if(frq[i]!=0){
                String temp ="";
                //char chr = (char) (i+'a');
                for (int j =0;j<frq[i]/2;j++){
                    char chr = (char) (i+'a');
                    //temp = temp+Character.getName(chr);
                    temp=temp+chr;
                }
                start = start+temp;
                end = temp+end;
            }
        }
        System.out.println(start+mid+end);

    }
    public static boolean LexiCheck(int [] fre, int length, int max) {
        int odd_count = 0;

        for (int i = 0; i < max; i++) {
            if (fre[i] % 2 == 1) {
                odd_count++;
            }
        }
        if (odd_count == 1 || odd_count == 0) {
            return true;
        }
        return false;
    }
}
