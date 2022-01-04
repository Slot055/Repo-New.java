package ru.my.store.type.model.staff;

import ru.my.store.type.OfflineStore;
import ru.my.store.type.model.basket.Basket;
import ru.my.store.type.model.product.alcohol.Alcohol;
import ru.my.store.type.model.product.homeTechnics.HomeTechnics;
import ru.my.store.type.model.product.sportGoods.SportGoods;

import java.util.Scanner;

public class Hostess extends Staff {
    private SportGoods sportGoods;
    private HomeTechnics homeTechnics;
    private Alcohol alcohol;

    public Hostess(String name, String position, double expirience) {
        super(name, position, expirience);
    }

    public Hostess() {
    }

    public void sayHello() {
        System.out.println("Здравствуйте, я Хостесс, меня зовут " + getName());
    }

    public void offerABasket() {
        System.out.println("Возьмите корзину для покупок, по вопросам связанным с товаром можете обратиться к продавцу - консультанту");

    }

    public void escortsToTheDepartment(Scanner scanner) {
        while (true) {
            System.out.println("В нашем магазине есть следующие отделы, выберете нужный, я расскажу как пройти: " + "\n" + "1 - Отдел - Алкоголь" + "\n" +
                    "2 - Отдел - Спортивные товары" + "\n" + "3 - Отдел - Бытовая техника" + "\n" + "4 - Выход из магазина");

            int a = scanner.nextInt();
            if (a == 1) {
                System.out.println("Отдел Алкоголя находится слева от входа, проводить?");
                System.out.println("1 - Да" + "\n" + "2 - Нет");
                int b = scanner.nextInt();
                if (b == 1) {
                    offerABasket();
                    System.out.println("---------------------------------");

                    alcohol = new Alcohol();
                    alcohol.welcome(scanner);

                    break;
                } else if (b == 2) {

                    System.out.println("Давайте вернёмся к выбору отделов");
                } else {
                    System.out.println("Такой команды нет, введите ответ из предложенного ранее варианта");
                }

            } else if (a == 2) {
                System.out.println("Отдел Спортивных товаров находится по центру от входа, проводить?");
                System.out.println("1 - Да" + "\n" + "2 - Нет");
                int b = scanner.nextInt();
                if (b == 1) {
                    offerABasket();
                    System.out.println("---------------------------------");

                    sportGoods = new SportGoods();
                    sportGoods.welcome(scanner);
                    break;
                } else if (b == 2) {

                    System.out.println("Давайте вернёмся к выбору отделов");

                } else {
                    System.out.println("Такой команды нет, введите ответ из предложенного ранее варианта");
                }

            } else if (a == 3) {
                System.out.println("Отдел Бытовой техники находится справа от входа, проводить?");
                System.out.println("1 - Да" + "\n" + "2 - Нет");
                int b = scanner.nextInt();
                if (b == 1) {
                    offerABasket();
                    System.out.println("---------------------------------");

                    homeTechnics = new HomeTechnics();
                    homeTechnics.welcome(scanner);
                    break;
                } else if (b == 2) {

                    System.out.println("Давайте вернёмся к выбору отделов");
                } else {
                    System.out.println("Такой команды нет, введите ответ из предложенного ранее варианта");
                }
            } else if (a == 4) {
                sayGoodbye();
                OfflineStore.exitOfStore();

            } else {
                System.out.println("Такого отдела пока нет, выберете один из предложенных отделов");
            }

        }
    }

    @Override
    public void sayGoodbye() {
        System.out.println("До свидания, ждём Вас снова в нашем магазине");
    }

    public SportGoods getSportGoods() {
        return sportGoods;
    }

    public void setSportGoods(SportGoods sportGoods) {
        this.sportGoods = sportGoods;
    }

    public HomeTechnics getHomeTechnics() {
        return homeTechnics;
    }

    public void setHomeTechnics(HomeTechnics homeTechnics) {
        this.homeTechnics = homeTechnics;
    }

    public Alcohol getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(Alcohol alcohol) {
        this.alcohol = alcohol;
    }
}

