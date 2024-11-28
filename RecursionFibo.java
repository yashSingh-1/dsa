public class RecursionFibo {
    public static void main(String[] args) {
        // System.out.println(fibo(7));
        System.out.println(factorial(5));
        // System.out.println(RawFact(10));
        
    }

    static int fibo(int n){
        if( n < 2 ){
            return n;
        }

        int val = fibo(n - 1) + fibo(n - 2);
        return val;

    }

    static int factorial(int n){

        if(n == 0){
            return 1;
        }

        if(n < 2 && n > 0){
            return n;
        }
        // System.out.println(n);
        int val = 1;
        val = val * factorial(n-1);
        return val;
    }

    static int RawFact(int n){
        int val = 1;
        for (int i = 1; i <= n; i++) {
            val = val * i;
        }
        return val;
    }

    static void binary(int[] arr, int n){
        if(arr.length < 1){
            System.out.println(arr);
        }
        int start = 0;
        int end = arr.length - 1;

        int mid = start + (end - start) / 2;
        
    }
}
