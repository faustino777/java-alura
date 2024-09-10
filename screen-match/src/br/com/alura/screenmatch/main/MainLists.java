package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Serie;
import br.com.alura.screenmatch.models.Title;

import java.util.ArrayList;

public class MainLists {
    public static void main(String[] args) {
        Movie myMovie = new Movie("O poderoso chefão.", 1972);
        myMovie.assess(9);

        Movie myMovie2 = new Movie("O poderoso chefão 2", 1980);
        myMovie2.assess(6);

        Movie myMovie3 = new Movie("O poderoso chefão 3", 1990);
        myMovie3.assess(10);

        Serie breakingBad = new Serie("Breaking Bad", 2008);

        ArrayList<Title> listOfTitles = new ArrayList<>();
        listOfTitles.add(myMovie);
        listOfTitles.add(myMovie2);
        listOfTitles.add(myMovie3);
        listOfTitles.add(breakingBad);

        for (Title item: listOfTitles) {
            System.out.println(item.getName());
            if (item instanceof Movie movie) {
                System.out.println("Classificação: " + movie.getClassification());
            }


        }
    }
}
