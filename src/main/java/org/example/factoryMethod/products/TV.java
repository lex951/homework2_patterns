package org.example.factoryMethod.products;

public class TV implements ElectricalDevice {

    @Override
    public void turnOn() {
        System.out.println("TV is on");
    }

    @Override
    public void turnOff() {
        System.out.println("TV is off");
    }
}
