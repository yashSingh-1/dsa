public class arraysWithRec {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,5};
        // boolean isIt = sort(arr, 0);
        // System.out.println(isIt);

        int index = LinearSearch(arr, 0, 6);
        System.out.println(index);
    }

    static boolean sort(int[] arr, int s ){
        if(s == arr.length - 1){
            return true;
        }
        return arr[s] < arr[s + 1] && sort(arr, s + 1);
    }

    static int LinearSearch(int[] arr, int start, int target){

        if(start > arr.length - 1){
            return -1;
        }

        if(target == arr[start]){
            return start;
        }

        return LinearSearch(arr, start + 1, target);
    }
}
