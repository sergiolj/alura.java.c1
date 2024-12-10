import java.util.Scanner;

public class Conditional {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String movieTitle;
        int releaseYear = 2022;
        boolean planIncluded = false;
        int ratingStars = 4;
        String subscriptionType = "regular";

/*    if ( releaseYear >=2022 && ratingStars >=4 ) {
        System.out.println("New movies just released and best ratting.");
    }
    if (planIncluded || subscriptionType.equals("PLUS")) {
        System.out.println("This movie are available for you!");
    }else{
        System.out.println("This movie isn´t available in your subscription. \nAre you like to rent this movie?");
    }*/
        System.out.println("Enter the movie title: ");
        movieTitle = sc.nextLine();
        System.out.println("Enter the release year: ");
        releaseYear = sc.nextInt();
        System.out.println("Enter the movie rating: ");
        ratingStars = sc.nextInt();

        System.out.println(description(movieTitle,releaseYear,ratingStars));


    }
    public static String description(String s, int y, int r){
        String description = """
                Movie: %s
                Release Year: %d
                Rating: %d
                """.formatted(s,y,r);
        return description;
    }
}

