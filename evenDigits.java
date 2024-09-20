public class evenDigits {
    public static void main(String[] args) {
        int[] arr = {12, 432, 7888, 98655, 90, 77777777, -90};
        int increate = 0;
        for(int i = 0; i< arr.length; i++){
            if(arr[i] < 0){
                arr[i] = arr[i] * -1;
            }
            int coount = findNumOdDigits(arr[i]); 
            System.out.println("The digit count for index " + i + " is: " + coount);
            if(coount % 2 == 0){
                increate++;
            }
        }
        System.out.println("The nums have even no. of digits are: " + increate);
    }

    private static int findNumOdDigits(int i) {
        int count = 0;
        while (i > 0){
            i = i / 10;
            count++;
        }
        return count;
    }
}
