package ru.my.store.type.model.staff;

import ru.my.store.type.OfflineStore;
import ru.my.store.type.model.priceList.PriceList;
import ru.my.store.type.model.product.Product;

import java.util.Scanner;

public class ShopAssistant extends Staff {
    private PriceList priceList;
    private Product product;


    public ShopAssistant(String name, String position, double expirience) {
        super(name, position, expirience);
    }

    public ShopAssistant() {
    }


    public void sayHello() {
        System.out.println("Здравствуйте, я " + getPosition() + ", меня зовут  " + getName());

    }

    public void advises(Scanner scanner, PriceList priceList) {
        System.out.println("1 - Хотите получить информацию об активном ассортименте?" + "\n" +
                "2 - Хотите вернуться к выбору отделов?" + "\n" + "3 - Хотите уйти из магазина?");
        while (true) {
            int a = scanner.nextInt();
            if (a == 1) {
                priceList.print();
                break;
            } else if (a == 2) {

                OfflineStore.input(scanner);
                break;
            } else if (a == 3) {
                sayGoodbye();
                OfflineStore.exitOfStore();
            } else {
                System.out.println("Извините, не понял" + "\n" + "1 - Хотите получить информацию об активном ассортименте?"
                        + "\n" + "2 - Хотите вернуться к выбору отделов?" + "\n" + "3 - Хотите уйти из магазина?");
            }

        }
    }


    public void helpsWithTheChoice(Scanner scanner, Product product,PriceList priceList) {
        System.out.println("Могу Вам посоветовать товар или нужно что то конкретное?:" + "\n" + "1 - Посоветовать "
                + "\n" + "2 - Выбрать самостоятельно из текущего ассортимента" + "\n" + "3 - начать сначала");
        while (true) {
            int a = scanner.nextInt();
            if (a == 1) {
                System.out.println("Хочу обратить Ваше внимание на данный экземпляр: ");
                product.infoTopProduct();
                System.out.println("---------------------------------");
                product.choiceProduct();
                break;
            } else if (a == 2) {


                break;
            } else if (a == 3) {

                product.welcome(scanner);

                break;
            } else {
                System.out.println("Извините, не понял" + "\n" + "1 - Хотите получить информацию об активном ассортименте?"
                        + "\n" + "2 - Хотите вернуться к выбору отделов?" + "\n" + "3 - Хотите уйти из магазина?");
            }
        }
    }

    public PriceList getPriceList() {
        return priceList;
    }

    public void setPriceList(PriceList priceList) {
        this.priceList = priceList;
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



