public class intersection {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,45,6,7};
        int[] arr2 = {5,6,6,7,22,31};

        int num = checkIntersection(arr1, arr2);
        System.out.println(num);
        
    }

    // O(n^2) time..this not good enough 
    static int checkIntersection(int[] arr1, int[] arr2){
        int common = 0;
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    common = arr1[i];
                    return common;
                }else {
                    common = -1;
                }
            }
        }
        return common;
    }
}
