import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllMissNum {
    public static void main(String[] args) {

        int[] arr = { 4, 3, 2, 7, 8, 2, 3 ,1 };
        sort(arr);
        System.out.println(Arrays.toString(arr));

         checkNums(arr);

        
    }

    static void sort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1 ;

            if(arr[i] != arr[correct]){
                int temp = arr[correct];
                arr[correct] = arr[i];
                arr[i] = temp;

            }else {
                i++;
            }
        }
    }

    static void checkNums(int[] arr){
        // int[] missing = new int[arr.length];
        List<Integer> missing = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != i + 1){
                missing.add(i + 1);
            }
        }
        System.out.println("The missing nums are : " + missing);
        
    }
}
