package ru.my.store.type.model.product.alcohol;

import ru.my.store.type.model.product.Product;
import ru.my.store.type.model.priceList.PriceListOfAlcohol;
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
        shopAssistant.advises(scanner, priceListOfAlcohol);
        shopAssistant.helpsWithTheChoice();

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
}
