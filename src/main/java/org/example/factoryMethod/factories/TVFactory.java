package org.example.factoryMethod.factories;

import org.example.factoryMethod.products.ElectricalDevice;
import org.example.factoryMethod.products.TV;

public class TVFactory implements ElectricalDeviceFactory{
    @Override
    public ElectricalDevice createDevice() {
        return new TV();
    }
}
