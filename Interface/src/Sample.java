public class Sample implements Hello{

	
	public void onScan(String text) {
		System.out.println(text);
	}
	Sample(){
		Display ds=new Display(this);
		
		ds.scan();
	}
	public static void main(String[] args) {
		Sample s = new Sample();
		
	}
}
