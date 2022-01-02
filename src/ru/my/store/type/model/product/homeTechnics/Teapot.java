package ru.my.store.type.model.product.homeTechnics;

public class Teapot extends HomeTechnics {
    private String type;

    public Teapot(String name, double price, int item, String type, String color, double guaranteePeriod, String manufacturer, String technicalSpecifications, int rating) {
        super(name, price, item, color, guaranteePeriod, manufacturer, technicalSpecifications, rating);
        this.type = type;
    }

    public Teapot() {

    }

    @Override
    public void infoTopProduct() {
        System.out.println("Наименование товара: " + getName() + "\n" + "Цена: " + getPrice() + "\n" + "Артикул: " + getItem() + "\n" +
                "Тип: " + getType() + "\n" + "Гарантийный срок: " + getGuaranteePeriod() + " лет" + "\n" + "Производитель: " + getManufacturer() + "\n"
                + "Технические характеристики: " + getTechnicalSpecifications() + "\n" +
                "Рейтинг: " + getRating() + " баллов");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
