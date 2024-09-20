public class maxWealth {
    public static void main(String[] args) {
        int[][] assets = {
            {1, 5, 6},
            {9, 8, 7}
        };

        int wealth = 0;
        int checkMax = 0;

        for(int i = 0; i < assets.length; i++){
            for(int j = 0; j < assets[i].length; j++){
                wealth += assets[i][j];
            }
            if(checkMax < wealth){
                checkMax = wealth;
            }
            System.out.println("Wealth at index " + i + " is " + wealth);
        }
        System.out.println("Max width is : "+ checkMax);
    }
}
