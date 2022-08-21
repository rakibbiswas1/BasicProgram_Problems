import java.util.Scanner;
public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = sc.nextInt();
        double result = 0.0;
        for (int i = a; i > 0; i--) {
            result = result + (double) 1 / i;
        }
        System.out.println("Harmonic number of " + a + " is " + result);
    }
}
