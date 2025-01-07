package maths;

public class SetBits {
    public static void main(String[] args) {
        int n = 46;
        System.out.println(Integer.toBinaryString(n));

        noOfSetBits(n);
    }

    static void noOfSetBits(int n){
        int c = 0;

        while( n > 0){
            c++;
            n -= (n & -n);
            // System.out.println(n);
        }
        System.out.println(c);

    }
}
