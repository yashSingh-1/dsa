import java.util.Arrays;

public class cyclic {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correctIndex = arr[i] - 1; // Correct index of the number
            if(arr[i] != arr[correctIndex]){
                int temp = arr[correctIndex];
                arr[correctIndex] = arr[i];
                arr[i] = temp;
            }else{
                i++;
            }
        }
    }
}
