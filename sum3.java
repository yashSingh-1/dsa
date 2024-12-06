import java.util.ArrayList;
import java.util.Arrays;

public class sum3 {
    public static void main(String[] args) {
        // int[] arr = {6,6,6,7,7};
        // int num = majorityElement(arr);
        // System.out.println(num);
        int[] g = {1,2,3};
        int[] s = {1,1};
        System.out.println(findContentChildren(g, s));
    }

        static int majorityElement(int[] nums) {
            int start = 0;
            int end = nums.length;
            int n = start + end / 2 - 1;
            int num = -1;
    
            for(int i = start; i < end; i++){
                for(int j = i + 1; j < end; j++){
                    if(nums[i] > nums[j]){
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                    }
                }
            }
            System.out.println(Arrays.toString(nums));
            ArrayList<Integer> list = new ArrayList<>();
            int count = 0;

            for(int i = 0; i < nums.length; i++){
                for(int j = i + 1; j < nums.length; j++){
                    if(nums[i] == nums[j]){
                        count += 1;
                        if(count > n){
                            num = nums[i];
                            list.add(num);
                        }
                    }
                }
            }
            System.out.println(count);
            System.out.println(list);
            
            return num;
        }

        static int findContentChildren(int[] g, int[] s) {
            int count = 0;
            for(int i = 0; i < g.length; i++){
                for(int j = 0; j < s.length; j++){
                    if(g[i] == s[j]){
                        count = count + 1;
                        System.out.println(g[i] + " is g " + s[j] + " is s ");
                    }
                }
            }
            return count;
        }
}
