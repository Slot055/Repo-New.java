package ru.my.store.type.model.priceList;

import ru.my.store.type.model.product.Product;

import ru.my.store.type.model.shelf.ShelfOfAlcohol;


public class PriceListOfAlcohol extends PriceList {
    public PriceListOfAlcohol(String name, double price, int item) {
        super(name, price, item);
    }

    public PriceListOfAlcohol() {

    }

    private ShelfOfAlcohol shelfOfAlcohol;


    public void print() {
        System.out.println("---------------------------------" + "\n" + "Прайс-лист алкоголя: " +
                "\n" + "---------------------------------");
        ShelfOfAlcohol shelfOfAlcohol = new ShelfOfAlcohol("Полка 3", 10,4,6);
        for (Product alcohol : shelfOfAlcohol.productOnTheShelf)
            System.out.println(alcohol.toString());
        System.out.println("---------------------------------");
    }



    public ShelfOfAlcohol getShelfOfAlcohol() {
        return shelfOfAlcohol;
    }

    public void setShelfOfAlcohol(ShelfOfAlcohol shelfOfAlcohol) {
        this.shelfOfAlcohol = shelfOfAlcohol;
    }
}
