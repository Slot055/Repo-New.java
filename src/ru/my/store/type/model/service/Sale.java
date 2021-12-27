package ru.my.store.type.model.service;

public class Sale extends Service {
    private String puymentType;
    private String serviceTime;

    public Sale(String name, double price, String time, int quality, int grade, String puymentType, String serviceTime) {
        super(name, price, time, quality, grade);
        this.puymentType = puymentType;
        this.serviceTime = serviceTime;
    }

    public void consultation() {
        System.out.println("Консультация по товару");
    }

    public void priceCheck() {
        System.out.println("Проверка цены");
    }

    public void scanGood() {
        System.out.println("Сканирование товара на кассе");
    }

    public void getACheck() {
        System.out.println("Получение чека");
    }

    public String getPuymentType() {
        return puymentType;
    }

    public void setPuymentType(String puymentType) {
        this.puymentType = puymentType;
    }

    public String getServiceTime() {
        return serviceTime;
    }

    public void setServiceTime(String serviceTime) {
        this.serviceTime = serviceTime;
    }
}
