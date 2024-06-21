package exam01;

public abstract class Calculator {
    int num = 10;

    public Calculator() {
        System.out.println("Calculator 생성자!");
    }

    public  int add (int num1, int num2){
        return num1 + num2;
    }

    public void commonMethod() {


    }

}
