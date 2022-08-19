
public class Sample {
	int a=10;
	public static void main(String[] args) {
		
		//System.out.println(a);-->error
		
		hello(); // static class only call static variables and methods directly. Else its
				//shows error. Static method ca be called by creating an object of the same class.
		
		Sample s= new Sample();
		System.out.print(s.a);
		s.hai();	//not a static method so use object to call method
	}
	static void hello() {
		System.out.print("HAi.....!\n");
	}
	
	void hai() {
		System.out.print("\nHello.....");
	}
}
