package chap_02;

public class quiz_02 {
    public static void main(String[] args) {
        int height = 120;
        int standard =120;
        String s = (height>=standard)?"키가 "+height+"이므로 탑승 가능합니다":"키가"+height+"이므로 탑승불가능합니다";
        System.out.println(s);
    }
}
