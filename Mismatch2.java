import java.util.Arrays;

public class Mismatch2 {
    public static void main(String[] args) {
        int[] nums = {2,1,2,3};
        int i = 0;
        while (i < nums.length) {
            int cor = nums[i] - 1;
            if(nums[i] != nums[cor]){
                int temp = nums[cor];
                nums[cor] = nums[i];
                nums[i] = temp;
            }else {
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));

        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j + 1){
                System.out.println(nums[j] + " " + (j + 1)); 
            }
        }
    }
}
