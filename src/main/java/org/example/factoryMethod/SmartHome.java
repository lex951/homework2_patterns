package org.example.factoryMethod;

import org.example.factoryMethod.factories.ElectricalDeviceFactory;
import org.example.factoryMethod.factories.LaptopFactory;
import org.example.factoryMethod.factories.RefrigeratorFactory;
import org.example.factoryMethod.factories.TVFactory;
import org.example.factoryMethod.products.ElectricalDevice;

public class SmartHome {
    public static void main(String[] args) {
        ElectricalDeviceFactory factory=createSpecialFactory("Laptop");
        ElectricalDevice device=factory.createDevice();
        device.turnOn();

    }

    static ElectricalDeviceFactory createSpecialFactory(String special){
        if(special.equalsIgnoreCase("TV"))
            return new TVFactory();
        if(special.equalsIgnoreCase("Laptop"))
            return new LaptopFactory();
        if (special.equalsIgnoreCase("Refrigerator"))
            return new RefrigeratorFactory();
        throw new RuntimeException(special + " doesn't exist");
    }
}
