package ru.my.store.type.model.product.alcohol;

import ru.my.store.type.model.basket.Basket;
import ru.my.store.type.model.product.Product;
import ru.my.store.type.model.priceList.PriceListOfAlcohol;
import ru.my.store.type.model.shelf.ShelfOfAlcohol;
import ru.my.store.type.model.staff.Staff;
import ru.my.store.type.model.staff.ShopAssistant;

import java.util.Scanner;

public class Alcohol extends Product {
    private double expirationDate;
    private double size;
    private double volume;
    private String manufacturer;
    private String pack;
    private Staff staff;
    private ShelfOfAlcohol shelfOfAlcohol;

    public Alcohol(String name, double price, int item, double expirationDate, double size, double volume, String manufacturer, String pack) {
        super(name, price, item);
        this.expirationDate = expirationDate;
        this.size = size;
        this.volume = volume;
        this.manufacturer = manufacturer;
        this.pack = pack;
    }

    public Alcohol() {
    }

    ShopAssistant shopAssistant = new ShopAssistant("Олег", "продавец консультант отдела алкоголь", 5);
    PriceListOfAlcohol priceListOfAlcohol = new PriceListOfAlcohol();

    public void welcome(Scanner scanner) {
        System.out.println("Добро пожаловать в отдел Алкоголь" + "\n" + "---------------------------------");
        shopAssistant.sayHello();
        Beer topBeer = new Beer("Пиво Жигулёвское", 75.00,123321,10,5.8,0.5,"Россия","Стекло");
        shopAssistant.advises(scanner,priceListOfAlcohol);
        shopAssistant.helpsWithTheChoice(scanner,topBeer,priceListOfAlcohol,shelfOfAlcohol);

    }

    @Override
    public void choiceProduct() {
        System.out.println("Можем перейти к выбору продукта: " + "\n" + "---------------------------------");
        System.out.println("1 - Выбрать " + getName() + " по совету " + "продавца консультанта " + shopAssistant.getName() + "а" + "\n" + "2 - Выбрать товар из ассортимента в наличии");
    }

    void visualInspectoin() {
        System.out.println("Продукт осмотрен");
    }

    public double getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(double expirationDate) {
        this.expirationDate = expirationDate;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getPack() {
        return pack;
    }

    public void setPack(String pack) {
        this.pack = pack;
    }


    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public ShelfOfAlcohol getShelfOfAlcohol() {
        return shelfOfAlcohol;
    }

    public void setShelfOfAlcohol(ShelfOfAlcohol shelfOfAlcohol) {
        this.shelfOfAlcohol = shelfOfAlcohol;
    }
}
