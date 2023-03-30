package chap_07;
//같은 메소드 이름인데 서로 다른 타입의 매개변수를 가짐.
public class _05_MethodOverloading {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";

        b1.record(false,false,10);
        System.out.println("------------------------");
        b1.record(true,false,3);
        System.out.println("------------------------");
        b1.record();

        //String
        String s = "BlackBox";
        System.out.println(s.indexOf("a"));
    }
}
