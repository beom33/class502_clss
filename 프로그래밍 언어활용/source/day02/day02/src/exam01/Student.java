package exam01;

public class Student {
    int id; //  학번
    String name; // 학생명
    String subject; // 과목

    // 기본생성자
    public Student() {
         // 객체 생성 이후 실행되는 부분 -id,name, subject 는 이미 변수가 된 상태
       // 맴버 변수의 초기화 작업을 주로 많이 정의

        id = 1000;
        name = "김덕수";
        subject = "체육";

    }
    public Student (int _id, String _name, String _subject) {
        id = _id;
        name = _name;
        subject = _subject;

    }

    void study() {
        System.out.printf("id=%d, name=%s, subject=%s%n", id, name,subject);
    }
}
