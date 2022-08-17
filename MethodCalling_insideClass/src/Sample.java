import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		int num1,num2;
		System.out.println("Enter 2  numbers");
		Scanner s = new Scanner(System.in);
		num1=s.nextInt();
		num2=s.nextInt();
		Sum a= new Sum();
		a.Sum(num1, num2);
		a.display();
	}

}
