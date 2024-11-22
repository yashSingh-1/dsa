import java.util.Arrays;

public class MissingNum {
    public static void main(String[] args) {

        int[] arr = { 1, 4, 3, 2, 6};

        MissingNum miss = new MissingNum();

        miss.sort(arr);
        System.out.println(Arrays.toString(arr));

        
    }

    void sort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;

            if(i < arr.length && arr[i] != arr[correct]){
                int temp = arr[correct];
                arr[correct] = arr[i];
                arr[i] = temp;
            }else{
                i++;
            }
        }
    }
}
