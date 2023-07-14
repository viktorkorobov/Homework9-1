package Main;

import exception.*;

public class CarStr {
    private String model;
    private String engineType;
    private String transmission;
    private int weels;
    private String color;
    private int price;
    private int age;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if(model==null){
            throw new InvalidExceptionCarModel("Incorrect value: model");
        }
        this.model = model;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        if(engineType==null){
            throw new InvalidExceptionCarEngineType("Incorrect value: engineType");
        }
        this.engineType = engineType;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if(transmission==null){
            throw new InvalidExceptionCarTransmission("Incorrect value: transmission");
        }
        this.transmission = transmission;
    }

    public int getWeels() {
        return weels;
    }

    public void setWeels (int weels){
        if (weels <=2){
            throw new InvalidExceptionCarWeels("Weels less than 3");
        }this.weels = weels;
    }

    public String getColor() {

        return color;
    }

    public void setColor(String color) {
        if(color==null){
            throw new InvalidExceptionCarColor("Incorrect value: color");
        }
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price <0){
            throw new InvalidExceptionCarPrice("Price can't less than 0");
        }
        this.price = price;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <0){
            throw new InvalidExceptionCarAge("Age less than 0");
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", engineType='" + engineType + '\'' +
                ", transmission='" + transmission + '\'' +
                ", weels=" + weels +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", age=" + age +
                '}';
    }

}
