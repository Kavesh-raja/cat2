import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Hour_Glass {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int R = inp.nextInt();
        int C = inp.nextInt();
        int[][] arr= new int [R][C];
        for(int i=0;i<R;i++){
            for(int j =0;j<C;j++){
                arr[i][j] = inp.nextInt();
            }
        }
        //System.out.println(Arrays.toString(arr));
        int res = findMaxSum(arr,R,C);
        System.out.println(res);
    }
    public static int findMaxSum(int[][] ary,int R, int C){
        int max =0;
        if((R<3) || (C<3)){
            System.out.println("Not possible");
            System.exit(0);
        }
        for(int i =0;i<R-2;i++){
            for(int j=0; j<C-2;j++){
                int sum = (ary[i][j]+ary[i+1][j]+ary[i+2][j]+ary[i+1][j+1]+ary[i][j+2]+ary[i+1][j+2]+ary[i+2][j+2]);
                max = Math.max(max,sum);
            }
        }
        return max;
    }
}
