package chap_04;

public class _quiz_04 {
    public static void main(String[] args) {
        //주차 요금 정산 프로그램
        //주차요금은 시간당 4000원, 일일 최대 요금은 30000원
        //경차 또는 장애인 차량은 최종 요금에서 50%할인
        String car = "smallCar";
        int time = 5;
        int fee =0;
        if(car == "normal"){
            for (int i=1;i<=time;i++)
            {
              fee+=4000;
              if(fee>=30000){
                  System.out.println("주차 요금은 30000원 입니다.");
                  break;
              }
            }
            if(fee<30000){
            System.out.println("주차 요금은 "+fee+"원 입니다.");}
        }
        if (car =="smallCar"||car =="disorder"){
            for (int i=1;i<=time;i++){
                fee+=4000;
                if(fee>=30000){
                    System.out.println("주차 요금은 15000원입니다.");
                    break;
                }
            }
            if(fee<30000){
                fee = fee/2;
                System.out.println("주차 요금은"+fee+"원 입니다. ");
            }
        }
    }
}
