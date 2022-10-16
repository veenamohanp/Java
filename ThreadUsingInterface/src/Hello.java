
public class Hello {
	public static void main(String[] args) {
		Sample s= new Sample();
		Thread th =  new Thread(s);
		th.start();
		Thread th1 =  new Thread(s);
		th1.start();
		Thread th2 =  new Thread(s);
		th2.start();
				
	}
	
}

