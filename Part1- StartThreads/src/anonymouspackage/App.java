package anonymouspackage;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1= new Thread(new Runnable(){
			public void run(){
				for(int i=0;i<10;i++){
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("HI"+i);
				}
			}
		});
		t1.start();
	}

}
