public class Recursion {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 66, 77, 88};
        int found = binary(arr, 77, 0, arr.length - 1);
        System.out.println(found);
        
    }

    static int binary(int[] arr, int target, int s, int e){

        if(s > e){
            return -1;
        }

        int mid = s + (e - s)/ 2;

        if(target == arr[mid]){
            return mid;
        }

        if(target < arr[mid]){
            return binary(arr, target, s, mid - 1);
        }


        return binary(arr, target, mid + 1, e);
        
    }
}
