package exam01;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;

public class Ec03Tests {
   @TempDir
    private File tempDir

       @Test
    void test1() {
           String path = tempDir.getAbsolutePath();
           System.out.println(path);
       }
}
