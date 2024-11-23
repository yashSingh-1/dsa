public class binary3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target = 8;

        int index = find(arr, target);
        System.out.println(target + " is at index : " + index);

    }

    static int find(int[] arr, int target){

        int start = 0;
        int end = arr.length;

        while(start < end){
            int mid = (start + end) / 2;
            if(target < arr[mid]){
                end = mid - 1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else {
                return mid;
            }
        }

        return -1;
    }
}
