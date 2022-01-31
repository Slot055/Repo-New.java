package ru.my.store.type.model.product;

import ru.my.store.type.model.basket.Basket;
import ru.my.store.type.model.priceList.PriceList;
import ru.my.store.type.model.shelf.Shelf;
import java.util.Scanner;


public class Product {
    private String name;
    private double price;
    private int item;
    private Shelf shelf;
    private PriceList priceList;
    private Basket basket;


    public Product(String name, double price, int item) {
        this.name = name;
        this.price = price;
        this.item = item;
    }


    public Product() {
    }

    public void welcome(Scanner scanner) {

        System.out.println("Встречает продавец консультант");
    }

    public void helpShopAssistant(Scanner scanner, Shelf shelf, PriceList priceList, Product topProduct) {

        System.out.println("Помощь Консультанта");

    }

    public void infoTopProduct() {
        System.out.println("Наименование товара: " + name + "\n" + "Цена: " + price + "\n" + "Артикул: " + item);
    }

    public void choiceProduct(Scanner scanner, Shelf shelf, PriceList priceList) {

        System.out.println("Выбрали товар");
    }

    @Override
    public String toString() {
        return "Артикул: " + item + " / " + "Наименование: " + name + " / " + "Цена: " + price;
    }

    public void takeFromTheShelf(Scanner scanner, Shelf shelf, PriceList priceList) {

        System.out.println("Взяли " + getName() + " с полки");

        putOnBasket(scanner, shelf, basket);
    }


    public void putOnTheShelf() {

        System.out.println("Положили товар на полку");
    }

    public void putOnBasket(Scanner scanner, Shelf shelf, Basket basket) {

        System.out.println(getName() + " в корзине");
    }

    public void removeFromBasket() {

        System.out.println("Товар удалён из корзины");
    }

    public void buy() {

        System.out.println("Товар куплен");
    }

    public void goToMoneyKassa(Scanner scanner, Basket basket) {

        System.out.println("Пройти на кассу");
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;

    }

    public double getPrice() {

        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public Shelf getShelf() {
        return shelf;
    }

    public void setShelf(Shelf shelf) {
        this.shelf = shelf;
    }

    public PriceList getPriceList() {
        return priceList;
    }

    public void setPriceList(PriceList priceList) {
        this.priceList = priceList;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }
}