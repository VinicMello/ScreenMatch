package br.com.screenmatch.models;

public abstract class AudioVisualContent {
    // Atributos
    private String name;
    private int yearRelease;
    private boolean includedPlan;
    private double sumAssessment;
    private int amountAssessment;
    private int durationMinutes;

    // Construtores
    public AudioVisualContent() {
    }

    public AudioVisualContent(String name, int yearRelease, boolean includedPlan, int durationMinutes) {
        this.name = name;
        this.yearRelease = yearRelease;
        this.includedPlan = includedPlan;
        this.durationMinutes = durationMinutes;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    public boolean isIncludedPlan() {
        return includedPlan;
    }

    public double getSumAssessment() {
        return sumAssessment;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public int getAmountAssessment() {
        return amountAssessment;
    }

    public double getAverage() {
        return amountAssessment > 0 ? sumAssessment / amountAssessment : 0;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setYearRelease(int yearRelease) {
        this.yearRelease = yearRelease;
    }

    public void setIncludedPlan(boolean includedPlan) {
        this.includedPlan = includedPlan;
    }

    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    // Métodos
    public void displayInformation() {
        System.out.println("Nome: " + name);
        System.out.println("Ano de lançamento: " + yearRelease);
        System.out.println("Duração em minutos: " + durationMinutes);
        System.out.println("Incluso no plano: " + includedPlan);
    }

    public void evaluate(double value) {
        sumAssessment += value;
        amountAssessment++;
    }
}
