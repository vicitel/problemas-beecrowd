import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		int x = a + b;
		
		System.out.println("X = " + x);
		
		input.close();

	}

}
