package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        int score =93;
        System.out.println(score);
        System.out.println((float)score);
        System.out.println((double)score);

        float score_f =93.3f;
        double score_d =98.8;
        System.out.println((int)score_f);

        double convertedScoreDouble =score;
        int convertedScoreInt =(int)score_d;

        String s1 = String.valueOf(93); //숫자를 문자열로
        s1 = Integer.toString(93);
        System.out.println(s1);

        String s2 =String.valueOf(98.8);
        s2 = Double.toString(98.8);
        System.out.println(s2);




    }
}
