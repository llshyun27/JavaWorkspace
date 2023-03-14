package chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {
        //산술 연산자
        //일반 연산
        System.out.println(4+2); //6
        System.out.println(4-2); //2
        System.out.println(4*2); //8
        System.out.println(5/2); //2
        System.out.println(2/4); //0
        System.out.println(4%2); //나머지 0
        System.out.println(5%2);

        int a =20;
        int b =10;
        int c;
        c=a+b;
        System.out.println(c);
        c =a-b;
        System.out.println(c);

        //증감연산 ++ --
        int val =10;
        System.out.println(val); //10
        System.out.println(++val);  //11
        System.out.println(val);  //11

        val =10;
        System.out.println(val);//10
        System.out.println(val++); //10




    }
}
