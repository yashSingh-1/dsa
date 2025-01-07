package recursion;

public class easy {
    public static void main(String[] args) {
        int n = 9;

        printing(n);
    }

    static void printing(int n) {
        if(n == 0){
            return;
        }
        printing(n - 1);
        System.out.println(n);
    }
}
