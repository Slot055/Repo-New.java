package ru.my.store.type.model.staff;


import ru.my.store.type.model.basket.Basket;
import ru.my.store.type.model.moneyKassa.Check;
import ru.my.store.type.model.moneyKassa.MoneyKassa;
import ru.my.store.type.model.product.Product;

import java.util.*;


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

    public void payment(Scanner scanner, List<Product> basket) {

        System.out.println("Товары в корзине: " + "\n" + "---------------------------------");

        for (Product sum : basket)
            System.out.println(sum.getName() + " - " + sum.getPrice() + " рублей");


        double summ = basket.stream()
                .map(Product::getPrice)
                .reduce(Double::sum)
                .orElse(0.00);

        System.out.println("---------------------------------" + "\n" + "Стоимость товаров в корзине равна: " + summ + " рублей");
        System.out.println("---------------------------------" + "\n" + "Печатать чек?" + "\n" + "1 - Да" + "\n" + "2 - Нет");
        while (true) {
            int i = scanner.nextInt();
            if (i == 1) {
                printCheck(basket, summ);

                sayGoodbye();
                System.exit(0);
            } else if (i == 2) {
                sayGoodbye();
                System.exit(0);
            } else {
                System.out.println("Только 1 или 2" + "\n" + "Печатать чек?" + "\n" + "1 - Да" + "\n" + "2 - Нет");
            }

        }


    }

    public void printCheck(List<Product> basket, double summ) {
        Check check = new Check();
        check.checkInfo();
        for (Product s : basket)
            System.out.println(s);
        System.out.println("----------------------------------------------------------" + "\n" + "Сумма покупки: " + summ + "рублей" + "\n" +
                "***********************************************************");


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

