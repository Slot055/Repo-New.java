package ru.my.store.type.model.staff;


import ru.my.store.type.model.basket.Basket;
import ru.my.store.type.model.moneyKassa.MoneyKassa;
import ru.my.store.type.model.product.Product;

import java.util.Arrays;



public class Cashier extends Staff {
    private MoneyKassa moneyKassa;
    private Basket basket;
    private Product product;

    public Cashier(String name, String position, double expirience) {
        super(name, position, expirience);
    }

    public Cashier() {
    }

    public void sayHello() {
        System.out.println("Здравствуйте, я " + getPosition() + ", меня зовут  " + getName());
    }

    public void payment(Product[] basket) {

        System.out.println("Товары в корзине: " + "\n" + "---------------------------------");
        for (Product sum : basket)
            System.out.println(sum.getName() + " - " + sum.getPrice() + " рублей");


        double summ = Arrays.stream(basket)
                .map(Product::getPrice)
                .reduce(Double::sum)
                .orElse(0.00);

        System.out.println("---------------------------------" + "\n" + "Стоимость товаров в корзине равна: " + summ + " рублей");


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

    public MoneyKassa getMoneyKassa() {
        return moneyKassa;
    }

    public void setMoneyKassa(MoneyKassa moneyKassa) {
        this.moneyKassa = moneyKassa;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    @Override
    public Product getProduct() {
        return product;
    }

    @Override
    public void setProduct(Product product) {
        this.product = product;
    }
}

