package maths;

public class NumOfBinary {
    public static void main(String[] args) {
        System.out.println(NumberOfBinaryInDigit(256));
        System.out.println(FindUsingFormula(256));
    }

    static int NumberOfBinaryInDigit(int n){
        int count = 0;

        while(n > 0){
            count++;
            n = n >> 1;
        }
        // System.out.println(count);
        return count;
    }

    static int FindUsingFormula(int n){
        int base = 2;
        int c = (int)(Math.log(n) / Math.log(base)) + 1;
        return c;
    }
}
