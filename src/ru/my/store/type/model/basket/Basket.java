package ru.my.store.type.model.basket;

import ru.my.store.type.model.priceList.PriceList;
import ru.my.store.type.model.product.Product;
import ru.my.store.type.model.shelf.Shelf;
import java.util.ArrayList;
import java.util.List;


public class Basket {
    private String nameBasket;
    private int numBasket;
    private int maxLot;
    private int lot;
    private int freeSpace;
    private Product product;
    private Shelf shelf;
    private PriceList priceList;

    public Basket(String nameBasket, int numBasket, int maxLot, int lot, int freeSpace) {
        this.nameBasket = nameBasket;
        this.numBasket = numBasket;
        this.maxLot = maxLot;
        this.lot = lot;
        this.freeSpace = freeSpace;

    }

    public Basket() {
    }

    public List<Product> basket = new ArrayList<>();

    {


    }

    public String getNameBasket() {
        return nameBasket;
    }

    public void setNameBasket(String nameBasket) {
        this.nameBasket = nameBasket;
    }

    public int getNumBasket() {
        return numBasket;
    }

    public void setNumBasket(int numBasket) {
        this.numBasket = numBasket;
    }

    public int getMaxLot() {
        return maxLot;
    }

    public void setMaxLot(int maxLot) {
        this.maxLot = maxLot;
    }

    public int getLot() {
        return lot;
    }

    public void setLot(int lot) {
        this.lot = lot;
    }

    public int getFreeSpace() {
        return freeSpace;
    }

    public void setFreeSpace(int freeSpace) {
        this.freeSpace = freeSpace;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Shelf getShelf() {
        return shelf;
    }

    public void setShelf(Shelf shelf) {
        this.shelf = shelf;
    }

    public PriceList getPriceList() {
        return priceList;
    }

    public void setPriceList(PriceList priceList) {
        this.priceList = priceList;
    }
}
