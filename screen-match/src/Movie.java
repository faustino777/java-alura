public class Movie {
    String name;
    int releaseYear;
    boolean includedInThePlain;
    double rating;
    int totalReviews;
    int duration;

    void displaysTechnicalSheet() {
        System.out.println("Nome do filme: " + name);
        System.out.println("Ano de lançamento: " + releaseYear);
    }

    void assess(double rate){
        rating += rate;
        totalReviews++;
    }

    double averageRating() {
        return rating / totalReviews;
    }
}
