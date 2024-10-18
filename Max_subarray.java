public class Max_subarray {
    public static void main(String[] args) {
        int  arr[] = {1,2,3,-1,2,3,1,3};
        int max = 0;
        int start=0;
        int end=0;
        for (int i =0; i<arr.length;i++){
            int k =arr[i] ;
            for (int j = i+1; j<arr.length;j++){
                k = k*arr[j] ;
                if (k>max){
                    max = k;
                    start = i;
                    end = j;
            }

            }
        }
        System.out.println(max+" "+start+" "+end);
    }
}
