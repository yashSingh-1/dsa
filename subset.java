public class subset {
    public static void main(String[] args) {
        subseq("", "sambhog");
        double a = Math.pow(4, 2);
        System.out.println(a);
    }

    static void subseq(String p, String up){
        if(up.isEmpty()){
            System.out.print("{" + p + "} ");
            return;
        }

        char ch = up.charAt(0);

        subseq(ch + p, up.substring(1));
        subseq( p, up.substring(1));

    }
}
