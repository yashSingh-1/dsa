public class last_fst {
    public static void main(String[] args) {
        last_fst some = new last_fst();
        int target = 90;

        int[] arr = {12, 13, 77, 88, 90, 91, 99};

        int index = some.finding(target, arr);
        System.out.println("Index: " + index);

    }

    int finding(int target, int[] arr){
        int start = 0;
        int end = arr.length - 1;
        int not_found = -1;
        while(start <= end) {
            int mid = (start + end) / 2;

            if(target > arr[mid]){
                start = mid + 1;
            }else if(target < arr[mid]){
                end = mid - 1;
            }else {
                return mid;
            }
        }
        return not_found;
    }
}
