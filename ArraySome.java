public class ArraySome {
    int[] removeEven(int[] arr) {
        int len = arr.length;
        int count = 0;
        for(int i = 0; i <= arr.length - 1; i++ ){
            if(arr[i] % 2 == 0){
                count = count + 1;
            }
        }
        System.out.println("Count: " + count);
        int[] evenResult = new int[count];
        int[] oddResult = new int[len - count];
        System.out.println(evenResult + "Odd" +  oddResult);
        int index = 0;
        int oddindex = 0;
        for(int i = 0; i<= len - 1 ; i++){
            if(arr[i] % 2 == 0){
                evenResult[index] = arr[i];
                index++;
                System.out.println("Even" +  (arr[i]));
            }else {
                oddResult[oddindex] = arr[i];
                oddindex++;
                System.out.println("ODd" + arr[i]);
            }
        }
        System.out.println("ODd" + evenResult.toString());

        return oddResult;
    }

    public static void main(String[] args) {
        ArraySome arr = new ArraySome();

        int[] some = {8, 4, 6, 3, 12, 7, 99};
        int len = some.length;
        System.err.println(len);

        int[] resu = arr.removeEven(some);
        System.out.println(resu);
    }
}
