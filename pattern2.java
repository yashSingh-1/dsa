public class pattern2 {
    public static void main(String[] args) {

        // square();
        InvertedRightAngleTriangle();
        rightAngleTriangle();
        
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
}
