package ru.my.store.type;

import ru.my.store.type.model.product.Product;
import ru.my.store.type.model.staff.Hostess;
import ru.my.store.type.model.staff.Staff;

import java.util.Scanner;

public class OfflineStore {

    private String name;
    private double square;
    private String workHours;
    private String adress;
    private String phone;
    private Staff staff;
    private Product product;

    public OfflineStore(String name, double square, String workHours, String adress, String phone) {

        this.name = name;
        this.square = square;
        this.workHours = workHours;
        this.adress = adress;
        this.phone = phone;
        staff = new Staff();
        staff.setQuantity(500);

    }

    public OfflineStore() {

    }


    public void infoStore() {
        System.out.println("Магазин: " + name + "\n" + "Площадь: " + square + " м2" + "\n" +
                "Количество сотрудников в магазине: " + staff.getQuantity() + "\n" + "Время работы: " + workHours +
                "\n" + "Адрес: " + adress + "\n" + "Телефон: " + phone);

    }


    public void storeOpen(Scanner scanner) {

        System.out.println("Магазин " + name + " открыт");
        while (true) {
            System.out.println("Вывести информацию о магазине?");
            System.out.println("Да - 1" + "\n" + "Нет - 2");


            int a = scanner.nextInt();
            if (a == 1) {
                infoStore();
                break;

            } else if (a == 2) {
                System.out.println("Вы всегда можете вернуться к нам за данной информацией");
                break;
            } else {
                System.out.println("Такой команды нет, введите ответ из предложенного ранее варианта");
            }
        }
        System.out.println("---------------------------------" + "\n" + "Вход в магазин" + "\n" + "---------------------------------");
    }

    public static void input(Scanner scanner) {
        Hostess hostess = new Hostess("Оксана", "Хостесс", 2);
        hostess.sayHello();
        hostess.escortsToTheDepartment(scanner);
        System.out.println("---------------------------------");

    }


    public void storeClose(Scanner scanner) {

        System.out.println("Магазин " + name + " закрыт");
        while (true) {
            System.out.println("Хотите получить информацию о времени работы магазина?");
            System.out.println("1 - Да" + "\n" + "2 - Нет");
            int b = scanner.nextInt();
            if (b == 1) {
                System.out.println("Время работы: " + workHours);
                System.out.println("Приходите в рабочее время");
                break;
            } else if (b == 2) {
                System.out.println("Приходите в рабочее время");
                break;
            } else {
                System.out.println("Такой команды нет, введите ответ из предложенного варианта");

            }
        }
    }


    public static void exitOfStore() {
        System.out.println("---------------------------------" + "\n" + "Выход из магазина" + "\n" + "---------------------------------");
        System.exit(0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public String getWorkHours() {
        return workHours;
    }

    public void setWorkHours(String workHours) {
        this.workHours = workHours;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}





