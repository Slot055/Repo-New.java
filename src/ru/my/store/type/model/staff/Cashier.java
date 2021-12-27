package ru.my.store.type.model.staff;

public class Cashier extends Staff {
    public Cashier(String name, String position, double expirience) {
        super(name, position, expirience);
    }

    public Cashier(){}

    public void sayHello(){
        System.out.println("Здравствуйте, я Кассир");
    }

    public void scanGoods() {
        System.out.println("Сканирование товара");
    }

    public void packGood() {
        System.out.println("Товар упакован");
    }

    public void sayTheAmount() {
        System.out.println("Сумма покупки составляет: ");
    }

    public void printCheck() {
        System.out.println("Печать чека");
    }

}

