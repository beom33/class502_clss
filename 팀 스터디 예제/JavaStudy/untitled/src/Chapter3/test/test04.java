package Chapter3.test;

public class test04 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        boolean result;

        result = ((num1 > 10) && (num2 > 10));
        System.out.println(result);
        result = ((num1 > 10) || (num2 > 10));
        System.out.println(result);
        System.out.println(!result);
    }
    /*false
    true
    false (! 부정을 의미)
     */
}

