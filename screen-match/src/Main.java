import br.com.alura.screenmatch.models.Movie;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.setName("O poderoso chefão.");
        myMovie.setReleaseYear(1972);
        myMovie.setDuration(180);

        myMovie.displaysTechnicalSheet();
        myMovie.assess(9);
        myMovie.assess(5.4);
        myMovie.assess(9.5);
        System.out.println("Total de avaliações: " + myMovie.getTotalReviews());
        String media = String.format("A média de avaliações é: %.2f", myMovie.averageRating());
        System.out.println(media);
    }
}
