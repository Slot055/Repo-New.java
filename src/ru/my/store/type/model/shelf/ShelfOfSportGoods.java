package ru.my.store.type.model.shelf;

import ru.my.store.type.model.product.Product;
import ru.my.store.type.model.product.sportGoods.Ball;
import ru.my.store.type.model.product.sportGoods.SportGoods;
import java.util.ArrayList;
import java.util.List;

public class ShelfOfSportGoods extends Shelf {
    private SportGoods sportGoods;

    public ShelfOfSportGoods(String nameShelf, int maxLot, int lot, int freeSpace) {
        super(nameShelf, maxLot, lot, freeSpace);
    }

    public ShelfOfSportGoods() {

    }

    public List<Product> productOnTheShelf = new ArrayList<>();


    {
        productOnTheShelf.add(new Ball("Мяч футбольный", 1500.00, 0, "Кожа", "Футбол",
                "Мультиколор", 5, "США", "Профессиональный", "5", 0.5, "Adidas", "Круглый"));
        productOnTheShelf.add(new Ball("Мяч футбольный", 1000.00, 1, "Кожа", "Футбол",
                "Мультиколор", 5, "США", "Тренировочный", "5", 0.5, "Reebok", "Круглый"));
        productOnTheShelf.add(new Ball("Мяч баскетбольный", 1750.00, 2, "Полиуретан", "Баскетбол",
                "Коричневый", 7, "США", "Профессиональный", "5", 0.5, "Nike", "Круглый"));
        productOnTheShelf.add(new Ball("Мяч для гольфа", 600.00, 3, "Текстиль", "Гольф",
                "Коричневый", 4, "США", "Профессиональный", "5", 0.5, "Adidas", "Круглый"));
        productOnTheShelf.add(new Ball("Мяч воллейбольный", 1650.00, 4, "Кожа", "Воллейбол",
                "Коричневый", 3, "США", "Профессиональный", "5", 0.5, "Nike", "Круглый"));

    }

    @Override
    public void coming() {
        System.out.println("Приход спортивных товаров на полку");

    }

    @Override
    public void outlay() {
        System.out.println("Расход спортивных товаров с полки");

    }

    public SportGoods getSportGoods() {
        return sportGoods;
    }

    public void setSportGoods(SportGoods sportGoods) {
        this.sportGoods = sportGoods;
    }
}
