package chap_02;

public class _02_Operator2 {
    public static void main(String[] args) {
        //논리 연산자
        boolean 김치찌개 = true;
        boolean 계란말이 = true;
        boolean 제육볶음 = true;

        System.out.println(김치찌개||계란말이||제육볶음); //하나라도 true면 true
        System.out.println(김치찌개&&계란말이&&제육볶음);  //모두 true이면 true

        System.out.println((5>3)&&(3>1)); //true
        System.out.println(!true);//false
        System.out.println(!(5==5));//false
    }
}
