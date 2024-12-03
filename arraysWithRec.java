public class arraysWithRec {
    public static void main(String[] args) {
        // int[] arr = {1,2,3,4,6,5};
        // boolean isIt = sort(arr, 0);
        // System.out.println(isIt);

        // int index = LinearSearch(arr, 0, 6);
        // System.out.println(index);

        int[] newArr = {5,6,7,8,9,1,2,3};
        int found = RotatedBinary(newArr, 2);
        System.out.println(found);
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

    static int RotatedBinary(int[] arr, int target){
        int found = -1;
        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;
        if(arr[0] <= arr[mid] && target >= arr[0] && target <= arr[mid] ){
            System.out.println("I the 1st half");

                end = mid;
                while(start <= end){
                    mid = start + (end - start) / 2;
                    if(target > arr[mid]){
                        start = mid + 1;
                    }else if(target < arr[mid]){
                        end = mid - 1;
                    }else {
                        found = mid;
                        return found;
                    }
                }
            }

        if(arr[mid + 1] <= arr[end] && target >= arr[mid] && target <= arr[end]){
            System.out.println("I the 2nd half");

                start = mid;
                while(start <= end){
                    mid = start + (end - start) / 2;
                    if(target > arr[mid]){
                        start = mid + 1;
                    }else if(target < arr[mid]){
                        end = mid - 1;
                    }else {
                        found = mid;
                        return found;
                    }
                }
            }

        System.out.println("start: " + start + " end : " + end + " mid: " + mid);

        return found;
    }
}

