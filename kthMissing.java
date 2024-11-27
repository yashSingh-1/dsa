import java.util.ArrayList;
import java.util.List;

public class kthMissing {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};

        Solution(arr, 2);
    }
    
    static void Solution(int[] arr, int k) {

        int start = 1;
        int end = arr.length;
        List<Integer> missing = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            // int correct = arr[i];
            if(arr[i] != i + 1){
                missing.add(i + 1);
            }
        }

        // while(start <= end){
        //     int mid = (start + (end - start)) / 2;
        //     if()
        // }


        System.out.println(missing);

}
}
