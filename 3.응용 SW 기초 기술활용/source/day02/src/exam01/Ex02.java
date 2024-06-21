package exam01;

public class Ex02 {
    public static void main(String[] args) {
        int num = 20;
        boolean result = num++ > 20 && (num = num + 20) > 15;
        System.out.println(result);
        System.out.println(num);
        boolean result2 = !result; // true ->< false
        System.out.println(result2);
    }
}
