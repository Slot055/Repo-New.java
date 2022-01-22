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

    }



    public Shelf getShelf() {
        return shelf;
    }


    public void setShelf(Shelf shelf) {
        this.shelf = shelf;
    }
}

