package ru.my.store.type.model.priceList;

public class PriceListOfAlcohol extends PriceList {
    public PriceListOfAlcohol(String name, double price, int item) {
        super(name, price, item);
    }

    public PriceListOfAlcohol() {

    }


    public void print() {
        System.out.println("Вывод прайс-листа алкоголя");
    }
}
