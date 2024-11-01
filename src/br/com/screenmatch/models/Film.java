package br.com.screenmatch.models;

public class Film extends AudioVisualContent {

    private String director;

    // Construtor
    public Film(String name, int yearRelease, boolean includedPlan, int durationMinutes, String director) {
        super(name, yearRelease, includedPlan, durationMinutes);
        this.director = director;
    }

    // Getter
    public String getDirector() {
        return director;
    }

    // Setter
    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println("Diretor: " + director);
    }
}
