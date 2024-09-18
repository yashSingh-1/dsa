public class range {
    public static void main(String[] args) {
        range something = new range();

        // int[] arr = {
        //     12, 5, 12, 6, -1, 77, 437, -98
        // };
        // int target = -1;

        // int result = something.checkIfPresent(arr, target, 0, 3);
        // System.out.println(result);

        // something.minAndMax(arr);
        int[][] array2D = {
            {12, 34, -2, 4},
            {99, 6},
            {88, 76, 45, 8777, 5237}
        };
        int rez = something.serachIn2DArr(array2D, 52345);
        System.out.println(rez);

        
    }

    int checkIfPresent(int[] arr, int target, int start, int end){
        for(int i = start; i <= end; i++ ){
            if(target == arr[i]){
                return i;
            }
        }
        return -1;
    }

    int minAndMax(int[] arr){
        int maxNum = arr[0];
        int min = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > maxNum){
                maxNum = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }

        System.out.println("Thr max is: " + maxNum);
        System.out.println("The min is : "+ min);
        return maxNum ;

    }

    int serachIn2DArr(int[][] arr, int target){
        for(int i = 0; i< arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] == target){
                    return arr[i][j];
                }
            }
        }
        return -1;
    }
}
