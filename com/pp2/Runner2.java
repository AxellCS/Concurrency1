package com.pp2;

//Concurrencia en hilos
//La clase Runner1 hereda de la clase Thread
public class Runner2 extends Thread{
	
	public void run() {
		for(int i=0;i<100;++i) {
			System.out.println("Runner2: "+i);
			try {
				/*sleep() manda al hilo a
				 * esperar(dormir) un tiempo
				 * determinado
				 */
				Thread.sleep(100);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
