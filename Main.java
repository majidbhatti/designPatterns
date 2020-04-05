/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

/**
 *
 * @author majid
 */
public class Main {
    public static void main(String args[]){
        Channel mych = new Channel();
        
        Observer o1 = new Observer("bakir");
        Observer o2 = new Observer("munawar");
        Observer o3= new Observer("sultan");
        Observer o4 = new Observer("akram");
        Observer o5 = new Observer("tanvir");
        
        mych.subscribe(o5);
        mych.subscribe(o4);
        mych.subscribe(o3);
        mych.subscribe(o2);
        mych.subscribe(o1);
        
        o1.subscireChannel(mych);
        o2.subscireChannel(mych);
        o3.subscireChannel(mych);
        o4.subscireChannel(mych);
        o5.subscireChannel(mych);
        
        mych.upload("first video");
        
        mych.unsubscribe(o4);
        
        mych.upload(" video");
    }
    
}
