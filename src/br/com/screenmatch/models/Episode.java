package br.com.screenmatch.models;

import br.com.screenmatch.calculations.Classification;

public class Episode implements Classification {

    // Atributos
    private int num;
    private String name;
    private Series series;
    private int totalViews;

    // Construtor
    public Episode(int num, String name, Series series, int totalViews) {
        this.num = num;
        this.name = name;
        this.series = series;
        this.totalViews = totalViews;
    }

    // Getters e Setters

    // Getter e Setter para num
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    // Getter e Setter para name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter e Setter para series
    public Series getSeries() {
        return series;
    }

    public void setSeries(Series series) {
        this.series = series;
    }

    // Getter e Setter para totalViews
    public int getTotalViews() {
        return totalViews;
    }

    public void setTotalViews(int totalViews) {
        this.totalViews = totalViews;
    }

    // Implementação do método getClassification da interface Classification
    @Override
    public int getClassification() {
        if (totalViews > 100) {
            return 4;
        } else {
            return 2;
        }
    }
}
