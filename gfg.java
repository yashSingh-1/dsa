import java.util.Arrays;

public class gfg {
    public static void main(String[] args) {
        int[] arr = {0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        moveZerosToEnd(arr);
    }

    static void moveZerosToEnd(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]){
                int temp = max;
                max = arr[i];
                arr[i] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
