import java.util.Arrays;

public class Mismatch {
    public static void main(String[] args) {
        int[] arr = {2,1,3,4,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));

        
    }

    static void sort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int cor = arr[i] - 1;
            if(arr[i] != i + 1){
                if(arr[i] != arr[cor]){
                    int temp = arr[cor];
                    arr[cor] = arr[i];
                    arr[i] = temp;
                }else {
                    System.out.println("Dplicate : " + arr[i] + " missing at index " + i  + " is : " + (i + 1));
                    break;
                }
            }else {
                i++;
            }
        }
    }
}
