package ru.my.store.type.model.priceList;

import ru.my.store.type.model.product.Product;
import ru.my.store.type.model.shelf.ShelfOfHomeTechnics;

import java.util.List;

public class PriceListOfHomeTechnics extends PriceList {
    public PriceListOfHomeTechnics(String name, double price, int item) {
        super(name, price, item);
    }

    public PriceListOfHomeTechnics() {
    }

    private ShelfOfHomeTechnics shelfOfHomeTechnics;

    public void print(){
        System.out.println("---------------------------------" + "\n" + "Прайс-лист бытовой техники: " +
                "\n" + "---------------------------------");
        ShelfOfHomeTechnics shelfOfHomeTechnics = new ShelfOfHomeTechnics("Полка 2", 10,4,6);
        for (Product homeTechnics : shelfOfHomeTechnics.productOnTheShelfHt)
            System.out.println(homeTechnics.toString());
        System.out.println("---------------------------------");
    }



    public ShelfOfHomeTechnics getShelfOfHomeTechnics() {
        return shelfOfHomeTechnics;
    }

    public void setShelfOfHomeTechnics(ShelfOfHomeTechnics shelfOfHomeTechnics) {
        this.shelfOfHomeTechnics = shelfOfHomeTechnics;
    }
}
