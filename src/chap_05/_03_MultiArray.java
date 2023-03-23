package chap_05;

public class _03_MultiArray {
    public static void main(String[] args) {


    //다차원 배열(2차원 배열)
    //소규모 영화관 좌석
    //A1-A5, B1-B5,C1-C5

    String[] seatA = {"A1","A2","A3","A4","A5"};
    String[] seatB = {"B1","B2","B3","B4","B5"};
    String[] seatC = {"C1","C2","C3","C4","C5"};
    //3*5 크기의 2차원 배열
    String[][] seats = new String[][]{
            {"A1","A2","A3","A4","A5"},
            {"B1","B2","B3","B4","B5"},
            {"C1","C2","C3","C4","C5"}
    };
    for (int i=0;i<3;i++){     //세로
        for (int j=0;j<5;j++){    //가로
            System.out.print(seats[i][j] +" ");
        }
        System.out.println();
    }
    //B2에 접근하려면?
        System.out.println(seats[1][1]);

    //C5에 접근하려면?
        System.out.println(seats[2][4]);

        System.out.println("-----------------------");
    //첫줄에는 3칸, 둘째 줄에는 4칸, 셋째 줄에는 5칸
    String[][] seats2 ={
            {"A1","A2","A3"},
            {"B1","B2","B3","B4"},
            {"C1","C2","C3","C4","C5"}
    };

    for(int i=0;i<seats2.length;i++){   //세로
        for(int j=0; j<seats2[i].length;j++){   //가로
            System.out.print(seats2[i][j]+" ");
        }
        System.out.println();
    }

    //A3에 접근하려면?
        System.out.println(seats2[0][2]);


        //3차원 배열 만들기 (세로 x 가로 x 높이)
        String[][][] marray = new String[3][3][3];

        System.out.println("-----------------------");

        //세로 크기 10 x 가로 크기 15에 해당하는 영화관 좌석
        String[][] seats3 =new String[10][15];
        String[] eng ={"A","B","C","D","E","F","G","H","I","J"};
        for (int i=0;i<seats3.length;i++){ //세로
            for (int j=0;j<seats3[i].length;j++){
                seats3[i][j] = eng[i]+(j+1);
            }
        }
        //영화관 좌석 번호 확인
        for (int i=0;i<seats3.length;i++){ //세로
            for (int j=0;j<seats3[i].length;j++){
                System.out.print(seats3[i][j]+" ");
            }
            System.out.println();
        }
}}
