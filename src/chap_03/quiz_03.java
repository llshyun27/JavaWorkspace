package chap_03;

public class quiz_03 {
    public static void main(String[] args) {
        String s = "901231-1234567";
        System.out.println(s.substring(0,8));
        System.out.println(s.substring(0,s.indexOf("-")+2));
    }
}
