public class orderAgnosticBinary {

    public static void main(String[] args) {
        boolean asc = true; // Assuming the order is ascending
        int[] arr = {
            99, 88, 77, 66, 55, 44, 33, 22, 11
        };

        int start = 0;
        int end = arr.length -1 ;
        int traget = 11;


        if(arr[start] > arr[end]){
            asc = false;
        }

        if(asc){
            while (start <= end) {
                int mid = (start + end )/2; 
                if( traget > arr[mid]){
                    start = mid + 1;
                }else if(traget < arr[mid]){
                    end = mid - 1;
                }else {
                    System.out.println(mid);
                    break;
                    // return mid;
                }
            }
        }else {
            while(start <= end){
                int mid = (start + end )/2; 
                if(traget > arr[mid]){
                    end = mid - 1;
                }else if(traget < arr[mid]){
                    start = mid + 1;
                }else {
                    System.err.println(mid);
                    break;
                }
            }
        }

    }
}