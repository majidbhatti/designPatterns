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
public class maiClass {
    public static void main(String str[]){
        PhoneBuilder b = new PhoneBuilder();
        b.setBattery(3000);
        b.setCamera(12);
        b.setOs("android");
        System.out.println(b.getInstance().toString());
    }
    
}
