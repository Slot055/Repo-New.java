package ru.my.store.type.model.shelf;

public class ShelfOfSportGoods extends Shelf {
    public ShelfOfSportGoods(String nameProduct,int maxLot, int lot, int freeSpace) {
        super(nameProduct,maxLot, lot, freeSpace);
    }

    public ShelfOfSportGoods() {

    }

    @Override
    public void coming() {
        System.out.println("Приход спортивных товаров на полку");

    }

    @Override
    public void outlay() {
        System.out.println("Расход спортивных товаров с полки");

    }
}
