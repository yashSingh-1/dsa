public class binary2 {
    public static void main(String[] args) {
        binary2 some = new binary2();

        int[] sortedArr = {
            -12, -2, -1, 0, 12, 14, 55, 66, 77, 88
        };
        int ans = some.binarySearch(sortedArr, 12);
        System.out.println(ans);

    }

    int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = ((start + end) / 2);
            if(target > arr[mid]){
                start = (start + end) / 2 + 1;
            }
            else if(target < arr[mid]){
                end = ((start + end) / 2) - 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
