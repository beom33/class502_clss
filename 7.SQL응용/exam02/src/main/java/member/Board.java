package member;


import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Board {
    private int seq;
    private final String subject;
    private final String ccontent;
    private String poster;
}


