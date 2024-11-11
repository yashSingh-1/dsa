

public class last_fst {
    public static void main(String[] args) {
        last_fst some = new last_fst();
        int target = 90;

        int[] arr = {12, 13, 77, 88, 90, 90, 90, 90, 90, 91, 99};

        int start = some.finding(target, arr, true);
        int end = some.finding(target, arr, false);

        System.out.println("Index: " + (start) + " " + end);

    }

    int finding(int target, int[] arr, boolean left){
        int start = 0;
        int end = arr.length - 1;
        int found = -1;
        while(start <= end) {
            int mid = (start + end) / 2;

            if(target > arr[mid]){
                start = mid + 1;
            }else if(target < arr[mid]){
                end = mid - 1;
            }else {
                if(left){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
                found = mid;
                return found;
                // return mid;
            }
        }
        return found;
    }
}
