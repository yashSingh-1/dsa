package recursion;

public class lvl1 {
    public static void main(String[] args) {
        printTillN(5);
    }

    static void printTillN(int n){
        if(n == 0){
            return;
        }

        printTillN(n - 1);
        System.out.println(n);
    }
}
