package ru.my.store.type.model.shelf;

public class ShelfOfAlcohol extends Shelf {
    public ShelfOfAlcohol(String nameProduct, int maxLot, int lot, int freeSpace) {
        super(nameProduct, maxLot, lot, freeSpace);
    }

    public ShelfOfAlcohol() {
    }

    @Override
    public void coming() {
        System.out.println("Приход алкогольных продуктов на полку");

    }

    @Override
    public void outlay() {
        System.out.println("Расход алкогольных продуктов с полки");

    }
}
