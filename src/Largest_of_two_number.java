import java.util.Scanner;
public class Largest_of_two_number {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd number: ");
        int b = sc.nextInt();
        if (a>b) {
            System.out.println(a+ ">" +b);
        } else if (a<b) {
            System.out.println(a+ "<" +b);
        } else {
            System.out.println(a+ "=" +b);
        }
    }
}
