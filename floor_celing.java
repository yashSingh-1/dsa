public class floor_celing {
    public static void main(String[] args) {

        int[] arr = {12, 14, 16, 18, 19, 20, 24, 28, 30};
        int target = 25;
        int val = floor(arr, target);
        System.out.println("Biggest num <= " +  target + " is with index: " + val + " and value: " + arr[val]);

        int val2 = ceiling(arr, target);
        System.out.println("Smallest num >= " +  target + " is with index: " + val2 + " and value: " + arr[val2]);

        
    }
    // Assumptions: Arr is already sorted in Ascending order
    static int floor(int[] arr, int target) { // Return the biggest num >= target 

        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = (start + end) /2;
            if(target > arr[mid]){
                start = mid + 1; 
            }else if(target < arr[mid]){
                end = mid - 1;
            }else {
                return mid;
            }
        }

        return end;
    } 

    static int ceiling(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
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
        return start;
    }
}
