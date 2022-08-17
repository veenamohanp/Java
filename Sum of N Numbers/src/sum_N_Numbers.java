import java.util.Scanner;

public class sum_N_Numbers {

	public static void main(String[] args) {
		int n, sum=0;
		System.out.println("Enter a number range");
		Scanner s = new Scanner(System.in);
		n=s.nextInt();
		for(int i=0;i<=n;i++) {
			sum+=i;
		}
		System.out.println("Sum ="+sum);
	}

}
