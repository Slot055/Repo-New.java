package ru.my.store.type.model.product.sportGoods;

public class Ball extends SportGoods {
    private String type;
    private String size;
    private double weight;
    private String brand;
    private String shape;

    public Ball(String name, double price, int item, String matter, String purposeOfGood, String color, double guaranteePeriod, String manufacturer, String type, String size, double weight, String brand, String shape) {
        super(name, price, item, matter, purposeOfGood, color, guaranteePeriod, manufacturer);
        this.type = type;
        this.size = size;
        this.weight = weight;
        this.brand = brand;
        this.shape = shape;
    }

    public Ball() {

    }

    public void infoTopProduct() {
        System.out.println("Наименование товара: " + getName() + "\n" + "Цена: " + getPrice() + "\n" + "Артикул: " + getItem() + "\n" +
                "Материал: " + getMatter() + "\n" + "Назначение: " + getPurposeOfGood() + "\n" + "Цвет: " + getColor() + "\n" +
                "Гарантийный срок: " + getGuaranteePeriod() + " лет" + "\n" + "Страна производитель: " + getManufacturer() + "\n" +
                "Размер: " + size + "\n" + "Вес: " + weight + " кг" + "\n" + "Бренд: " + brand + "\n" + "Форма: " + shape);


    }

    void visualInspectoin() {
        System.out.println("Продукт осмотрен");
    }

    public void testGood() {
        System.out.println("Мяч протестирован");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }


}
