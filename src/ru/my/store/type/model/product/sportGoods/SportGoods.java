package ru.my.store.type.model.product.sportGoods;

import ru.my.store.type.model.basket.Basket;
import ru.my.store.type.model.priceList.PriceListOfSportGoods;
import ru.my.store.type.model.product.Product;
import ru.my.store.type.model.shelf.ShelfOfSportGoods;
import ru.my.store.type.model.staff.ShopAssistant;
import ru.my.store.type.model.staff.Staff;

import java.util.Scanner;

public class SportGoods extends Product {

    private String matter;
    private String purposeOfGood;
    private String color;
    private double guaranteePeriod;
    private String manufacturer;
    private Staff staff;
    private ShelfOfSportGoods shelfOfSportGoods;


    public SportGoods(String name, double price, int item, String matter, String purposeOfGood, String color,
                      double guaranteePeriod, String manufacturer) {
        super(name, price, item);
        this.matter = matter;
        this.purposeOfGood = purposeOfGood;
        this.color = color;
        this.guaranteePeriod = guaranteePeriod;
        this.manufacturer = manufacturer;

    }

    public SportGoods() {
    }


    ShopAssistant shopAssistant = new ShopAssistant("Виктор", "продавец консультант отдела Спортивных товаров",
            5);
    PriceListOfSportGoods priceListOfSportGoods = new PriceListOfSportGoods("Мяч", 500.00, 123);


    public void welcome(Scanner scanner) {
        System.out.println("Добро пожаловать в отдел Спортивных продуктов" + "\n" + "---------------------------------");
        shopAssistant.sayHello();

        Ball topBall = new Ball("Мяч футбольный", 1500.00, 0, "Кожа", "Футбол",
                "Мультиколор", 5, "США", "Профессиональный", "5", 0.5, "Adidas", "Круглый");
        shopAssistant.advises(scanner, priceListOfSportGoods);
        shopAssistant.helpsWithTheChoice(scanner, topBall,priceListOfSportGoods,shelfOfSportGoods);
    }


    @Override
    public void choiceProduct() {
        System.out.println("Можем перейти к выбору продукта: " + "\n" + "---------------------------------");
        System.out.println("1 - Выбрать " + getName() + " по совету " + "продавца консультанта " + shopAssistant.getName() + "а" + "\n" + "2 - Выбрать товар из ассортимента в наличии");
    }


    public void testGood() {
        System.out.println("Товар протестирован");
    }

    public String getMatter() {
        return matter;
    }

    public void setMatter(String matter) {
        this.matter = matter;
    }

    public String getPurposeOfGood() {
        return purposeOfGood;
    }

    public void setPurposeOfGood(String purposeOfGood) {
        this.purposeOfGood = purposeOfGood;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getGuaranteePeriod() {
        return guaranteePeriod;
    }

    public void setGuaranteePeriod(double guaranteePeriod) {
        this.guaranteePeriod = guaranteePeriod;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public ShelfOfSportGoods getShelfOfSportGoods() {
        return shelfOfSportGoods;
    }

    public void setShelfOfSportGoods(ShelfOfSportGoods shelfOfSportGoods) {
        this.shelfOfSportGoods = shelfOfSportGoods;
    }
}
