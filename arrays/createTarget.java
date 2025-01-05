package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class createTarget {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        int[] t = new int[nums.length];
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            list.add(index[i], nums[i]);
        }

        System.out.println((list));

        for(int i = 0; i < nums.length; i++){
            t[i] = list.get(i);
        }

        System.out.println(Arrays.toString(t));
    }
}
