import java.util.Scanner;

public class IfElse {
	public static void main(String ar[]) {
		System.out.println("Enter a number");
		Scanner s = new Scanner(System.in);
		int num =s.nextInt();
		if (num>=0) {
			System.out.println("Positive number");
		}
		else {
			System.out.println("Negative Number");
		}
	}

}
