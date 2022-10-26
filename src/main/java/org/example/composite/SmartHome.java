package org.example.composite;

import java.util.ArrayList;
import java.util.List;

public class SmartHome implements ElectricalDevice{

    List<ElectricalDevice> devices=new ArrayList<>();


    @Override
    public void turnOff() {
        devices.forEach(ElectricalDevice::turnOn);
    }

    @Override
    public void turnOn() {
        devices.forEach(ElectricalDevice::turnOff);
    }
}
