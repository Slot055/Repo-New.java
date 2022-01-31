package ru.my.store.type.model;
import ru.my.store.type.OfflineStore;
import ru.my.store.type.model.basket.Basket;
import ru.my.store.type.model.moneyKassa.MoneyKassa;
import ru.my.store.type.model.priceList.PriceList;
import ru.my.store.type.model.priceList.PriceListOfSportGoods;
import ru.my.store.type.model.product.alcohol.Alcohol;
import ru.my.store.type.model.product.homeTechnics.HomeTechnics;
import ru.my.store.type.model.product.sportGoods.SportGoods;
import ru.my.store.type.model.shelf.Shelf;
import ru.my.store.type.model.shelf.ShelfOfSportGoods;
import ru.my.store.type.model.staff.Hostess;
import ru.my.store.type.model.staff.ShopAssistant;
import ru.my.store.type.model.staff.Staff;

import java.util.Date;
import java.util.Scanner;

public class CreateToObject {

    public static Date createDate() {
        return new Date();
    }
    public static OfflineStore createOfflineStore() {
        return new OfflineStore("Ашан", 1000.0, "08:00-23:00",
                "г. Москва", "8(800)123-45-67");
    }
    public static Hostess createHostess() {
        return new Hostess("Оксана", "Хостесс", 2);
    }
    public static HomeTechnics createHomeTechnics() {
        return new HomeTechnics();
    }

    public static SportGoods createSportGoods() {
        return new SportGoods();
    }

    public static Alcohol createAlcohol() {
        return new Alcohol();
    }
    public static MoneyKassa createMoneyKassa() {
        return new MoneyKassa(1);
    }
    public static ShopAssistant createShopassistant(String name,String position,double expirience){
        return new ShopAssistant(name, position,
                expirience);
    }
    public static PriceListOfSportGoods createPriceListOfSportGoods(){
        return new PriceListOfSportGoods("Мяч", 500.00, 123);
    }
    public static ShelfOfSportGoods createShelfOfSportGoods(Scanner scanner, Shelf shelf, PriceList priceList) {
        return new ShelfOfSportGoods("Полка", 10, 5, 5);
    }
    public static Basket createBasket(Scanner scanner,Shelf shelf,PriceList priceList) {
        return new Basket("Корзина", 1, 5, 0, 5);
    }
}
