public class RecursionFibo {
    public static void main(String[] args) {
        System.out.println(fibo(7));
        
    }

    static int fibo(int n){
        if( n < 2 ){
            return n;
        }

        int val = fibo(n - 1) + fibo(n - 2);
        return val;

    }
}
