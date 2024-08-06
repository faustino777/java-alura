import br.com.alura.screenmatch.calculations.RecommendationFilter;
import br.com.alura.screenmatch.calculations.TimeCalculator;
import br.com.alura.screenmatch.models.Episodes;
import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Serie;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.setName("O poderoso chefão.");
        myMovie.setReleaseYear(1972);
        myMovie.setDuration(180);
        System.out.println("Duração do filme: " + myMovie.getDuration());

        myMovie.displaysTechnicalSheet();
        myMovie.assess(9);
        myMovie.assess(5.4);
        myMovie.assess(9.5);
        System.out.println("Total de avaliações: " + myMovie.getTotalReviews());
        String media = String.format("A média de avaliações é: %.2f", myMovie.averageRating());
        System.out.println(media);

        Serie breakingBad = new Serie();
        breakingBad.setName("Breaking Bad");
        breakingBad.setReleaseYear(2008);
        breakingBad.displaysTechnicalSheet();
        breakingBad.setSeason(5);
        breakingBad.setEpisodesPerSeason(16);
        breakingBad.setMinutesPerEpisodes(58);
        System.out.println("Duração para maratonar Breaking Bad: " + breakingBad.getDuration());

        Movie myMovie2 = new Movie();
        myMovie2.setName("O poderoso chefão 2.");
        myMovie2.setReleaseYear(1980);
        myMovie2.setDuration(200);

        TimeCalculator calculator = new TimeCalculator();
        calculator.calculateTime(myMovie);
        calculator.calculateTime(myMovie2);
        calculator.calculateTime(breakingBad);
        System.out.println("Tempo para maratonar: " + calculator.getTotalTime() / 60 + " horas");

        RecommendationFilter filter = new RecommendationFilter();
        filter.filter(myMovie);

        Episodes episode = new Episodes();
        episode.setNum(1);
        episode.setSerie(breakingBad);
        episode.setTotalViews(300);
        filter.filter(episode);
    }
}
