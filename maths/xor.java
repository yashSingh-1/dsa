package maths;

public class xor {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 4, 5, 5, 6, 2, 4, 1, 3 };
        System.out.println(xorIt(arr));
    }

    static int xorIt(int[] arr) {
        int unique = 0;

        for(int n : arr){
            unique ^= n;
        }

        return unique;
    }
}
