import java.util.Locale;
import java.util.Scanner;

public class Ex1005 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        double b = input.nextDouble();

        double media = ((a*3.5)+(b*7.5))/11.0;

        System.out.printf("MEDIA = %.5f%n", media);

        input.close();

    }
}
