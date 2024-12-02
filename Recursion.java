public class Recursion {
    public static void main(String[] args) {
        // int[] arr = {1, 3, 5, 66, 77, 88};
        // int found = binary(arr, 77, 0, arr.length - 1);
        // System.out.println(found);
        // printCount(10 );
        // int fact = product(5);
        // System.out.println(fact);
        // factorial(5);
        int sum = summation(5);
        System.out.println(sum);
        
    }

    static int binary(int[] arr, int target, int s, int e){

        if(s > e){
            return -1;
        }

        int mid = s + (e - s)/ 2;

        if(target == arr[mid]){
            return mid;
        }

        if(target < arr[mid]){
            return binary(arr, target, s, mid - 1);
        }


        return binary(arr, target, mid + 1, e);
        
    }

    static void printCount(int n){
        if(n < 1){
            return;
        }
        System.out.println(n);
        printCount(n - 1);
        System.out.println(n);
    }

    static int product(int n){
        if(n < 1){
            return 1;
        }

        int fact = n * product(n - 1);

        return fact;
    } 

    static void factorial(int n){
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println(fact);
    } 

    static int summation(int n){
        if( n < 1 ){
            return 0;
        }

        if( n == 1){
            return 1;
        }

        int sum = n + summation(n - 1);
        return sum;
    }
}
