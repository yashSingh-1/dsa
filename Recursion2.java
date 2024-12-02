public class Recursion2 {
    public static void main(String[] args) {

        // int num = sumOfDigits(555);
        int num = productOfDigits(555);
        System.out.println(num);
        
    }

    static int sumOfDigits(int n){
        if(n <= 1){
            return 0;
        }

        // int remainder = n / 10;
        int sum = 0;
        
        if(n > 1){
            int first  = n % 10;
            sum += first + sumOfDigits(n / 10);
        }

        return sum;

    }

    static int productOfDigits(int n){
        if(n <= 1){
            return 1;
        }

        int sum = 1;
        
        if(n > 1){
            int first  = n % 10;
            sum *= first * productOfDigits(n / 10);
        }

        return sum;

    }
}
