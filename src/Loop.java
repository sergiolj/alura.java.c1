import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ratingStars=0;
        double rating, sumRating =0.0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the movie rating [0-10]: ");
            rating = sc.nextInt();
            sumRating += rating;
            if(i==2){
                ratingStars = (int)Math.round((sumRating/3)/2);            }
        }
        System.out.println(ratingStars);
    }
}
