package ru.my.store.type.model.product;

import ru.my.store.type.model.basket.Basket;
import ru.my.store.type.model.priceList.PriceList;
import ru.my.store.type.model.product.sportGoods.Ball;
import ru.my.store.type.model.shelf.Shelf;
import ru.my.store.type.model.shelf.ShelfOfSportGoods;

import java.util.Arrays;
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

    public void infoTopProduct() {
        System.out.println("Наименование товара: " + name + "\n" + "Цена: " + price + "\n" + "Артикул: " + item);
    }

    public void choiceProduct() {

        System.out.println("Выбрали товар");
    }

    @Override
    public String toString() {
        return "Артикул: " + item + " / " + "Наименование: " + name + " / " + "Цена: " + price;
    }

    public void takeFromTheShelf(Product product,Shelf shelf,PriceList priceList) {

        System.out.println("Взяли " + getName() + " с полки");

        Basket basket = new Basket("Корзина", 1, 5,0,5);
        basket.basket = Arrays.copyOfRange(shelf.productOnTheShelf, 1, 3);

        System.out.println(product.toString());

        putOnBasket(product);
    }


    public void putOnTheShelf() {

        System.out.println("Положили товар на полку");
    }

    public void putOnBasket(Product product) {

        System.out.println(getName() + " в корзине");
    }

    public void removeFromBasket() {

        System.out.println("Товар удалён из корзины");
    }

    public void buy() {

        System.out.println("Товар куплен");
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