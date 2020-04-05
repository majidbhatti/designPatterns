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
public class Observer implements Subscriber {
    private String name;
    private  Channel subscribedChannel = new Channel();

    public Observer(String name) {
        this.name=name;
    }

    @Override
    public void update(){
        System.out.println(name+ ", video uploaded ="+this.subscribedChannel.getTitle());
    }
    
    @Override
    public void subscireChannel(Channel ch){
        this.subscribedChannel=ch;
    }
}
