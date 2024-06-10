package Chapter3.test;

public class test07 {
    public static void main(String[] args) {
        int num = 10;
        int num2 = 20;

        int result = (num>=10) ? num2 + 10 : num2 - 10;
        System.out.println(result);
    }
}
/* ? = 조건식이 참이면 결과 1 , 아니면 결과2
* 30
*/