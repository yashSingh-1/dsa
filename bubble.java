import java.util.Arrays;

public class bubble {
    public static void main(String[] args) {
        int[] arr = {
            5, 4, 3, 2, 1
        };

        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr){

        for(int i = 0; i < arr.length; i++){
            for(int j = 1; j < arr.length - i; j++){
                System.out.println("I : " + i + " J: " + j);
                if(arr[j] < arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }

}