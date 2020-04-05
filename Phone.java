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
public class Phone {
    private String os;
    private int battery;
    private float screenSize;
    private float camera;
    private float ram;

    public Phone(String os, int battery, float screenSize, float camera, float ram) {
        this.os = os;
        this.battery = battery;
        this.screenSize = screenSize;
        this.camera = camera;
        this.ram = ram;
    }
       

    @Override
    public String toString() {
        return "phone" + " [os = "+os+", battery = "+battery+", screenSize = "+screenSize+", camera = "+camera+ ", ram = "+ram+" ]";
    }
    
}
