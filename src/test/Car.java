package test;

import java.time.Year;

public class Car {
    private String model;
    private String year;
    private double price;

    public Car(String model, String year, double price) {
        this.model = model;
        this.price = price;
        this.year= year;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(String year) {
            this.year = year;
    }

    public void setPrice(double price) {
            this.price = price;
    }

    public String getCarModel() {
        return model;
    }

    public String getCarYear() {
        return year;
    }
    public double getPrice(){
        return price;
    }

    public double getDiscountPriceForFirst() {
        double discount = price * 0.05;
        return price - discount;
    }

    public double getDiscountPriceForSecond() {
        double discount = price * 0.05;
        return price - discount;
    }
}
