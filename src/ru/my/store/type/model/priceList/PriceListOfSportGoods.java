package ru.my.store.type.model.priceList;

public class PriceListOfSportGoods extends PriceList {
    public PriceListOfSportGoods(String name, double price, int item) {
        super(name, price, item);
    }

    public PriceListOfSportGoods() {
    }

    String[] PriceListOfSportGoods = {"Мяч - 1500.00", "Бейсбольная бита - 700.00", "Клюшка для хоккея - 2500.00"};

    public void print() {
        System.out.println("---------------------------------" + "\n" + "Вывод прайс-листа спортивных товаров: " +
                "\n" + "---------------------------------");
        for (String sum : PriceListOfSportGoods)
            System.out.println(sum);
        System.out.println("---------------------------------");
    }
}
