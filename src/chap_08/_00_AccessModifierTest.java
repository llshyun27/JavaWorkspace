package chap_08;

import chap_07.BlackBox;
import chap_07.BlackBoxRefurbish;

public class _00_AccessModifierTest {
    public static void main(String[] args) {
        BlackBoxRefurbish b1 = new BlackBoxRefurbish();
        b1.modelName = "까망이"; //public
        //b1.resolution ="FHD"; //default는 같은 클래스 내에서만 사용가능
       // b1.price= 200000;   //private은 같은 클래스 내에서만 사용 가능
        //b1.color; //protected 자식 패키지 아니라 불가
    }
}
