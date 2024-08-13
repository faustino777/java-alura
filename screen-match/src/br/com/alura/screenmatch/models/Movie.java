package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.calculations.Sortable;

public class Movie extends Title implements Sortable {
    private String filmDirector;

    public String getFilmDirector() {
        return filmDirector;
    }

    public void setFilmDirector(String filmDirector) {
        this.filmDirector = filmDirector;
    }


    @Override
    public int getClassification() {
        return (int) (getRating() / 2);
    }

    @Override
    public String toString() {
        return "Filme: " + this.getName() + " (" + this.getReleaseYear() + ")";
    }
}
