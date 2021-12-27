package ru.my.store.type.model.priceList;

public class PriceListOfHomeTechnics extends PriceList {
    public PriceListOfHomeTechnics(String name, double price, int item) {
        super(name, price, item);
    }

    public PriceListOfHomeTechnics() {
    }
    public void print(){
        System.out.println("Вывод прайс-листа бытовой техники");
    }
}
