public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.name = "O poderoso chefão.";
        myMovie.releaseYear = 1972;
        myMovie.duration = 180;

        myMovie.displaysTechnicalSheet();
        myMovie.assess(9);
        myMovie.assess(5.4);
        myMovie.assess(9.5);
        System.out.println(myMovie.rating);
        System.out.println(myMovie.totalReviews);
        System.out.println(myMovie.averageRating());
    }
}
