package demo;

import java.util.Scanner;

public class Processor extends Thread{
	private volatile boolean running=true;
	public void run(){
		while(running){
			System.out.println("Hello");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void shutdown(){
		running=false;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Processor proc= new Processor();
		proc.start();
		System.out.println("Press return to  stop");
		Scanner scanner= new Scanner(System.in);
		scanner.nextLine();
		proc.shutdown();
	}

}
