package br.com.alura.screenmatch.models;

public class Serie extends Title {
    int season;
    int episodesPerSeason;
    boolean active;
    int minutesPerEpisodes;

    public Serie(String name, int releaseYear) {
        super(name, releaseYear);
    }

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public int getEpisodesPerSeason() {
        return episodesPerSeason;
    }

    public void setEpisodesPerSeason(int episodesPerSeason) {
        this.episodesPerSeason = episodesPerSeason;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getMinutesPerEpisodes() {
        return minutesPerEpisodes;
    }

    public void setMinutesPerEpisodes(int minutesPerEpisodes) {
        this.minutesPerEpisodes = minutesPerEpisodes;
    }

    @Override
    public int getDuration() {
        return season * episodesPerSeason * minutesPerEpisodes;
    }
}
