import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ratingStars = 0;
        double rating = 0, sumRating = 0.0;
        int counter = 0;
        boolean done = false;


        while (!done) {
            System.out.println("Enter the movie rating [0-10] or [-1 Exit]: ");
            rating = sc.nextInt();

            if (rating > 0) {
                sumRating += rating;
                counter += 1;
            } else {
                if (rating == -1 && counter == 0) {
                    done = true;
                    System.out.println("Insufficient rating data");
                } else {
                    ratingStars = (int) Math.round((sumRating / counter) / 2);
                    done = true;
                }
            }
        }
        System.out.println("Rating Stars: " + ratingStars);
    }
}
