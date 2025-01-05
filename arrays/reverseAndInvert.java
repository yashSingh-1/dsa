package arrays;

import java.util.Arrays;

public class reverseAndInvert {
    public static void main(String[] args) {
        int[][] image = {{1,1,0}, {1,1,1}, {0,1,0}};
        reverse(image);
        System.out.println(Arrays.toString(image));
    }

    static void reverse(int[][] arr){
        int s = 0;
        int e = arr.length - 1;

        while(s <= e){
            // int temp = arr[s];
            arr[s] = arr[e];
            // arr[e] = temp;

            s++;
            e--;
        }
    }
}
