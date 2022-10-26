package org.example.composite;

import org.example.factoryMethod.products.ElectricalDevice;

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
