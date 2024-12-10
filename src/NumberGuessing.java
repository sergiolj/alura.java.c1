import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {

    public static void main(String[] args) {
        int guess = 0;
        Random rand = new Random();
        guess = rand.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        int number = 0;
        int attempts = 0;

        while (attempts<5){
            System.out.println(guess);
            System.out.print("Guess a number: ");
            number = sc.nextInt();
            attempts++;

            if(verify(number, guess)){
                System.out.println("Congratulations! You nailed it!! In your " + attempts + " attempt.");
                break;
            }else if (attempts==5){
                System.out.println("Sorry, but you didn't get it this time!");
            }
        }
    }

    public static boolean verify(int number, int guess){
        if(number == guess){
            return true;
        } else if (number < guess) {
            System.out.println("Number is too low!");
            return false;
        }else{
            System.out.println("Number is too high!");
            return false;
        }
    }
}
