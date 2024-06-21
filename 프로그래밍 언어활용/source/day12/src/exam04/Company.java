package exam04;

public class Company {

    private static Company instance = new Company();

    private Company() {}

    private static Company getInstance() {
        if (instance == null) {
            instance = new Company();
        }
        return instance;
    }
    // 싱글톤 정의 =  필요할때 하나만 정의해서 공유!
}
