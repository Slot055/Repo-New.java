package ru.my.store.type.model.priceList;

import ru.my.store.type.model.product.alcohol.Alcohol;
import ru.my.store.type.model.product.alcohol.Beer;
import ru.my.store.type.model.product.homeTechnics.Teapot;
import ru.my.store.type.model.shelf.ShelfOfAlcohol;
import ru.my.store.type.model.shelf.ShelfOfHomeTechnics;

public class PriceListOfAlcohol extends PriceList {
    public PriceListOfAlcohol(String name, double price, int item) {
        super(name, price, item);
    }

    public PriceListOfAlcohol() {

    }
    private Alcohol alcohol;
    private ShelfOfAlcohol shelfOfAlcohol;


    public void print() {
        System.out.println("---------------------------------" + "\n" + "Прайс-лист бытовой техники: " +
                "\n" + "---------------------------------");
        ShelfOfAlcohol shelfOfAlcohol = new ShelfOfAlcohol("Полка 3", 10,10,0);
        for (Beer beer : shelfOfAlcohol.productOnTheShelf)
            System.out.println(beer.toString());
        System.out.println("---------------------------------");
    }

    public Alcohol getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(Alcohol alcohol) {
        this.alcohol = alcohol;
    }

    public ShelfOfAlcohol getShelfOfAlcohol() {
        return shelfOfAlcohol;
    }

    public void setShelfOfAlcohol(ShelfOfAlcohol shelfOfAlcohol) {
        this.shelfOfAlcohol = shelfOfAlcohol;
    }
}
