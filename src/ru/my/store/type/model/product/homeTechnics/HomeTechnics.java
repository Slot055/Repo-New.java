package ru.my.store.type.model.product.homeTechnics;

import ru.my.store.type.model.product.Product;
import ru.my.store.type.model.priceList.PriceListOfHomeTechnics;
import ru.my.store.type.model.shelf.ShelfOfHomeTechnics;
import ru.my.store.type.model.staff.Staff;
import ru.my.store.type.model.staff.ShopAssistant;

import java.util.Scanner;

public class HomeTechnics extends Product {
    private String color;
    private double guaranteePeriod;
    private String manufacturer;
    private String technicalSpecifications;
    private int rating;
    private Staff staff;
    private ShelfOfHomeTechnics shelfOfHomeTechnics;

    public HomeTechnics(String name, double price, int item, String color, double guaranteePeriod, String manufacturer, String technicalSpecifications, int rating) {
        super(name, price, item);

        this.color = color;
        this.guaranteePeriod = guaranteePeriod;
        this.manufacturer = manufacturer;
        this.technicalSpecifications = technicalSpecifications;
        this.rating = rating;

    }

    public HomeTechnics() {
    }

    ShopAssistant shopAssistant = new ShopAssistant("Семён", "продавец консультант отдела бытовой техники", 7);
    PriceListOfHomeTechnics priceListOfHomeTechnics = new PriceListOfHomeTechnics();

    public void welcome(Scanner scanner) {
        System.out.println("Добро пожаловать в отдел Бытовой техники" + "\n" + "---------------------------------");
        shopAssistant.sayHello();
        Teapot topTeapot = new Teapot("Чайник электрический", 1700.00, 123789, "Электрический", "Белый",
                2.0, "Китай", "Ссылка на сайте www.eldorado.ru", 10);
        shopAssistant.advises(scanner, priceListOfHomeTechnics);
        shopAssistant.helpsWithTheChoice(scanner, topTeapot,priceListOfHomeTechnics,shelfOfHomeTechnics);
    }

    @Override
    public void choiceProduct() {
        System.out.println("Можем перейти к выбору продукта: " + "\n" + "---------------------------------");
        System.out.println("1 - Выбрать " + getName() + " по совету " + "продавца консультанта " + shopAssistant.getName() + "а" + "\n" + "2 - Выбрать товар из ассортимента в наличии");
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

    public String getTechnicalSpecifications() {
        return technicalSpecifications;
    }

    public void setTechnicalSpecifications(String technicalSpecifications) {
        this.technicalSpecifications = technicalSpecifications;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }


    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public ShelfOfHomeTechnics getShelfOfHomeTechnics() {
        return shelfOfHomeTechnics;
    }

    public void setShelfOfHomeTechnics(ShelfOfHomeTechnics shelfOfHomeTechnics) {
        this.shelfOfHomeTechnics = shelfOfHomeTechnics;
    }
}


