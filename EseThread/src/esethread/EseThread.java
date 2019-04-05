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
        Variabile GC=new Variabile();
        GC.setVar(0);
        
        /* ProvaThread1 C1=new ProvaThread1(1,GC);
        Thread TC1=new Thread(C1);
        TC1.start();
        
        Thread TC2=new Thread(new ProvaThread1(2,GC)); 
        TC2.start(); */
        
        for (int i=0;i<10; i++){
            new Thread(new ProvaThread1(3,GC)).start();
        }
        
        
        
        
        while (Thread.activeCount()>1){
            System.out.println(Thread.activeCount());
        }
        System.out.println("Ora ho concluso");
        System.out.println(Thread.activeCount());
        System.out.println("Risulato finale: "+GC.getVar());
    
    
    }
    
}
