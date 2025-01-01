import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

public class LeetCode {
    public static void main(String[] args) {
        int[] arr = {3,8,-10,23,19,-4,-14,27};
        minimumAbsDifference(arr);
    }

    static List<Integer> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            if(i < arr.length -1 && arr[i + 1] - arr[i] == 1){
                list.add(arr[i]);
            }
        }
        System.out.println(list);
        return list; 
        
    }
}
// damn this is stupid
