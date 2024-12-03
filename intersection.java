import java.util.ArrayList;

public class intersection {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,45,6,7,6,22,31};
        int[] arr2 = {5,6,6,7,22,31};

        ArrayList<Integer> num = checkIntersection(arr1, arr2);
        System.out.println(num);
        
    }

    // O(n^2) time..this not good enough 
    static ArrayList<Integer> common = new ArrayList<>();
    static ArrayList<Integer> checkIntersection(int[] arr1, int[] arr2){
        // int common = 0;
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    if(common.contains(arr1[i])){
                        j++;
                    }else{
                        common.add(arr1[i]);
                    }
                }
            }
        }
        return common;
    }
}
