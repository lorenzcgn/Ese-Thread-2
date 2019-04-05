/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esethread;

/**
 *
 * @author 75844087
 */
public class ProvaThread1 implements Runnable{
    
    public ProvaThread1() {
        
    }
    
    // capire thread attivo in un momento
    @Override
    public void run() {
        for (int i=0; i<5; i++){
            try {
            Thread.sleep(100);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
            System.out.println(Thread.currentThread().getName()+" conto "+i);
        }
    }
    
}
