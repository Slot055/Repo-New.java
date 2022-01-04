package ru.my.store.type.model.shelf;

import ru.my.store.type.model.product.Product;
import ru.my.store.type.model.product.alcohol.Alcohol;
import ru.my.store.type.model.product.alcohol.Beer;
import ru.my.store.type.model.product.homeTechnics.Teapot;

public class ShelfOfAlcohol extends Shelf {
    private Alcohol alcohol;
    public ShelfOfAlcohol(String nameShelf, int maxLot, int lot, int freeSpace) {
        super(nameShelf, maxLot, lot, freeSpace);
    }

    public ShelfOfAlcohol() {
    }
    public Product[] productOnTheShelf = {new Beer("Пиво Жигулёвское", 75.00,123321,10,5.8,0.5,"Россия","Стекло"),
            new Beer("Пиво Bavaria", 97.00,123322,7,3.5,0.5,"Germany","Стекло"),
            new Beer("Пиво Kozel", 80.00,123323,8,6.5,0.5,"Czech","Стекло"),
            new Beer("Пиво Bud", 60.00,123324,6,4.7,0.5,"Россия","Стекло")};

    @Override
    public void coming() {
        System.out.println("Приход алкогольных продуктов на полку");

    }

    @Override
    public void outlay() {
        System.out.println("Расход алкогольных продуктов с полки");

    }

    public Alcohol getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(Alcohol alcohol) {
        this.alcohol = alcohol;
    }
}
