/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author Vernu Ravi
 */
public class phone_builder {
    private String os;
    private int ram;
    private String processor;
    private double screenSize;
    private int battery;

    public phone_builder setOs(String os) {
        this.os = os;
        return this;
    }

    public phone_builder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public phone_builder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public phone_builder setScreenSize(double screenSize) {
        this.screenSize = screenSize;
        return this;
    }

    public phone_builder setBattery(int battery) {
        this.battery = battery;
        return this;
    }
    public phone getphone(){
        return new phone (os,ram,processor,screenSize, battery);
    }
}