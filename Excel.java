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
public class Excel implements MicroSoftOffice{

    @Override
    public void type() {
        System.err.println("Sheet");
    }
    
}
