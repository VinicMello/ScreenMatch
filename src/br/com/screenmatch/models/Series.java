package br.com.screenmatch.models;

public class Series extends AudioVisualContent {
    // Atributos específicos de Series
    private int season;
    private boolean active;
    private int episodesPerSeason;
    private int minutesPerSeason;

    // Construtor
    public Series(String name, int yearRelease, boolean includedPlan, int season, boolean active, int episodesPerSeason, int minutesPerSeason) {
        super(name, yearRelease, includedPlan, season * episodesPerSeason * minutesPerSeason);
        this.season = season;
        this.active = active;
        this.episodesPerSeason = episodesPerSeason;
        this.minutesPerSeason = minutesPerSeason;
    }

    // Getters
    public boolean isActive() {
        return active;
    }

    public int getSeason() {
        return season;
    }

    public int getEpisodesPerSeason() {
        return episodesPerSeason;
    }

    public int getMinutesPerSeason() {
        return minutesPerSeason;
    }

    // Setters
    public void setActive(boolean active) {
        this.active = active;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public void setEpisodesPerSeason(int episodesPerSeason) {
        this.episodesPerSeason = episodesPerSeason;
    }

    public void setMinutesPerSeason(int minutesPerSeason) {
        this.minutesPerSeason = minutesPerSeason;
    }

    @Override
    public int getDurationMinutes() {
        return season * episodesPerSeason * minutesPerSeason;
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println("Temporadas: " + season);
        System.out.println("Ativa: " + active);
        System.out.println("Episódios por temporada: " + episodesPerSeason);
        System.out.println("Minutos por episódio: " + minutesPerSeason);
        System.out.println("Duração total em minutos: " + getDurationMinutes());
    }
}
