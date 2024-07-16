package br.com.alura.screenmatch.models;

public class Movie {
    private String name;
    private int releaseYear;
    private boolean includedInThePlain;
    private double rating;
    private int totalReviews;
    private int duration;

    public int getTotalReviews() {
        return totalReviews;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public boolean isIncludedInThePlain() {
        return includedInThePlain;
    }

    public String getName() {
        return name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public double getRating() {
        return rating;
    }

    public int getDuration() {
        return duration;
    }

    public void displaysTechnicalSheet() {
        System.out.println("Nome do filme: " + name);
        System.out.println("Ano de lançamento: " + releaseYear);
    }

    public void assess(double rate){
        rating += rate;
        totalReviews++;
    }

    public double averageRating() {
        return rating / totalReviews;
    }
}
