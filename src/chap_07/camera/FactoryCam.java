package chap_07.camera;

public class FactoryCam extends Camera{  //자식클래스

    public String name;
    public FactoryCam(){
        this.name ="공장 카메라";
    }

    public void detectFire(){
        //화재감지
        System.out.println("화재를 감지합니다.");
    }
}
