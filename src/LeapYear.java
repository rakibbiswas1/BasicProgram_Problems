import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {

        int year = 0;
        boolean leap = false;

        System.out.print("Enter a year: ");

        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();

        System.out.println();
        if (year >= 1000 && year <= 9999) {
            if (year%4 == 0) {
                leap = true;
                if(year%100 == 0 ) {
                    if(year%400 == 0)
                        leap = true;
                    else
                        leap = false;
                }
            }
            if (leap)
                System.out.println(year + " is a Leap Year.");
            else
                System.out.println(year + " is not a Leap Year.");
        }

    }
}
