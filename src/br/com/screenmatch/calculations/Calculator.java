package br.com.screenmatch.calculations;

import br.com.screenmatch.models.AudioVisualContent;
import br.com.screenmatch.models.Film;
import br.com.screenmatch.models.Series;

public class Calculator {
    private int fullTime = 0;

    public int getFullTime() {
        return fullTime;
    }

    public void incluid(AudioVisualContent avc) {
        fullTime += avc.getDurationMinutes();
    }
}
