public class palindrome {
    public static void main(String[] args) {
        String word = "turd";
        String reverse = "" ;
        boolean palindrome = false;

        for (int i = word.length() -1 ; i >= 0; i--) {
            reverse += word.charAt(i);
        }

        if(word.equals(reverse)){
            palindrome = true;
        }
        System.out.println(palindrome);

    }
}
