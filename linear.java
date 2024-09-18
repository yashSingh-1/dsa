// import java.util.Scanner;

public class linear {
    public static void main(String[] args) {
        linear something = new linear();
        // int[] arr = {23,334, 3, 4,54,45,54,4,3,22};
        // Scanner sc = new Scanner(System.in);
        // int input = sc.nextInt();
        // for(int i = 0; i < arr.length; i++ ) {
        //     if(arr[i] == input){
        //         System.out.println(arr[i] + " present in the array");
        //         break;
        //     }
        // }
        // sc.close();

        String value = something.checkingString("Riding that D", 'z');
        System.out.println(value);
    }

     String checkingString(String value, char c) {
        for(int i = 0; i < value.length(); i ++ ){
            if(c == value.charAt(i)){
                return "Value Present";
            }
        }
        return "Value not present";
    }
}
