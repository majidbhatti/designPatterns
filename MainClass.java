package FactoryPattern;

/**
 *
 * @author majid
 */
public class MainClass {
    public static void main(String str[]){
        Factory obj = new Factory();
        MicroSoftOffice word = obj.getInstance("word");
        word.type();
        
        MicroSoftOffice powerPoint;
        powerPoint = obj.getInstance("slides");
        powerPoint.type();
        
    }
}
