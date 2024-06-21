package exam01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Ex11 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("아약스");
        names.add("첼시");
        names.add("셀틱");
        names.add("리버풀");
        names.add("벤피카");

        Collections.swap(names, 1, 3);
        System.out.println(names);

        Collections.reverse(names);
        System.out.println(names);

        Collections.replaceAll(names, "셀틱", "본머스");
        System.out.println(names);
    }
}
