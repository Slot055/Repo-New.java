package ru.my.store.type.model.shelf;

import ru.my.store.type.model.product.Product;
import ru.my.store.type.model.product.homeTechnics.HomeTechnics;
import ru.my.store.type.model.product.homeTechnics.Teapot;
import java.util.ArrayList;
import java.util.List;

public class ShelfOfHomeTechnics extends Shelf {
    private HomeTechnics homeTechnics;

    public ShelfOfHomeTechnics(String nameShelf, int maxLot, int lot, int freeSpace) {
        super(nameShelf, maxLot, lot, freeSpace);
    }

    public ShelfOfHomeTechnics() {

    }

    public List<Product> productOnTheShelfHt = new ArrayList<>();

    {
        productOnTheShelfHt.add(new Teapot("Чайник электрический", 1700.00, 0, "Электрический", "Белый",
                2.0, "Китай", "Ссылка на сайте www.eldorado.ru", 10));
        productOnTheShelfHt.add(new Teapot("Чайник электрический", 1450.00, 1, "Электрический", "Мультиколор",
                1.0, "Китай", "Ссылка на сайте www.eldorado.ru", 9));
        productOnTheShelfHt.add(new Teapot("Чайник для плиты", 1300.00, 2, "Для плиты", "Металлик",
                2.0, "Китай", "Ссылка на сайте www.eldorado.ru", 8));
        productOnTheShelfHt.add(new Teapot("Чайник походный", 1900.00, 3, "Походный", "Чёрный",
                2.0, "Россия", "Ссылка на сайте www.eldorado.ru", 10));
        productOnTheShelfHt.add(new Teapot("Чайник походный", 1850.00, 4, "Походный", "Серый",
                2.0, "Китай", "Ссылка на сайте www.eldorado.ru", 8));

    }

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
