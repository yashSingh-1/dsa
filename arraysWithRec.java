public class arraysWithRec {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,5};
        boolean isIt = sort(arr, 0);
        System.out.println(isIt);
    }

    static boolean sort(int[] arr, int s ){
        if(s == arr.length - 1){
            return true;
        }
        return arr[s] < arr[s + 1] && sort(arr, s + 1);
    }
}
