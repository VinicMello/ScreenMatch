package br.com.screenmatch.models;

import br.com.screenmatch.calculations.Classification;

public class Film extends AudioVisualContent implements Classification {

    // Atributo
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

    // Exibe informações do filme, incluindo o diretor
    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println("Diretor: " + director);
        System.out.println("Soma das Avaliações: " + getSumAssessment());
        System.out.println("Total de Avaliações: " + getAmountAssessment());
        System.out.println("Média: " + getAverage());
    }

    // Retorna a classificação do filme, calculada a partir da média
    @Override
    public int getClassification() {
        return (int) getAverage() / 2;
    }
}
