package maths;

import java.util.ArrayList;

public class conversion {
    public static void main(String[] args) {
        int n = 96;
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        while(n > 0){
            int r = n % 2;
            list.add(r);
            n = n / 2;
            count++;
        }
        System.out.println(list);
        System.out.println(count);
        int[] arr = new int[count];

        // for(int i = count)
    }
}
