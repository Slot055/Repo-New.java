package ru.my.store.type.model.moneyKassa;

import ru.my.store.type.model.basket.Basket;
import ru.my.store.type.model.product.Product;
import ru.my.store.type.model.product.sportGoods.Ball;
import ru.my.store.type.model.staff.Cashier;
import ru.my.store.type.model.staff.Staff;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class MoneyKassa {
    private int number;
    private Product product;
    private Basket basket;
    private Staff staff;
    private Check check;

    public MoneyKassa(int number) {
        this.number = number;
    }

    public MoneyKassa() {

    }

    Cashier cashier = new Cashier("Татьяна", "кассир", 7.0);

    public void welcomeToKassa(Scanner scanner,Basket basket) {

        System.out.println("Добро пожаловать на кассу" + "\n" + "---------------------------------");
        cashier.sayHello();
        cashier.payment(scanner,basket.basket);


    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public Check getCheck() {
        return check;
    }

    public void setCheck(Check check) {
        this.check = check;
    }
}
