package exam03;

public class Resources2 implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("Resources2자원해제!");
    }
}
