import java.util.Arrays;

public class retryCyclic {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 2, 3};
        
        retryCyclic some = new retryCyclic();

        some.cyclic(arr);
        System.out.println(Arrays.toString(arr));
        
    }

    void cyclic(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;

            if(arr[i] != arr[correct]){
                int temp = arr[correct];
                arr[correct] = arr[i];
                arr[i] = temp;
            }else {
                i++;
            }
        }
    }
}
