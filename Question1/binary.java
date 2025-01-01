package Question1;

public class binary {
    public static void main(String[] args) {
        int[] arr = {12,13,14,15,22,33,44,55,66,77,999, 9999, 99999, 999999, 99999999};
        binary instance = new binary();
        instance.findingRange(66, arr);
        System.out.println(arr.length);
        
    }

    // Its a infinite arr given to you
    public void findingRange(int t, int[] arr){
        int s = 0;
        int e = 1;

        while(t > arr[e]){
            int temp = e + 1;

            // e = e + (e - s + 1) * 2;
            e = e * 2;
            s = temp;

        }

        int index = binarySearch(t, arr, s, e);
        System.out.println("Index: " + index);
    }

    public int binarySearch(int t, int[] arr, int s, int e){
        int index = -1;
        while(s <= e){
            int mid = s + (e - s) / 2;

            if(t < arr[mid]){
                e = mid - 1;
            }else if(t > arr[mid]){
                s = mid + 1;
            }else{
                index =  mid;
                return index;
            }
        }
        return index;
    }
}
