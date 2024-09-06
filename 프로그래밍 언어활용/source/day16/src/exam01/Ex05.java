package exam01;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Ex05 {
    public static void main(String[] args) {
        String[] names = {"본머스1", "크리스탈펠리스1", "첼시2", "맨시티3", "맨유4", "뉴캐슬5"};
        List<String> namesList = Arrays.stream(names)
                //.collect(Collectors.toList());
                        .toList();

        System.out.println(namesList);

        Set<String> namesSet = Arrays.stream(names)
                .collect(Collectors.toSet());
        System.out.println(namesSet); //중복 제거

    }
}
