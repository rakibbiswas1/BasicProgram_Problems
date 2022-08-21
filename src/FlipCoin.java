import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        int Heads = 0;
        int Tails = 0;
        int count = 1;
        double random = 0.0;

        System.out.println("Enter the number");
        Scanner n = new Scanner(System.in);
        int flips = n.nextInt();

        while(count <= flips) {

            random = Math.random();
            System.out.println(count+" "+random);

            if (random <0.5) {
                Heads++;
                System.out.println("Heads");
            }
            else {
                Tails++;
                System.out.println("Tails");
            }
            count++;
        }
        System.out.println();
        System.out.println("numbers of Heads:" +Heads);
        System.out.println("numbers of Tails:" +Tails);

        double Headpercent = (double)Heads/flips*100;
        double Tailspercent = (double)Tails/flips*100;

        System.out.println("Percentage of Heads :" +Headpercent);
        System.out.println("Percentage of Tails :" + Tailspercent);
    }
}
