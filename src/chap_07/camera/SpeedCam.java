package chap_07.camera;

public class SpeedCam extends Camera {   //자식클래스
    //부모클래스에 있는 이름 사용 가능.
    //takePictures, recordVideo 없지만 부모 클래스에 있기 때문에 사용 가능
    //상속은 하나의 클래스에서만 받을 수 있음.


    public SpeedCam() {
        this.name = "과속단속 카메라";
    }

    public void checkSpeed(){
        //속도체크
        System.out.println("속도를 측정합니다.");
    }
    public void recognizeLicensePlate(){
        //번호인식
        System.out.println("번호를 인식합니다.");
    }
}
