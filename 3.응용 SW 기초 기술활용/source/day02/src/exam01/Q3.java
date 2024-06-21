package exam01;

public class Q3 {
    public static void main(String[] args) {
        int floor = 3;
        switch (floor) {
            case 1:
                System.out.println("1층 약국");

            case 2:
                System.out.println("2층 정형외과");
            case 3:
                System.out.println("3층 피부과");
            case 4:
                System.out.println("4층 치과");

            case 5:
                System.out.println("5층 헬스클럽");

            default:
                System.out.println(" 없는층 입니다");

        }

    }
}
