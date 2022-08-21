import java.util.Scanner;
public class Even_Odd_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println("The given number is Even number");
        } else {
            System.out.println("The given number is Odd number");
        }
    }
}
