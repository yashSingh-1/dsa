package maths;

public class power {
    public static void main(String[] args) {
        int n = 6;
        int p = 6;

        int ans = 1;

        while(p > 0){
            int last = p & 1;
            p = p >> 1;
            if(last == 1){
                ans *= n;
            }
            n = n * n;
        }
        System.out.println(ans);
    }
}
