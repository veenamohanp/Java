
public class Sample {
	int a=100,b=200;
	Sample(int a,int b){
		System.out.println("a:"+a+"\nb:"+b);
		
		System.out.println("\nCalling global variable from constructor"
				+ "\n------------------------------------\n"
				+ "A:"+this.a+"\nB:"+this.b);
		
		this.a=a;
		this.b=b;
		System.out.println("\nCalling global variable from constructor after assigning local values"
				+ "\n------------------------------------\n"
				+ "A:"+this.a+"\nB:"+this.b);
		this.a=100;//after assigning local values to global values both values become same.
		this.b=200;//So  I again re assign a different value t global variables to understand the difference
		
		a=this.a;
		b=this.b;
		System.out.println("\nCalling local variables of constructor after assigning global values"
				+ "\n------------------------------------\n"
				+ "a:"+this.a+"\nb:"+this.b);
	}

}
