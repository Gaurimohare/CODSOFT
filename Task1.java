import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int num = random.nextInt(100);
        System.out.println("HELLO! Welcome to the Number Game...");
        System.out.println("Guess the number between 1 to 100 :");

        int count = 0;
        int maxAttempt = 10;

        for (int attepmt = 1; attepmt <= maxAttempt; attepmt++) {
            System.out.println("Your " + (attepmt) + " Attempt start now");
            int user = scanner.nextInt();
            count++;
            if (user == num) {
                System.out.println("That's Right! You Win!");
                System.out.println("You Guess Number In " + count + " Attempts");

                break;
            } else if (user<num) {
                System.out.println("Try Again. The number is higher.");

            } else {
                System.out.println("Try Again. The number is smaller.");

            }
            if (attepmt == maxAttempt) {
                System.out.println("Sorry. Please try again.");

            }

        }
        scanner.close();

    }
}
