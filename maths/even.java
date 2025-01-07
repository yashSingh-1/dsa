package maths;

public class even {
    public static void main(String[] args) {
        int a = 76;
        System.out.println(IsOdd(a));
    }

    static boolean IsOdd(int n){
        return (n & 1) == 1;
    }
}
