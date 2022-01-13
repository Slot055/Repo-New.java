package ru.my.store.type.model.product.alcohol;

import ru.my.store.type.model.basket.Basket;
import ru.my.store.type.model.priceList.PriceList;
import ru.my.store.type.model.product.Product;
import ru.my.store.type.model.priceList.PriceListOfAlcohol;
import ru.my.store.type.model.shelf.Shelf;
import ru.my.store.type.model.shelf.ShelfOfAlcohol;
import ru.my.store.type.model.staff.Hostess;
import ru.my.store.type.model.staff.Staff;
import ru.my.store.type.model.staff.ShopAssistant;

import java.util.Arrays;
import java.util.Scanner;

public class Alcohol extends Product {
    private double expirationDate;
    private double size;
    private double volume;
    private String manufacturer;
    private String pack;
    private Staff staff;
    private ShelfOfAlcohol shelfOfAlcohol;
    private Basket basket;

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

    @Override
    public void welcome(Scanner scanner) {
        System.out.println("Добро пожаловать в отдел Алкоголь" + "\n" + "---------------------------------");
        shopAssistant.sayHello();
        Product topBeer = new Beer("Пиво Жигулёвское", 75.00, 123321, 10, 5.8, 0.5, "Россия", "Стекло");
        shopAssistant.advises(scanner, priceListOfAlcohol, topBeer);

    }

    @Override
    public void helpShopAssistant(Scanner scanner, Shelf shelf, PriceList priceList, Product topBeer) {
        shopAssistant.helpsWithTheChoice(scanner, topBeer, priceListOfAlcohol, shelfOfAlcohol);
    }

    @Override
    public void choiceProduct(Scanner scanner, Shelf shelf, PriceList priceList) {
        System.out.println("Можем перейти к выбору продукта: " + "\n" + "---------------------------------");
        System.out.println("1 - Выбрать " + getName() + " по совету " + "продавца консультанта " + shopAssistant.getName()
                + "а" + "\n" + "2 - Выбрать товар из ассортимента в наличии");
        while (true) {
            ShelfOfAlcohol shelfOfAlcohol1 = new ShelfOfAlcohol("Полка 3", 10, 5, 5);
            for (Product alcohol : shelfOfAlcohol1.productOnTheShelf) ;
            Basket basket3 = new Basket("Корзина", 1, 5, 0, 5);

            int a = scanner.nextInt();
            if (a == 1) {
                basket3.basket = Arrays.copyOfRange(shelfOfAlcohol1.productOnTheShelf, 0, 1);
                for (Product sum : basket3.basket)
                    System.out.println(sum.toString());
                goToMoneyKassa(scanner, basket3);
                break;
            } else if (a == 2) {
                System.out.println("Введите нужные артикулы из ассортимента, по окончанию выбора введите 99 : ");
                putOnBasket(scanner, shelfOfAlcohol1, basket3);
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
        ShelfOfAlcohol shelfOfAlcohol1 = new ShelfOfAlcohol("Полка 3", 10, 4, 6);
        Basket basket3 = new Basket("Корзина", 1, 5, 0, 5);
        putOnBasket(scanner, shelfOfAlcohol1, basket3);


    }

    public void putOnBasket(Scanner scanner, ShelfOfAlcohol shelfOfAlcohol1, Basket basket3) {
        while (true) {
            int b = scanner.nextInt();
            if (b == 0) {
                basket3.basket[0] = shelfOfAlcohol1.productOnTheShelf[0];
                System.out.println("Товары в корзине: ");
                for (Product sum : basket3.basket)
                    System.out.println(sum.toString());

            } else if (b == 1) {
                basket3.basket[1] = shelfOfAlcohol1.productOnTheShelf[1];
                System.out.println("Товары в корзине: ");
                for (Product sum : basket3.basket)
                    System.out.println(sum.toString());

            } else if (b == 2) {
                basket3.basket[2] = shelfOfAlcohol1.productOnTheShelf[2];
                System.out.println("Товары в корзине: ");
                for (Product sum : basket3.basket)
                    System.out.println(sum.toString());

            } else if (b == 3) {
                basket3.basket[3] = shelfOfAlcohol1.productOnTheShelf[3];
                System.out.println("Товары в корзине: ");
                for (Product sum : basket3.basket)
                    System.out.println(sum.toString());

            } else if (b == 4) {
                basket3.basket[4] = shelfOfAlcohol1.productOnTheShelf[4];
                System.out.println("Товары в корзине: ");
                for (Product sum : basket3.basket)
                    System.out.println(sum.toString());

            } else if (b == 99) {
                goToMoneyKassa(scanner, basket3);
                break;

            } else {
                System.out.println("Такого артикула пока нет, выберете артикул из ассортимента");
            }
        }
    }

    @Override
    public void goToMoneyKassa(Scanner scanner, Basket basket3) {
        System.out.println("Товары в корзине" + "\n" + "1 - Пройти на кассу" + "\n" + "2 - Воспользоваться помощью продавца консультанта");
        while (true) {
            int c = scanner.nextInt();
            if (c == 1) {
                Hostess hostess = new Hostess("Марина", "Хостесс", 1);
                System.out.println("Здравствуйте, я " + hostess.getPosition() + " меня зовут " +
                        hostess.getName() + " я провожу Вас на кассу" + "\n" + "---------------------------------");
                hostess.escortsToMoneyKassa(basket3);
                break;
            } else if (c == 2) {
                welcome(scanner);
                break;
            } else {
                System.out.println("Такой команды нет" + "\n" + "1 - Пройти на кассу" + "\n" + "2 - Воспользоваться помощью продавца консультанта");
            }
        }
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

    @Override
    public Basket getBasket() {
        return basket;
    }

    @Override
    public void setBasket(Basket basket) {
        this.basket = basket;
    }
}
