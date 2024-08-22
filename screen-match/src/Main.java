import br.com.alura.screenmatch.calculations.RecommendationFilter;
import br.com.alura.screenmatch.calculations.TimeCalculator;
import br.com.alura.screenmatch.models.Episodes;
import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie("O poderoso chefão.", 1972);
        myMovie.setDuration(180);
        System.out.println("Duração do filme: " + myMovie.getDuration());

        myMovie.displaysTechnicalSheet();
        myMovie.assess(9);
        myMovie.assess(5.4);
        myMovie.assess(9.5);
        System.out.println("Total de avaliações: " + myMovie.getTotalReviews());
        String media = String.format("A média de avaliações é: %.2f", myMovie.averageRating());
        System.out.println(media);

        Serie breakingBad = new Serie("Breaking Bad", 2008);
        breakingBad.displaysTechnicalSheet();
        breakingBad.setSeason(5);
        breakingBad.setEpisodesPerSeason(16);
        breakingBad.setMinutesPerEpisodes(58);
        System.out.println("Duração para maratonar Breaking Bad: " + breakingBad.getDuration());

        Movie myMovie2 = new Movie("O poderoso chefão 2", 1980);
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

        Movie myMovie3 = new Movie("O poderoso chefão 3", 1990);
        myMovie3.setDuration(200);
        myMovie3.assess(10);

        ArrayList<Movie> movieList = new ArrayList<>();
        movieList.add(myMovie);
        movieList.add(myMovie2);
        movieList.add(myMovie3);
        System.out.println("Tamanho da lista: " + movieList.size());
        System.out.println("Nome do primeiro filme: " + movieList.get(0).getName());
        System.out.println(movieList);


    }
}
