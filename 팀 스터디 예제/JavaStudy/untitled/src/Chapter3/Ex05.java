package Chapter3;

public class Ex05 {
    public static void main(String[] args) {
        int num = 0B00000101;
        System.out.println(num << 2);
        System.out.println(num >> 2);
        System.out.println(num >>> 2);

        System.out.println(num);

        num = num << 2;
        System.out.println(num);
    }
    /*20
    1
    1
    5
    20
     */
}
