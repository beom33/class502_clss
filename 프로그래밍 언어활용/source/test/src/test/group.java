package test;

public class group {
    private static group instance = new group();

    private group() {}

    private static group getInstance() {
        if (instance == null) {
            instance = new group();
        }
        return instance;
    }
}
