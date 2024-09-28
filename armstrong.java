public class armstrong {
    public static void main(String[] args) {
        int num = 159;


        // for (int i = 0 ; i < )

        boolean isIt = isArmstrong(num);
        System.out.println(isIt);
    }

    // To extract the length of the numbers
    static int extractDigits(int dig){

        int  i = 0;
        while(dig != 0){
            dig = dig / 10;
            i++;
        }
        // System.out.println(i);
        return i;
    }

    static boolean isArmstrong(int num){

        int len = extractDigits(num);
        int temp = num;
        int sum = 0;
        while (temp != 0) {
            int val = temp % 10;
            int cubed = val * val * val;
            sum += cubed;
            if( num == sum){
                return true;
            }
        }
        System.out.println(num  + " : " + sum);
        return false;
    }
}
