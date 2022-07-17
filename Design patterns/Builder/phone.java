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
public class phone {
    private String os;
    private int ram;
    private String processor;
    private double screenSize;
    private int battery;
  
    public phone(String os, int ram, String processor, double screenSize, int battery){
        this.os =os;
        this.ram =ram;
        this.processor =processor;
        this.screenSize =screenSize;
        this.battery =battery;
    }
    public String toString(){
    return "phone("+"os="+os+","+"ram="+ram+","+"processor"+processor+","+"screenSize"+screenSize+","+"battery"+battery+")";
    }
}
