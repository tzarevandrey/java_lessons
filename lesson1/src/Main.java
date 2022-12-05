import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int rNum = new Random().nextInt(1, 101);
        System.out.println("Guess the number from 1 to 100");
        boolean i = true;
        Scanner sc = new Scanner(System.in);
        while (i) {
            System.out.println("Input number: ");
            while (!sc.hasNext()) {}
            if (sc.hasNextInt()) {
                int n = sc.nextInt();
                if (n < 1 || n > 100) {
                    System.out.println("The number must be from 1 to 100");
                } else {
                    if (n == rNum) {
                        System.out.println("Guessed it, this number is " + n);
                        i = false;
                    } else {
                        if (rNum > n) {
                            System.out.println("The hidden number is greater than " + n);
                        } else {
                            System.out.println("The hidden number is less than " + n);
                        }
                    }
                }
            } else {
                System.out.println("Not a number entered");
                sc.nextLine();
            }
        }
        System.out.println("Game over, press Enter to exit");
        while (!sc.hasNext()) {}
        sc.close();
        System.exit(0);
    }
}