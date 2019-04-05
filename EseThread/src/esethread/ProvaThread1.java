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
    private double B;
    private Variabile gc;
    
    public ProvaThread1(double b, Variabile gc) {
        B=b;
        this.gc=gc;
    }
    
    @Override
    public void run() {
        gc.setVar(gc.getVar()+B);
        System.out.println(Thread.currentThread().getName()+" "+gc.getVar());
    }
    
}
