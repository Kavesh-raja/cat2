import java.util.*;
public class katsubha {
    public static long kart(long x, long y){
        if (x < 10 || y<10){
            return x*y;
        }
        int n = Math.max(Long.toString(x).length(),Long.toString(y).length() );
        int half = (n+1)/2;
        long a = x / (long) (Math.pow(10,half));
        long b = x % (long) (Math.pow(10,half));
        long c = x / (long) (Math.pow(10,half));
        long d = x % (long) (Math.pow(10,half));

        long ac = kart(a,c);
        long bd = kart(b,d);
        long adbc = kart(a+b, c+d) - ac -bd;
        return (long) (ac * Math.pow(10,2*half) + adbc * Math.pow(10,half) + bd);
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        long r = inp.nextLong();
        long t = inp.nextLong();
        long prd = kart(r,t);
        System.out.println(prd);
    }
}
