import java.util.Arrays;

public class Missing {
    public static void main(String[] args) {
        int[] arr = {8,6,4,2,3,5,7,9,1};
        int index = missingNum(arr);
        System.out.println(index);
    }

    static int missingNum(int[] arr){
        int miss = 0;

        int i = 0;
        while (i < arr.length) {
            int c = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[c]){
                int temp = arr[c];
                arr[c] = arr[i];
                arr[i] = temp;
            }else {
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));

        for(int j = 0; j < arr.length; j++){
            if(arr[j] != j){
                miss = j;
                return miss;
            }else {
                miss = arr.length;
            }
        }

        return miss;
    }
}
