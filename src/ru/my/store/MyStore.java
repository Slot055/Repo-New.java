package ru.my.store;
import org.jetbrains.annotations.NotNull;
import ru.my.store.type.OfflineStore;
import ru.my.store.type.model.CreateToObject;

import java.util.Date;
import java.util.Scanner;

public class MyStore {

    public static void main(String[] args) {
        Date date = CreateToObject.createDate();
        System.out.println(date);

        OfflineStore offlineStore = CreateToObject.createOfflineStore();

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

