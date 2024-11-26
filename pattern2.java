public class pattern2 {
    public static void main(String[] args) {

        // square();
        // InvertedRightAngleTriangle();
        // rightAngleTriangle();
        // NumPattern();
        Triangle(5);
        
    }

    static void square(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void InvertedRightAngleTriangle(){
        for (int i = 0; i <= 5; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void rightAngleTriangle(){
        for (int i = 0; i <= 5; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void NumPattern(){
        for (int i = 0; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " " );
            }
            System.out.println();
        }
    }

    static void Triangle(int n){
        for (int row = 0; row <= 2 * n; row++) {
            int colsInRow = row > n ? (2 * n) - row : row;
            for (int j = 0; j < colsInRow; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
