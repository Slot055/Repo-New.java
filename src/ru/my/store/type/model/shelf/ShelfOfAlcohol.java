package ru.my.store.type.model.shelf;
import ru.my.store.type.model.product.Product;
import ru.my.store.type.model.product.alcohol.Alcohol;
import ru.my.store.type.model.product.alcohol.Beer;
import java.util.ArrayList;
import java.util.List;


public class ShelfOfAlcohol extends Shelf {
    private Alcohol alcohol;

    public ShelfOfAlcohol(String nameShelf, int maxLot, int lot, int freeSpace) {
        super(nameShelf, maxLot, lot, freeSpace);
    }

    public ShelfOfAlcohol() {
    }

    public List<Product> productOnTheShelfAlc = new ArrayList<>();

    {
        productOnTheShelfAlc.add(new Beer("Пиво Жигулёвское", 75.00, 0, 10, 5.8, 0.5, "Россия", "Стекло"));
        productOnTheShelfAlc.add(new Beer("Пиво Bavaria", 97.00, 1, 7, 3.5, 0.5, "Germany", "Стекло"));
        productOnTheShelfAlc.add(new Beer("Пиво Kozel", 80.00, 2, 8, 6.5, 0.5, "Czech", "Стекло"));
        productOnTheShelfAlc.add(new Beer("Пиво Bud", 60.00, 3, 6, 4.7, 0.5, "Россия", "Стекло"));
        productOnTheShelfAlc.add(new Beer("Пиво Оболонь", 70.00, 4, 6, 5.0, 0.5, "Украина", "Стекло"));
    }

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
