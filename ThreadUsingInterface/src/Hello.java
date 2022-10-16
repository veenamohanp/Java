
public class Hello {
	public static void main(String[] args) {
		Sample s= new Sample();
		Thread th =  new Thread(s);
		th.start();
		Sample s1= new Sample();
		Thread th1 =  new Thread(s1);
		th1.start();
		Sample s2= new Sample();
		Thread th2 =  new Thread(s2);
		th2.start();
				
	}
	
}

