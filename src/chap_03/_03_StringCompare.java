package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        //문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals(s2));//문자열 내용이 같으면 true, 다르면 false
        System.out.println(s1.equals("Java"));
        System.out.println(s2.equals("python"));
        System.out.println(s2.equalsIgnoreCase("python")); //대소문자 구분없이 내용이 같은지 체크4

        //문자열 비교 심화
        s1 ="1234";  //벽에 붙은 메모지의 비밀번호 정보(참조)
        s2 ="1234";
        System.out.println(s1.equals(s2)); //true, 내용을 비교
        System.out.println(s1 ==s2);  //true, 참조하는 곳을 비교

        s1 = new String("1234"); //각각의 메모지에 비밀번호 적은 것(서로 다른 참조가 되는 것)
        s2 =new String("1234");
        System.out.println(s1.equals(s2)); //true, 내용 비교시에는 equals 사용하기
        System.out.println(s1==s2);  //false ,
    }
}
