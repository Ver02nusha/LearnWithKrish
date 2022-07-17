/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_factory;

/**
 *
 * @author Vernu Ravi
 */
public class Test_factory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operating_Factory ofs=new Operating_Factory();
        OS obj= ofs.getInstance("close");
        obj.specfic();
        
    }
    
}
