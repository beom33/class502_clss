package exam01;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Ex01 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("첼시1", "아약스2", "바르셀로나3","도르트문트4");
        names.forEach(s -> System.out.println(s));


    }
}
