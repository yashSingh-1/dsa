import java.util.Arrays;

public class matrix_binary {
    public static void main(String[] args) {
        int[][] arr = {
            {12, 14, 16},
            {23, 35, 37},
            {38, 40, 49}
        };

        int[] values = search(arr, 49);
        System.out.println(Arrays.toString(values));
    }

    static int[] search(int[][] arr, int target){
        int r = 0;
        int c = arr.length - 1;

        while (r < arr.length && c >= 0) {
            if(arr[r][c] == target){
                return new int[]{r, c};
            }

            if(arr[r][c] < target){
                r++;
                System.out.println("Row: " + r + " Col: " + c);
            }else {
                c--;
                System.out.println("Row: " + r + " Col: " + c);

            }
        }

        return new int[]{-1, -1};
    }
}
