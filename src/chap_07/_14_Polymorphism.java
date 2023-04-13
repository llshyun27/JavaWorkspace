package chap_07;

import chap_07.camera.Camera;
import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

public class _14_Polymorphism {
    public static void main(String[] args) {
     //다형성 : 하나의 객체나 메소드가 여러가지 다른 형태를 가질 수 있는 것.
        // class Person : 사람
        // class Student extends Person : 학생(학생은 사람이다. Student is a person)
        // class Teacher extends Person : 선생님(선생님은 사람이다. Teacher is a person)

        Camera camera = new Camera();   //Camera가 또다른 자식클래스 객체를 생성한다.
        Camera factoryCam = new FactoryCam();
        Camera speedCam = new SpeedCam();

        camera.showMainFeature();
        factoryCam.showMainFeature();
        speedCam.showMainFeature();
        System.out.println(("--------같은 기능-------"));
        Camera[] cameras = new Camera[3];
        cameras[0] = new Camera();
        cameras[1] = new FactoryCam();
        cameras[2] = new SpeedCam();

        for (Camera cam :cameras){
            cam.showMainFeature();
        }
        System.out.println("-----------------------");
        //factoryCam.detectFire();  -> 자식클래스에만 있는 함수는 불러올 수 없음.
        if (camera instanceof Camera){
            System.out.println("카메라입니다.");
        }
        if (factoryCam instanceof FactoryCam){
            ((FactoryCam)factoryCam).detectFire();  //factoryCam은 FactoryCam으로 형변환됨.
        }
        if (speedCam instanceof SpeedCam){
            ((SpeedCam)speedCam).checkSpeed();
            ((SpeedCam)speedCam).recognizeLicensePlate();
        }
    }
}
