public class countSteps {
    public static void main(String[] args) {
        int count = CountingSteps(212);
        System.out.println(count);
        int count2 = countStep2(212, 0);
        System.out.println(count2);
    }

    static int CountingSteps(int n){
        if(n < 1){
            return 0;
        }

        int count = 0;
        while(n > 0){
            if(n % 2 == 0){
                n = n / 2;
                count++;
            }else {
                n = n - 1;
                count++;
            }
        }
        return count;
    }

    static int countStep2(int n, int steps){
        if(n == 0){
            return steps;
        }

        if(n % 2 == 0){
            return countStep2(n / 2, steps+1);
        }
        return countStep2(n-1, steps+1);
    }
}
