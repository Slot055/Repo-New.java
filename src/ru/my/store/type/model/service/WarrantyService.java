package ru.my.store.type.model.service;

public class WarrantyService extends Service {
    private String type;
    private double guaranteePeriod;

    public WarrantyService(String name, double price, String time, int quality, int grade,String type,double guaranteePeriod){
        super(name, price, time, quality, grade);
        this.type = type;
        this.guaranteePeriod = guaranteePeriod;
    }

    public void expertise(){
        System.out.println("Назначена эеспертиза");
    }
    public void conclusion(){
        System.out.println("Экспертное заключение");
    }
    public void repair(){
        System.out.println("Гарантийный ремонт");
    }
    public void replacementOfGood(){
        System.out.println("Замена товара на новый по гарантии");
    }
    public void returnOfGood (){
        System.out.println("Возврат товара, отказ в гарантии");
    }
    public void refund(){
        System.out.println("Возврат денежных средств по гарантии");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getGuaranteePeriod() {
        return guaranteePeriod;
    }

    public void setGuaranteePeriod(double guaranteePeriod) {
        this.guaranteePeriod = guaranteePeriod;
    }
}
