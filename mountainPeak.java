public class mountainPeak {
    // https://leetcode.com/problems/peak-index-in-a-mountain-array/
    public static void main(String[] args) {
        int[] arr = {0,1,2,0};

        int val = soln(arr);
        System.out.println(val);

        
    }

    static int soln(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i = 1; j < arr.length; j++) {
                if(arr[i] < arr[j]){
                    return arr[i];
                }else {
                    return arr[j];
                }
            }
        }
        return -1;
    }
}
