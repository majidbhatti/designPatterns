/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package protoType;

/**
 *
 * @author majid
 */
public class mainClass {
    public static void main(String argv[]) throws CloneNotSupportedException{
        BookShop b1 = new BookShop();
        b1.setShop_name("\'first shop\'");
        b1.loadData();
        
        BookShop b2 = b1.clone();
        b2.setShop_name("\'first shop\'");
        b1.getBooks().remove(0); 
        System.out.println(b1);
        System.out.println(b2);
    }
}
