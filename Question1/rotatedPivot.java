package Question1;

public class rotatedPivot {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,2};
        rotatedPivot rp = new rotatedPivot();
        int p = rp.findPivot(arr);
        System.out.println("The pivot is: " + p);
        int index1 = rp.binary(arr, 2, 0, p);

        if(index1 != -1){
            // return 0;
            System.out.println("index 1" + index1);
        }

        int i2 = rp.binary(arr, 1, p, arr.length - 1);
        System.out.println(i2);

    }

    public int findPivot(int[] arr){

        int s = 0;
        int e = arr.length - 1;

        while(s < e){
            int mid = s + (e - s) / 2;
            if(arr[mid] > arr[mid + 1]){
                e = mid;
            }else {
                s = mid + 1;
            }
        }

        return s;
    }

    public int binary(int[] arr, int t,int s, int e){
        int index = -1;
        while(s <= e){
            int m = s + (e - s) / 2;
            if(t < arr[m]){
                e = m - 1;
            }else if(t > arr[m]){
                s = m + 1;
            }else {
                index = m;
                return index;
            }
        }
        return index;
    }
}
