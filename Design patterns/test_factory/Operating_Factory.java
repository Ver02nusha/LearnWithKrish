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
public class Operating_Factory {

    /**
     *
     * @param str
     * @return
     */
    public OS getInstance (String str){
        if(str.equals("open")){
        return new Android();
        }
        else if(str.equals("close")){
        return new IOS();
        }
        else{
        return new Windows();
        }
        
    }
}
