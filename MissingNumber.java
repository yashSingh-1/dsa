import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {0, 1, 4, 3, 2, 7, 6, 8};

        cyclic(arr);
        System.out.println(Arrays.toString(arr));
        MissingNumber some = new MissingNumber();

        some.check(arr);
    }

    static void cyclic(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correctIndex = arr[i];
            // if(arr[i)
            if(arr[i] < arr.length && arr[i] != arr[correctIndex]){
                int temp = arr[correctIndex];
                arr[correctIndex] = arr[i];
                arr[i] = temp;
            }else {
                i++;
            }
        }
    }

    void check(int[] arr){
        int miss = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != i){
                miss = i;
            }else{
                miss = arr.length;
            }
        }
        System.out.println("The missing number is : " + miss);
    }
}
