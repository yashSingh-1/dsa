import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num to which you wanna take your series: ");
        int input = sc.nextInt();

        int first = 0; 
        int second = 1;
        int sum = 0;
        System.out.println(first + " " +  second );
        for(int i = 2; i <= input; ++i ){
            sum += first + second;
            System.out.println( first + " + " + second + " = " + sum + " ; ");
            first = second;
            second = sum;
            sum = 0;
        }

        sc.close();
    }
}
