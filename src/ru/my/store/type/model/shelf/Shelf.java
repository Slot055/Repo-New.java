package ru.my.store.type.model.shelf;

import ru.my.store.type.model.product.Product;

public class Shelf {

    int [] ProductOnTheShelf = {1,2,3,4,5,6,7,8,9,10};
    private String nameProduct;
    private int maxLot;
    private int lot;
    private int freeSpace;
    private Product product;



    public Shelf(String nameProduct, int maxLot, int lot, int freeSpace) {
        this.nameProduct = nameProduct;
        this.maxLot = maxLot;
        this.lot = lot;
        this.freeSpace = freeSpace;
    }

    public Shelf() {

    }

    public void coming() {
        System.out.println("Приход товара");

    }

    public void outlay() {
        System.out.println("Расход товара");

    }

    public int getMaxLot() {
        return maxLot;
    }

    public void setMaxLot(int maxLot) {
        this.maxLot = maxLot;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
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
}
