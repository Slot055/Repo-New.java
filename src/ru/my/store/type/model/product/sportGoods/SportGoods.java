package ru.my.store.type.model.product.sportGoods;


import ru.my.store.type.model.basket.Basket;
import ru.my.store.type.model.moneyKassa.MoneyKassa;
import ru.my.store.type.model.priceList.PriceList;
import ru.my.store.type.model.priceList.PriceListOfSportGoods;
import ru.my.store.type.model.product.Product;
import ru.my.store.type.model.shelf.Shelf;
import ru.my.store.type.model.shelf.ShelfOfSportGoods;
import ru.my.store.type.model.staff.Hostess;
import ru.my.store.type.model.staff.ShopAssistant;
import ru.my.store.type.model.staff.Staff;

import java.util.Arrays;
import java.util.Scanner;

public class SportGoods extends Product {

    private String matter;
    private String purposeOfGood;
    private String color;
    private double guaranteePeriod;
    private String manufacturer;
    private Staff staff;
    private ShelfOfSportGoods shelfOfSportGoods;
    private Basket basket;
    private MoneyKassa moneyKassa;
    private Hostess hostess;


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

    @Override
    public void welcome(Scanner scanner) {
        System.out.println("Добро пожаловать в отдел Спортивных продуктов" + "\n" + "---------------------------------");
        shopAssistant.sayHello();
        Product topBall = new Ball("Мяч футбольный", 1500.00, 0, "Кожа", "Футбол",
                "Мультиколор", 5, "США", "Профессиональный", "5", 0.5, "Adidas", "Круглый");
        shopAssistant.advises(scanner, priceListOfSportGoods, topBall);

    }

    public void helpShopAssistant(Scanner scanner, Shelf shelf, PriceList priceList, Product topBall) {

        shopAssistant.helpsWithTheChoice(scanner, topBall, priceListOfSportGoods, shelfOfSportGoods);
    }

    @Override
    public void choiceProduct(Scanner scanner, Shelf shelf, PriceList priceList) {
        System.out.println("Можем перейти к выбору продукта: " + "\n" + "---------------------------------");
        System.out.println("1 - Выбрать " + getName() + " по совету " + "продавца консультанта " + shopAssistant.getName()
                + "а" + "\n" + "2 - Выбрать товар из ассортимента в наличии");
        while (true) {
            ShelfOfSportGoods shelfOfSportGoods = new ShelfOfSportGoods("Полка 1", 10, 5, 5);
            for (Product sportGoods : shelfOfSportGoods.productOnTheShelf) ;
            Basket basket = new Basket("Корзина", 1, 5, 0, 5);

            int a = scanner.nextInt();
            if (a == 1) {
                basket.basket.add(0, shelfOfSportGoods.productOnTheShelf.get(0));
                for (Product sum : basket.basket)
                    System.out.println(sum.toString());
                goToMoneyKassa(scanner, basket);
                break;
            } else if (a == 2) {
                System.out.println("Введите нужные артикулы из ассортимента, по окончанию выбора введите 99 : ");
                putOnBasket(scanner, shelfOfSportGoods, basket);
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
        ShelfOfSportGoods shelfOfSportGoods = new ShelfOfSportGoods("Полка 1", 10, 5, 5);
        Basket basket = new Basket("Корзина", 1, 5, 0, 5);
        putOnBasket(scanner, shelfOfSportGoods, basket);
    }

    public void putOnBasket(Scanner scanner, ShelfOfSportGoods shelfOfSportGoods, Basket basket) {
        while (true) {
            int b = scanner.nextInt();
            if (b == 0) {
                basket.basket.add(0, shelfOfSportGoods.productOnTheShelf.get(0));
                System.out.println("Товары в корзине: ");
                for (Product sum : basket.basket)
                    System.out.println(sum.toString());

            } else if (b == 1) {
                basket.basket.add(0, shelfOfSportGoods.productOnTheShelf.get(1));
                System.out.println("Товары в корзине: ");
                for (Product sum : basket.basket)
                    System.out.println(sum.toString());

            } else if (b == 2) {
                basket.basket.add(0, shelfOfSportGoods.productOnTheShelf.get(2));
                System.out.println("Товары в корзине: ");
                for (Product sum : basket.basket)
                    System.out.println(sum.toString());

            } else if (b == 3) {
                basket.basket.add(0, shelfOfSportGoods.productOnTheShelf.get(3));
                System.out.println("Товары в корзине: ");
                for (Product sum : basket.basket)
                    System.out.println(sum.toString());

            } else if (b == 4) {
                basket.basket.add(0, shelfOfSportGoods.productOnTheShelf.get(4));
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
    public void goToMoneyKassa(Scanner scanner, Basket basket1) {
        System.out.println("Товары в корзине" + "\n" + "1 - Пройти на кассу" + "\n" + "2 - Воспользоваться помощью продавца консультанта");
        while (true) {
            int c = scanner.nextInt();
            if (c == 1) {
                Hostess hostess = new Hostess("Марина", "Хостесс", 1);
                System.out.println("Здравствуйте, я " + hostess.getPosition() + " меня зовут " +
                        hostess.getName() + " я провожу Вас на кассу" + "\n" + "---------------------------------");
                hostess.escortsToMoneyKassa(basket1);
                break;
            } else if (c == 2) {
                welcome(scanner);
                break;
            } else {
                System.out.println("Такой команды нет" + "\n" + "1 - Пройти на кассу" + "\n" + "2 - Воспользоваться помощью продавца консультанта");
            }
        }
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

    @Override
    public Basket getBasket() {
        return basket;
    }

    @Override
    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public MoneyKassa getMoneyKassa() {
        return moneyKassa;
    }

    public void setMoneyKassa(MoneyKassa moneyKassa) {
        this.moneyKassa = moneyKassa;
    }

    public Hostess getHostess() {
        return hostess;
    }

    public void setHostess(Hostess hostess) {
        this.hostess = hostess;
    }
}
