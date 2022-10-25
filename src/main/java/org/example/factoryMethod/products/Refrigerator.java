package org.example.factoryMethod.products;

public class Refrigerator implements ElectricalDevice {
    @Override
    public void turnOn() {
        System.out.println("Refrigerator is on");
    }

    @Override
    public void turnOff() {
        System.out.println("Refrigerator is off");
    }
}
