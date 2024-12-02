public class palindrome2 {
    public static void main(String[] args) {
        // boolean isIT = palindrome(1234321);
        // System.out.println(isIT);
        int howmany = findZeros(1000001000);
        System.out.println(howmany);
    }

    static boolean palindrome(int n){
        boolean isIt = false;
        int temp = n;
        int newNum = 0;
        while(n > 0){
            newNum = newNum * 10 + n % 10;
            n = n / 10;
        }
        System.out.println(temp + " and its rev is: " + newNum);

        if(temp == newNum){
            isIt = true;
        }

        return isIt;

    }

    static int findZeros(int n){

        int num = 0;
        while (n > 0){
            int check = n % 10;
            n = n / 10;
            if(check == 0){
                num = num + 1;
            }
        }

        return num;
    }
}
