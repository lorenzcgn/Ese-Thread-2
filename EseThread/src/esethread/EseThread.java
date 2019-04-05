/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esethread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 75844087
 */
public class EseThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    /*  ProvaThread1 PT0=new ProvaThread1();
        ProvaThread1 PT1=new ProvaThread1();
        
        Thread PTT0=new Thread(PT0);
        PTT0.start();
        PT1.start();
        
        for (int i=0;i<5;i++)
        new ProvaThread1().start();  */
    
        Variabile y=new Variabile();
        y.setVar(10);
        
        for (int i=0; i<5; i++)
        new Thread(new ProvaThread1()).start();
       
        System.out.println(Thread.currentThread().getName());
    
    
    }
    
}
