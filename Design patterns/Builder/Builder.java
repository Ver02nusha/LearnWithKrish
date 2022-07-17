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
public class Builder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        phone p=new phone("IOS",2,"Intel",5.5,3100);
//        System.out.println(p);
        phone p= new phone_builder().setOs("IOS").setRam(5).setScreenSize(5.5).getphone();
        System.out.println(p);
    }
    
    
}
