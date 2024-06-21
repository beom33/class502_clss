package exam01;

import java.util.Arrays;
import java.util.List;

public class Ex07 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("첼시",  "레스터","본머스","아스날","에버튼");

        String[] selected =  names.stream()
                .peek(System.out ::println)
                .skip(2)
                .limit(2)
                //.toArray(i -> new String[i]);
                        .toArray(String[]::new);

        System.out.println(Arrays.toString(selected));
    }
}
