package ru.my.store;

import ru.my.store.type.OfflineStore;

import java.util.Date;
import java.util.Scanner;

public class MyStore {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        OfflineStore offlineStore = new OfflineStore("Ашан", 1000.0, "08:00-23:00",
                "г. Москва", "8(800)123-45-67");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текущее время в формате: (Часы)");
        int a = scanner.nextInt();
        if (a < 8) {
            offlineStore.storeClose(scanner);
        } else if (a < 23) {
            offlineStore.storeOpen(scanner);
            OfflineStore.input(scanner);
        } else {
            offlineStore.storeClose(scanner);
        }

    }


}

