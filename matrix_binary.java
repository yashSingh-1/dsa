import java.util.Arrays;

public class matrix_binary {
    public static void main(String[] args) {
        int[][] arr = {
            {12, 14, 16},
            {23, 35, 37},
            {38, 40, 49}
        };
        
        // int[] values = search(arr, 40);
        // System.out.println(Arrays.toString(values));


        int[] reevaluate = try_serach(arr, 41);
        System.out.println(Arrays.toString(reevaluate));

    }

    static int[] search(int[][] arr, int target){
        int r = 0;
        int c = arr.length - 1;
        System.out.println("Row: " + r + " Col: " + c);


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

    static int[] try_serach(int[][] arr, int target){
        int row = 0;
        int col = arr.length - 1;

        while(row < arr.length && col >= 0){
            if(target == arr[row][col]){
                return new int[] {row, col};
            }

            if(arr[row][col] < target){
                row++;
            }else{
                col--;
            }
        }

        return new int[] {-1, -1};
    }
}
