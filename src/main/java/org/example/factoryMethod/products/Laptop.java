package org.example.factoryMethod.products;

public class Laptop implements ElectricalDevice {
    @Override
    public void turnOn() {
        System.out.println("Laptop is on");
    }

    @Override
    public void turnOff() {
        System.out.println("Laptop is off");
    }
}
