package Card;

import java.util.Map;

public class AbstractCoffeeShop implements CoffeeShop{
    private String name; // 커피숍 이름
    private int totalSalePrice; // 매출
    private Map <String, Integer> menus; // 메뉴
    private Person person;

    public AbstractCoffeeShop (String name, Map <String, Integer> menus) {
        this.name = name;
        this.menus = menus;
    }

    @Override
    public CoffeeShop enter(Person person) {
        return null;
    }

    @Override
    public CoffeeShop order() {
        return null;
    }

    @Override
    public void exit() {

    }

    @Override
    public int getTotalSalePrice() {
        return 0;
    }

    @Override
    public String getName() {
        return "";
    }
}
