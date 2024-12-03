public class Recursion3 {
    public static void main(String[] args) {
        int num = findZeros(10010000);
        System.out.println(num);
    }

    static int num = 0;
    static int findZeros(int n){
        if(n < 1){
            return 1;
        }


        int check = n % 10;
        if(check == 0){
            num += 1;
        }
        findZeros(n / 10);
        return num;
    }
}
