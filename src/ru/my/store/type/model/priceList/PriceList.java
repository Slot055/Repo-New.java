package ru.my.store.type.model.priceList;

import ru.my.store.type.model.product.Product;

import ru.my.store.type.model.shelf.Shelf;


public class PriceList extends Product {

    public PriceList(String name, double price, int item) {
        super(name, price, item);
    }

    public PriceList() {
    }

    private Shelf shelf;

    public void print() {
        System.out.println("---------------------------------" + "\n" + "Прайс-лист: " +
                "\n" + "---------------------------------");
        Shelf shelf = new Shelf("Полка", 10, 10, 0);
        for (Product product : shelf.productOnTheShelf)
            System.out.println(product.toString());
        System.out.println("---------------------------------");
    }



    public Shelf getShelf() {
        return shelf;
    }


    public void setShelf(Shelf shelf) {
        this.shelf = shelf;
    }
}

