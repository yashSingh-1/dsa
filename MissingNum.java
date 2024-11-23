import java.util.Arrays;

public class MissingNum {
    public static void main(String[] args) {

        int[] arr = {0, 1, 4, 3, 2, 6};

        MissingNum miss = new MissingNum();

        miss.sort(arr);
        System.out.println(Arrays.toString(arr));

        int missing = miss.findMissing(arr);
        System.out.println("The missing num is: " + missing);

        
    }

    void sort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] ;

            if(arr[i] < arr.length && arr[i] != arr[correct]){
                int temp = arr[correct];
                arr[correct] = arr[i];
                arr[i] = temp;
            }else{
                i++;
            }
        }
    }

    int findMissing(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != i){
                return i;
            }
        }
        return arr.length;
    }
}
