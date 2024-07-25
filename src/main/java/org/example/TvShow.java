package org.example;

public class TvShow {
    private String name;
    private int episodes;
    private String genre;

    public TvShow(String name, int episodes, String genre) {
        this.name = name;
        this.episodes = episodes;
        this.genre = genre;


    }
    public String getName() {
        return name;
    }
    public int getEpisodes() {
        return episodes;
    }
    public String getGenre() {
        return genre;
    }
    public String toString() { // Why won't this grab genre?
        return "The name of the show is " + getName() + " it had " + getEpisodes() + " episodes in the " + getGenre() + " genre.";
    }
}
