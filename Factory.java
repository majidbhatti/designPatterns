/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryPattern;

/**
 *
 * @author majid
 */
public class Factory {
    
    @SuppressWarnings("ConvertToStringSwitch")
    public MicroSoftOffice getInstance(String str){
        MicroSoftOffice instance;
        if(str.equals("slides"))
            instance = new PowerPoint();
        else if(str.equals("word"))
            instance = new Word();
        else if(str.equals(("sheet")))
            instance = new Excel();
        else 
            instance = null;
        return instance;
    }
}
