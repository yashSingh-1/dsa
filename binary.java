import java.util.Arrays;

public class binary {
    public static void main(String[] args) {
        int[] arr = {12, 5, 6, 56, 23, 345, 99};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int target = 6;

        if(target > arr[arr.length/2]){
            for (int i = arr.length / 2 ; i < arr.length; i++) {
                if(arr[i] == target){
                    System.out.println("The index of " + target + " is : " + i);
                }
            }
        }else{
            for (int i = 0; i < arr.length / 2; i++) {
                if(arr[i] == target){
                    System.out.println("The index of " + target + " is : " + i);
                }
            }
        }
    }
}
