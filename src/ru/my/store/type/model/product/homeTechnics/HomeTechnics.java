package ru.my.store.type.model.product.homeTechnics;

import ru.my.store.type.model.CreateToObject;
import ru.my.store.type.model.basket.Basket;
import ru.my.store.type.model.priceList.PriceList;
import ru.my.store.type.model.product.Product;
import ru.my.store.type.model.priceList.PriceListOfHomeTechnics;
import ru.my.store.type.model.shelf.Shelf;
import ru.my.store.type.model.shelf.ShelfOfHomeTechnics;
import ru.my.store.type.model.staff.Hostess;
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
    private Basket basket;

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

    ShopAssistant shopAssistant = CreateToObject.createShopassistant("Семён", "продавец консультант отдела бытовой техники", 7);
    PriceListOfHomeTechnics priceListOfHomeTechnics = new PriceListOfHomeTechnics();

    @Override
    public void welcome(Scanner scanner) {
        System.out.println("Добро пожаловать в отдел Бытовой техники" + "\n" + "---------------------------------");
        shopAssistant.sayHello();
        Product topTeapot = new Teapot("Чайник электрический", 1700.00, 123789, "Электрический", "Белый",
                2.0, "Китай", "Ссылка на сайте www.eldorado.ru", 10);
        shopAssistant.advises(scanner, priceListOfHomeTechnics,topTeapot);

    }

    @Override
    public void helpShopAssistant(Scanner scanner, Shelf shelf, PriceList priceList, Product topTeapot) {
        shopAssistant.helpsWithTheChoice(scanner, topTeapot, priceListOfHomeTechnics, shelfOfHomeTechnics);
    }

    @Override
    public void choiceProduct(Scanner scanner, Shelf shelf, PriceList priceList) {
        System.out.println("Можем перейти к выбору продукта: " + "\n" + "---------------------------------");
        System.out.println("1 - Выбрать " + getName() + " по совету " + "продавца консультанта " + shopAssistant.getName()
                + "а" + "\n" + "2 - Выбрать товар из ассортимента в наличии");
        while (true) {
            ShelfOfHomeTechnics shelfOfHomeTechnics = new ShelfOfHomeTechnics("Полка 1", 10, 5, 5);
            for (Product homeTechnics : shelfOfHomeTechnics.productOnTheShelfHt) ;
            Basket basket = new Basket("Корзина", 1, 5, 0, 5);

            int a = scanner.nextInt();
            if (a == 1) {
                basket.basket.add(0, shelfOfHomeTechnics.productOnTheShelfHt.get(0));
                for (Product sum : basket.basket)
                    System.out.println(sum.toString());
                goToMoneyKassa(scanner, basket);
                break;
            } else if (a == 2) {
                System.out.println("Введите нужные артикулы из ассортимента, по окончанию выбора введите 99 : ");
                putOnBasket(scanner, shelfOfHomeTechnics, basket);
                break;
            } else {
                System.out.println("Извините, не понял" + "\n" + "1 - Выбрать " + getName() + " по совету " +
                        "продавца консультанта " + shopAssistant.getName()
                        + "а" + "\n" + "2 - Выбрать товар из ассортимента в наличии");
            }

        }
    }


    @Override
    public void takeFromTheShelf(Scanner scanner, Shelf shelf, PriceList priceList) {
        ShelfOfHomeTechnics shelfOfHomeTechnics = new ShelfOfHomeTechnics("Полка 2", 10, 5, 5);
        Basket basket = new Basket("Корзина", 1, 5, 0, 5);
        putOnBasket(scanner, shelfOfHomeTechnics, basket);

    }

    public void putOnBasket(Scanner scanner, ShelfOfHomeTechnics shelfOfHomeTechnics, Basket basket) {
        while (true) {
            int b = scanner.nextInt();
            if (b == 0) {
                basket.basket.add(0, shelfOfHomeTechnics.productOnTheShelfHt.get(0));
                System.out.println("Товары в корзине: ");
                for (Product sum : basket.basket)
                    System.out.println(sum.toString());

            } else if (b == 1) {
                basket.basket.add(0, shelfOfHomeTechnics.productOnTheShelfHt.get(1));
                System.out.println("Товары в корзине: ");
                for (Product sum : basket.basket)
                    System.out.println(sum.toString());

            } else if (b == 2) {
                basket.basket.add(0, shelfOfHomeTechnics.productOnTheShelfHt.get(2));
                System.out.println("Товары в корзине: ");
                for (Product sum : basket.basket)
                    System.out.println(sum.toString());

            } else if (b == 3) {
                basket.basket.add(0, shelfOfHomeTechnics.productOnTheShelfHt.get(3));
                System.out.println("Товары в корзине: ");
                for (Product sum : basket.basket)
                    System.out.println(sum.toString());

            } else if (b == 4) {
                basket.basket.add(0, shelfOfHomeTechnics.productOnTheShelfHt.get(4));
                System.out.println("Товары в корзине: ");
                for (Product sum : basket.basket)
                    System.out.println(sum.toString());

            } else if (b == 99) {
                goToMoneyKassa(scanner, basket);
                break;

            } else {
                System.out.println("Такого артикула пока нет, выберете артикул из ассортимента");
            }
        }
    }

    @Override
    public void goToMoneyKassa(Scanner scanner, Basket basket) {
        System.out.println("Товары в корзине" + "\n" + "1 - Пройти на кассу" + "\n" + "2 - Воспользоваться помощью продавца консультанта");
        while (true) {
            int c = scanner.nextInt();
            if (c == 1) {
                Hostess hostess = new Hostess("Марина", "Хостесс", 1);
                System.out.println("Здравствуйте, я " + hostess.getPosition() + " меня зовут " +
                        hostess.getName() + " я провожу Вас на кассу" + "\n" + "---------------------------------");
                hostess.escortsToMoneyKassa(scanner,basket);
                break;
            } else if (c == 2) {
                welcome(scanner);
                break;
            } else {
                System.out.println("Такой команды нет" + "\n" + "1 - Пройти на кассу" + "\n" + "2 - Воспользоваться помощью продавца консультанта");
            }
        }
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

    @Override
    public Basket getBasket() {
        return basket;
    }

    @Override
    public void setBasket(Basket basket) {
        this.basket = basket;
    }
}


