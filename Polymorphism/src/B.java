
public class B extends A{
	int a=10;
	void display()
	{
		System.out.println("Inside child Class");
		
		System.out.println("Calling with super\n-------------------------------------\n"+super.a);
		super.display();
	}
	
	public static void main(String[] args) {
		B b =new B();
		System.out.println("Calling with object\n-------------------------------------\n"+b.a);
		b.display();
		
		
	}
}
