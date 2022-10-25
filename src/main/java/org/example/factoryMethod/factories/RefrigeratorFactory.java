package org.example.factoryMethod.factories;

import org.example.factoryMethod.products.ElectricalDevice;
import org.example.factoryMethod.products.Refrigerator;

public class RefrigeratorFactory implements ElectricalDeviceFactory{
    @Override
    public ElectricalDevice createDevice() {
        return new Refrigerator();
    }
}
