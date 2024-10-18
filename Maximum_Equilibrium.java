public class Maximum_Equilibrium {
    public static void main(String[] args) {
        int [] arr = {2,3,3,8};
        int total_sum = 0;
        for(int i :arr){
            total_sum = total_sum+i;
        }
        int lhs =0;
        int rhs =total_sum;
        int max_sum = 0;
        for(int i =0; i<arr.length;i++){
            lhs = lhs+arr[i];
            rhs = rhs-arr[i];

            if(lhs==rhs && lhs>max_sum){
                max_sum = lhs;
            }
        }
        System.out.println(max_sum);
    }
}
