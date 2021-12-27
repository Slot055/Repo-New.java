package ru.my.store.type.model.priceList;

public class PriceListOfSportGoods extends PriceList {
    public PriceListOfSportGoods(String name, double price, int item) {
        super(name, price, item);
    }

    public PriceListOfSportGoods() {
    }

    public void print(){
        System.out.println("Вывод прайс-листа спортивных товаров");
    }
}
