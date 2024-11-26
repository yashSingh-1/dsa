import java.util.Arrays;

public class FirstMisPos {
    public static void main(String[] args) {
        int[] arr = {7,8,9,11};
        sort(arr);
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != i + 1){
                System.out.println(i + 1);
            }
        }
        
    }

    static void sort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int cor = arr[i] - 1;
            if(arr[i] <= arr.length && arr[i] > 0 && arr[i] != arr[cor]){
                int temp = arr[cor];
                arr[cor] = arr[i];
                arr[i] = temp;
            }else {
                i++;
            }
        }
    }
}
