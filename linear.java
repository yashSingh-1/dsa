import java.util.Scanner;

public class linear {
    public static void main(String[] args) {
        int[] arr = {23,334, 3, 4,54,45,54,4,3,22};
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        for(int i = 0; i < arr.length; i++ ) {
            if(arr[i] == input){
                System.out.println(arr[i] + " present in the array");
                break;
            }
        }
        sc.close();
    }
}
