package Main;

import exception.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*1-2*/
    CarStr carStr1 = new CarStr();

        try {
            carStr1.setModel(null);
        }catch (InvalidExceptionCarModel ignore){
            System.out.println("Incorrect value: model");
        }
        try {
            carStr1.setEngineType(null);
        }catch (InvalidExceptionCarEngineType ignore){
            System.out.println("Incorrect value: EngineType");
        }
        try {
            carStr1.setTransmission(null);
        }catch (InvalidExceptionCarTransmission ignore){
            System.out.println("Incorrect value: Transmission");
        }
        try {
            carStr1.setWeels(0);
        }catch (InvalidExceptionCarWeels ignore){
            System.out.println("Incorrect value: Weels");
        }
        try {
            carStr1.setColor(null);
        }catch (InvalidExceptionCarColor ignore){
            System.out.println("Incorrect value: Color");
        }
        try {
            carStr1.setPrice(-3);
        }catch (InvalidExceptionCarPrice ignore){
            System.out.println("Incorrect value: Price");
        }
        try {
            carStr1.setAge(-2);
        }catch (InvalidExceptionCarAge ignore){
            System.out.println("Incorrect value: Age");
        }

        System.out.println(carStr1.getModel());
        System.out.println(carStr1.getEngineType());
        System.out.println(carStr1.getTransmission());
        System.out.println(carStr1.getWeels());
        System.out.println(carStr1.getColor());
        System.out.println(carStr1.getPrice());
        System.out.println(carStr1.getAge());

        System.out.println("------------------------");

        CarStr carStr2 = new CarStr();
        carStr2.setModel("Tesla");
        carStr2.setEngineType("Electro");
        carStr2.setTransmission("auto");
        try {
            carStr2.setWeels(2);
        }catch (InvalidExceptionCarWeels ignore){
        }
        carStr2.setColor("Red");
        carStr2.setPrice(40000);
        carStr2.setAge(2);
        System.out.println();
        System.out.println(carStr2.getModel());
        System.out.println(carStr2.getEngineType());
        System.out.println(carStr2.getTransmission());
        System.out.println(carStr2.getWeels());
        System.out.println(carStr2.getColor());
        System.out.println(carStr2.getPrice());
        System.out.println(carStr2.getAge());

        /*3*/
        System.out.println("------------------------");
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int value=0;
        for (int i = 0; i<10; i++){
          arrayList.add(value);
            value++;
        }

        arrayList.subList(0, 2).clear();
        arrayList.set(5, Integer.valueOf(25));
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

    }
}
