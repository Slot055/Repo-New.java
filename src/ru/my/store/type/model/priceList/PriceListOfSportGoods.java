package ru.my.store.type.model.priceList;

import javafx.scene.chart.LineChart;
import ru.my.store.type.model.product.sportGoods.Ball;
import ru.my.store.type.model.product.sportGoods.SportGoods;
import ru.my.store.type.model.shelf.Shelf;
import ru.my.store.type.model.shelf.ShelfOfSportGoods;

public class PriceListOfSportGoods extends PriceList {
    public PriceListOfSportGoods(String name, double price, int item) {
        super(name, price, item);
    }

    public PriceListOfSportGoods() {
    }

    private SportGoods sportGoods;
    private ShelfOfSportGoods shelfOfSportGoods;

    public void print() {
        System.out.println("---------------------------------" + "\n" + "Прайс-лист спортивных товаров: " +
                "\n" + "---------------------------------");
        ShelfOfSportGoods shelfOfSportGoods = new ShelfOfSportGoods("Полка 1", 10,10,0);
        for (Ball ball : shelfOfSportGoods.productOnTheShelf)
            System.out.println(ball.toString());
        System.out.println("---------------------------------");
    }

    public ShelfOfSportGoods getShelfOfSportGoods() {
        return shelfOfSportGoods;
    }

    public void setShelfOfSportGoods(ShelfOfSportGoods shelfOfSportGoods) {
        this.shelfOfSportGoods = shelfOfSportGoods;
    }

    public SportGoods getSportGoods() {
        return sportGoods;
    }

    public void setSportGoods(SportGoods sportGoods) {
        this.sportGoods = sportGoods;
    }
}
