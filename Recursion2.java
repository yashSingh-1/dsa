public class Recursion2 {
    public static void main(String[] args) {

        // int num = sumOfDigits(555);
        // int num = productOfDigits(555);
        // System.out.println(num);
        // reverse(592124);
        // int rev = reversing(151);
        // System.out.println("Reverse : " + rev);
        
        boolean isIt = palindrome(1514);
        System.out.println(isIt);
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

    static void reverse(int n){
        if( n < 1 ){
            return;
        }

        System.out.print(n % 10);
        reverse(n/10);
    }

    static int ans = 0;

    static int reversing(int n){
        if( n < 1){
            return n;
        }


        if(n >= 1){
            int temp = n % 10;

            ans = ans * 10 + temp;

            reversing(n / 10);

        }
        return ans;
    }

    static boolean palindrome(int n){
        if(n < 0){
            return true ;
        }

        int temp = n;

        boolean isIt = false;
        int reversed = reversing(n);
        if(temp == reversed){
            isIt = true;
        }
        // System.out.println(reversed);
        return isIt;
    }
    
}
