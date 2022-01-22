package ru.my.store.type.model.priceList;
import ru.my.store.type.model.product.Product;
import ru.my.store.type.model.shelf.ShelfOfSportGoods;

public class PriceListOfSportGoods extends PriceList {
    public PriceListOfSportGoods(String name, double price, int item) {
        super(name, price, item);
    }

    public PriceListOfSportGoods() {
    }


    private ShelfOfSportGoods shelfOfSportGoods;

    public void print() {
        System.out.println("---------------------------------" + "\n" + "Прайс-лист спортивных товаров: " +
                "\n" + "---------------------------------");
        ShelfOfSportGoods shelfOfSportGoods = new ShelfOfSportGoods("Полка 1", 10,5,5);
        for (Product sportGoods : shelfOfSportGoods.productOnTheShelf)
            System.out.println(sportGoods.toString());
        System.out.println("---------------------------------");
    }

    public ShelfOfSportGoods getShelfOfSportGoods() {
        return shelfOfSportGoods;
    }

    public void setShelfOfSportGoods(ShelfOfSportGoods shelfOfSportGoods) {
        this.shelfOfSportGoods = shelfOfSportGoods;
    }


}
