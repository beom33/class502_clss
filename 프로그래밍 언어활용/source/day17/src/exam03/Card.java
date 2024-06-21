package exam03;

public class Card {

    private  static  int num;
    private  String holder;

    public Card(String holder) {
        this.holder = holder;
        ++num;
    }
    public String toString() {
        return String.format("카드번호: %d,카드소유자")
    }
}
