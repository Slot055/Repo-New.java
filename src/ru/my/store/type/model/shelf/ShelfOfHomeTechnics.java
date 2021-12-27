package ru.my.store.type.model.shelf;

public class ShelfOfHomeTechnics extends Shelf {
    public ShelfOfHomeTechnics(String nameProduct, int maxLot, int lot, int freeSpace) {
        super(nameProduct, maxLot, lot, freeSpace);
    }

    public ShelfOfHomeTechnics() {

    }

    @Override
    public void coming() {
        System.out.println("Приход товаров бытовой техники на полку");

    }

    @Override
    public void outlay() {
        System.out.println("Расход товаров бытовой техники с полки");

    }
}
