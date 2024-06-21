package exam01;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("이름을 입력하세요:");
        String name = sc.next();
        System.out.printf("이름:%s%n",name);
    }
}
