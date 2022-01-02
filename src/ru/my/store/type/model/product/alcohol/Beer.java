package ru.my.store.type.model.product.alcohol;

public class Beer extends Alcohol{
    public Beer(String name, double price, int item, double expirationDate, double size, double volume, String manufacturer, String pack) {
        super(name, price, item, expirationDate, size, volume, manufacturer, pack);
    }

    public Beer(){

    }

    @Override
    public void infoTopProduct() {
        System.out.println("Наименование товара: " + getName() + "\n" + "Цена: " + getPrice() + "\n" + "Артикул: " + getItem() + "\n" +
                "Срок годности: " + getExpirationDate() + "\n" + "Крепость: " + getSize() + "%" + "\n" + "Объём: " + getVolume() + " литров" + "\n" +
                "Производитель: " + getManufacturer() + " лет" + "\n" + "Тара: " + getPack());
    }
}
