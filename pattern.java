public class pattern {
    public static void main(String[] args) {
        pattern some = new pattern();

        some.invertedRightAngle();
        
    }
    
    void rightAngle() {
        
        for(int i = 0; i <= 5 ; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void invertedRightAngle(){
        for(int i = 1; i <= 5; i++){
            for(int j = 5; j >= i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
