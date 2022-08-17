import java.util.Scanner;

public class function {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int num1=s.nextInt();
		int num2=s.nextInt();
		int prod=getMultiples(num1,num2);
		System.out.println("Product = "+prod);
	}
	static int getMultiples(int num1, int num2){
		int prod=num1*num2;
		return prod;
	}
}
