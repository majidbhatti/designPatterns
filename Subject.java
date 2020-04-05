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
public interface Subject {

    String getTitle();

    void subscribe(Observer sub);

    void unsubscribe(Observer sub);

    void upload(String t);
    
}
