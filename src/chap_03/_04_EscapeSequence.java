package chap_03;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        //특수문자, 이스케이프 문자(Escape Sequence)
        // \n \t \\ \" \'

        // \n : 줄바꿈
        System.out.println("자바가\n너무\n재밌어요");

        //\t : 탭효과
        //해물파전 9000원
        //김치전 8000원
        //부추전 8000원
        System.out.println(("해물파전\t\t9000원"));
        System.out.println("김치전\t\t8000원");
        System.out.println("부추전\t\t8000원");

        //  \\ : 역슬래시
        //   \" :큰따옴표, \' : 작은따옴표
    }
}
