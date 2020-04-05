/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author majid
 */
class Channel implements Subject  {
   private List<Observer> subsricbers = new ArrayList();      
   private String title;
   

    @Override
   public void subscribe(Observer sub){
       this.subsricbers.add(sub);
   }
   

    @Override
   public void unsubscribe(Observer sub){
       this.subsricbers.remove(sub);
   }
   
   private void notifySubscribers(){
       for(Observer o: this.subsricbers){
           o.update();
       }
   }

    @Override
   public void upload(String t){
       this.title= t;
       notifySubscribers();
   }

    @Override
    public String getTitle() {
        return title;
    }
}
