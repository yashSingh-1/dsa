import java.util.Arrays;

public class DuplicateNum {
    public static void main(String[] args) {
        DuplicateNum num = new DuplicateNum();

        int[] arr = {4,3,3,2,1};
        num.cyclic(arr);
        System.out.println(Arrays.toString(arr));

        num.bruteForce(arr);
        
    }

    void cyclic(int[] arr){
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                int temp = arr[correct];
                arr[correct] = arr[i];
                arr[i] = temp;
            }else if(arr[i] == arr[correct]){
                System.out.println("There is a duplicate of " + arr[i]);
                break;
            }else{
                i++;
            }
        }
    }

    void bruteForce(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    System.out.println("There is a duplicate of " + arr[i] + " | J : " + j + " I : " + i);
                    break;
                }
            }
        }
        
    }
}
