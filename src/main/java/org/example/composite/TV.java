package org.example.composite;

import org.example.factoryMethod.products.ElectricalDevice;

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
