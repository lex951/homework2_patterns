package org.example.factoryMethod.factories;

import org.example.factoryMethod.products.ElectricalDevice;
import org.example.factoryMethod.products.Laptop;

public class LaptopFactory implements ElectricalDeviceFactory{
    @Override
    public ElectricalDevice createDevice() {
        return new Laptop();
    }
}
