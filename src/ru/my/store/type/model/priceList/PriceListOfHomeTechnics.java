package ru.my.store.type.model.priceList;

import ru.my.store.type.model.product.Product;
import ru.my.store.type.model.product.homeTechnics.HomeTechnics;
import ru.my.store.type.model.product.homeTechnics.Teapot;
import ru.my.store.type.model.product.sportGoods.Ball;
import ru.my.store.type.model.shelf.Shelf;
import ru.my.store.type.model.shelf.ShelfOfHomeTechnics;
import ru.my.store.type.model.shelf.ShelfOfSportGoods;

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
        ShelfOfHomeTechnics shelfOfHomeTechnics = new ShelfOfHomeTechnics("Полка 2", 10,10,0);
        for (Product homeTechnics : shelfOfHomeTechnics.productOnTheShelf)
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
