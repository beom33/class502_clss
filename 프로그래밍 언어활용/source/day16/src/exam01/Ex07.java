package exam01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Ex07 {
    public static void main(String[] args) {
        String[] names = {"본머스1", "크리스탈펠리스1", "첼시2", "맨시티3", "맨유4", "뉴캐슬5"};


        ArrayList<String> items = Arrays.stream(names)
                .collect(Collectors.toCollection(ArrayList::new ));
        //.collect(Collectors.toCollection(() -> new ArrayList<>()));
        System.out.println(items);
    }
}
