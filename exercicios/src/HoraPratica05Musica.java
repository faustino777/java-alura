public class HoraPratica05Musica {
    String title;
    String artist;
    int releaseYear;
    double rating;
    int totalReviews;

    void assess(double rate) {
        rating += rate;
        totalReviews++;
    }

    double averageRating() {
        return rating / totalReviews;
    }

    void displaysTechnicalSheet() {
        System.out.println("Nome da música: " + title);
        System.out.println("Ano de lançamento: " + releaseYear);
    }
}
