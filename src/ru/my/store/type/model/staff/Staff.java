package ru.my.store.type.model.staff;

import ru.my.store.type.OfflineStore;
import ru.my.store.type.model.product.Product;

import java.util.Scanner;

public class Staff {
    private int quantity;
    private String name;
    private String position;
    private double expirience;
    private OfflineStore offlineStore;
    private Product product;


    public Staff(String name, String position, double expirience) {
        this.name = name;
        this.position = position;
        this.expirience = expirience;
    }

    public Staff() {

    }

    public void sayHello() {
        System.out.println("Здравствуйте, я сотрудник магазина");
    }

    public void advises() {
        System.out.println("Сотрудник посоветовал");
    }

    public void helpsWithTheChoice() {
        System.out.println("Сотрудник помог с выбором");
    }

    public void sayGoodbye() {
        System.out.println("До свидания, ждём Вас снова");
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getExpirience() {
        return expirience;
    }

    public void setExpirience(double expirience) {
        this.expirience = expirience;
    }

    public OfflineStore getOfflineStore() {
        return offlineStore;
    }

    public void setOfflineStore(OfflineStore offlineStore) {
        this.offlineStore = offlineStore;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
