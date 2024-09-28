import java.util.Arrays;

public class first_last_index {
    public static void main(String[] args) {
        int[] nums = {1, 2, 7, 7, 7, 8, 8, 9};
        first_last_index some = new first_last_index();

        int[] ans = {-1, -1};

        ans[0] = some.serach(nums, 7, true);
        if(ans[0] != -1){
            ans[1] = some.serach(nums, 7, false);
        }
        System.out.println(Arrays.toString(ans));
        
    }

    int serach(int[] nums, int target, boolean searchstart){
        int ans = -1;

        int start = 0;
        int end = nums.length - 1;

        while(start <= end) {
            int mid = (start + end) / 2;
            if(target < nums[mid]){
                end = mid - 1;
            }else if (target > nums[mid]){
                start = mid + 1;
            }else {
                ans = mid;
                if(searchstart) {
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }
        }

        return ans;
    }
}
