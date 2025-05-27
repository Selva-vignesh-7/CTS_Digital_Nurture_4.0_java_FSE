import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int num = random.nextInt(100) + 1;
        int guessing = 0;
        while(guessing != num) {
            guess = sc.nextInt();
            if(guessing < num) System.out.println("Too low");
            else if(guessing > num) System.out.println("Too high");
            else System.out.println("Correct");
        }
    }
}

