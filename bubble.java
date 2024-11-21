import java.util.Arrays;

public class bubble {
    public static void main(String[] args) {
        int[] arr = {
            5, 5, 5, 5, 5
        };

        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr){
        boolean swap = false;
        for(int i = 0; i < arr.length; i++){
            for(int j = 1; j < arr.length - i; j++){
                swap = false;
                System.out.println("I : " + i + " J: " + j);
                if(arr[j] < arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swap = true;
                }
            }
            if(!swap){
                break;
            }
        }
    }

}