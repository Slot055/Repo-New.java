package ru.my.store.type.model.service;

public class Service {
    private String name;
    private double price;
    private String time;
    private int quality;
    private int grade;

    public Service(String name, double price, String time, int quality, int grade) {
        this.name = name;
        this.price = price;
        this.time = time;
        this.quality = quality;
        this.grade = grade;
    }

    void servicePerformed() {
        System.out.println("Услуга оказана");
    }

    void feedbackService() {
        System.out.println("Получена обратная связь по услуге");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
