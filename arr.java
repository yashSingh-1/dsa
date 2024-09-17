
import java.util.Scanner;

public class arr {
    public static void main(String[] args) {

        int[][] array = {
            {1, 2, 3, 4},
            {5, 8, 9, 12},
            {12, 7, 9, 99},
            {22, 55, 77, 1002}
        };

        int sum = 0;
        for( int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                if(i == j){
                    System.out.println("I is: " + i + " j is : " + j);
                    sum = sum + array[i][j]; 
                }
            }
        }
        System.out.println("Sum: " + sum);

        arr some = new arr();

        some.fillArray();
    }

    void fillArray() {
        Scanner sc = new Scanner(System.in);


        int[][] array1 = new int[2][2];
        for(int i = 0; i < array1.length; i++){
            for (int j = 0; j < array1[i].length; j++) {
                int input = sc.nextInt();
                array1[i][j] = input;
                // System.out.println(array1[i][j]);
            }
        }

        for(int i = 0; i < array1.length; i++){
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print(" " +  array1[i][j] + " ");
            }
        }
        sc.close();
    }
}
