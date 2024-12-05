public class sortRecursion {
    public static void main(String[] args) {
        
        // removeChar("nigga", "");
        String some = removeChar3("niggasinParis");
        System.out.println(some);
    }

    static void removeChar2(String word, String store){
        int len = word.length();
        for (int i = 0; i < len; i++) {
            if(word.charAt(i) != 'a'){
                store = store + word.charAt(i);
            }
        }
        System.out.println(store);
    }

    static void removeChar2(int word, int store){

    }


    static void removeChar(String word, String store ){
        if(word.isEmpty()){
            System.out.println(store);
            return;
        }

        char ch = word.charAt(0);

        if(ch == 'a'){
            // System.out.println(word.substring(1));
            removeChar(word.substring(1), store);
        }else {
            // System.out.println(word.substring(1));
            removeChar(word.substring(1), store + ch);
        }
    }

    static String removeChar3(String word ){
        if(word.isEmpty()){
            return "";
        }

        char ch = word.charAt(0);

        if(ch == 'a'){
            // System.out.println(word.substring(1));
            return removeChar3(word.substring(1));
        }else {
            // System.out.println(word.substring(1));
            System.out.println(ch);
            return ch + removeChar3(word.substring(1));
        }
    } 
}