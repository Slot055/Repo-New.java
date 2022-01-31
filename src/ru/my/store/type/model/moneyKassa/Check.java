package ru.my.store.type.model.moneyKassa;

import ru.my.store.MyStore;
import ru.my.store.type.OfflineStore;

import java.util.Date;
import java.util.Random;

public class Check {
    private int idNumber;
    private Date date;
    private MoneyKassa moneyKassa;

    public Check(int idNumber, Date date, MoneyKassa moneyKassa) {
        this.idNumber = idNumber;
        this.date = date;
        this.moneyKassa = moneyKassa;

    }

    public Check() {

    }

    public void checkInfo() {
        Random x = new Random();
        setIdNumber(x.nextInt(1000) + 1);
        MoneyKassa moneyKassa = new MoneyKassa();
        moneyKassa.setNumber(x.nextInt(7) + 1);
        setDate(new Date());
        System.out.println("***********************************************************" + "\n" + "Чек №: " + getIdNumber() + "\n" +
                "Дата и время покупки: " + getDate() + "\n" + "Касса №: " + moneyKassa.getNumber() + "\n" + "----------------------------------------------------------");
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public MoneyKassa getMoneyKassa() {
        return moneyKassa;
    }

    public void setMoneyKassa(MoneyKassa moneyKassa) {
        this.moneyKassa = moneyKassa;
    }
}
