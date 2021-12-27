package ru.my.store.type.model.service;

public class Delivery extends Service {
    private String typeDelivery;
    private String timeDelivery;
    private double distance;
    private String adress;
    private int trackingNumber;

    public Delivery(String name, double price, String time, int quality, int grade, String typeDelivery, String timeDelivery, double distance, String adress, int trackingNumber) {
        super(name, price, time, quality, grade);
        this.typeDelivery = typeDelivery;
        this.timeDelivery = timeDelivery;
        this.distance = distance;
        this.adress = adress;
        this.trackingNumber = trackingNumber;
    }

    public void productLoaded() {
        System.out.println("Погрузка товара");
    }

    public void goodsOfTranzit() {
        System.out.println("Товар доставляется");
    }

    public void orderDelivered() {
        System.out.println("Товар доставлен");
    }

    public String getTypeDelivery() {
        return typeDelivery;
    }

    public void setTypeDelivery(String typeDelivery) {
        this.typeDelivery = typeDelivery;
    }

    public String getTimeDelivery() {
        return timeDelivery;
    }

    public void setTimeDelivery(String timeDelivery) {
        this.timeDelivery = timeDelivery;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(int trackingNumber) {
        this.trackingNumber = trackingNumber;
    }
}
