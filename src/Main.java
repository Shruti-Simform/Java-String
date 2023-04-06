public class Main {
    public static void main(String[] args) {

        String str = new String("  Java String  ");
        System.out.println(str.toUpperCase());
        System.out.println(str.trim());

        StringBuilder sbd = new StringBuilder();
        sbd.append("  String").append(" Builder").append(" in").append(" Java").append(" Language  ");
        System.out.println(sbd.toString().toUpperCase());
        System.out.println(sbd.toString().trim());

        StringBuffer sbf = new StringBuffer();
        sbf.append("  String").append(" Buffer").append(" in").append(" Java").append(" Language  ");
        System.out.println(sbf.toString().toUpperCase());
        System.out.println(sbf.toString().trim());
    }
}