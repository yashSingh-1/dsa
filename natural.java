import java.util.*;

public class natural {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        natural demo = new natural();
        int num = sc.nextInt();
        // int sum = 0;
        // for (int i = 1; i <= num; i++ ){
            //     sum += i;
            // }
        double now = System.currentTimeMillis();
        System.out.println("The time rn is :" + (now));
        int sum = demo.findSum(num);
        System.out.println("Time taken in ms: " + (System.currentTimeMillis() - now) + "milliseconds");
        System.out.println("Here is the sum :" + (sum));
        sc.close();
        demo.pattern();
        demo.patternRight();
    }

    public int findSum(int n) {
        return n * (n + 1) / 2;
    }

    public void pattern() {
        for (int i = 1; i<=5; i++){
            for(int j = 5; j >= i; j-- ) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public void patternRight() {
        for (int i = 1; i <= 5; i++ ) {
            for(int j = 5; j >= i; j-- ){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}