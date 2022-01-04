package ru.my.store.type.model.shelf;

import ru.my.store.type.model.product.Product;
import ru.my.store.type.model.product.homeTechnics.HomeTechnics;
import ru.my.store.type.model.product.homeTechnics.Teapot;

public class ShelfOfHomeTechnics extends Shelf {
    private HomeTechnics homeTechnics;
    public ShelfOfHomeTechnics(String nameShelf, int maxLot, int lot, int freeSpace) {
        super(nameShelf, maxLot, lot, freeSpace);
    }

    public ShelfOfHomeTechnics() {

    }
    public Product[] productOnTheShelf = {new Teapot("Чайник электрический", 1700.00, 123789, "Электрический", "Белый",
            2.0, "Китай", "Ссылка на сайте www.eldorado.ru", 10),
            new Teapot("Чайник электрический", 1450.00, 123788, "Электрический", "Мультиколор",
            1.0, "Китай", "Ссылка на сайте www.eldorado.ru", 9),
            new Teapot("Чайник для плиты", 1300.00, 123787, "Для плиты", "Металлик",
            2.0, "Китай", "Ссылка на сайте www.eldorado.ru", 8),
    new Teapot("Чайник походный", 1900.00, 123789, "Походный", "Чёрный",
            2.0, "Китай", "Ссылка на сайте www.eldorado.ru", 10)};

    @Override
    public void coming() {
        System.out.println("Приход товаров бытовой техники на полку");

    }

    @Override
    public void outlay() {
        System.out.println("Расход товаров бытовой техники с полки");

    }

    public HomeTechnics getHomeTechnics() {
        return homeTechnics;
    }

    public void setHomeTechnics(HomeTechnics homeTechnics) {
        this.homeTechnics = homeTechnics;
    }
}
