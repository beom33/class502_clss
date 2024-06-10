package Chapter3;

public class Ex02 {
    public static void main(String[] args) {
        int soccerPoint = 170; // 축구에서 획득한 점수 170

        int lastScore1 = ++soccerPoint; // soccerPoint에 1만큼 더한 값을 lastScore1에 대입
        System.out.println(lastScore1); // 171

        int lastScore2 = --soccerPoint; // soccerPoint에 1만큼 뺀 값을 lastScore2에 대입
        System.out.println(lastScore2); // 170
    }
}
