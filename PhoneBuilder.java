/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuilderPattern;

/**
 *
 * @author majid
 */
public class PhoneBuilder {
    private String os;
    private int battery;
    private float screenSize;
    private float camera;
    private float ram;

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public PhoneBuilder setBattery(int battery) {
        this.battery = battery;
        return this;
    }

    public PhoneBuilder setScreenSize(float screenSize) {
        this.screenSize = screenSize;
        return this;
    }

    public PhoneBuilder setCamera(float camera) {
        this.camera = camera;
        return this;
    }

    public PhoneBuilder setRam(float ram) {
        this.ram = ram;
        return this;
    }
    
    public Phone getInstance(){
        return new Phone(os, battery, screenSize, camera,ram);
    }
    
}
