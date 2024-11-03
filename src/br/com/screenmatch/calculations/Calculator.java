package br.com.screenmatch.calculations;

import br.com.screenmatch.models.AudioVisualContent;

public class Calculator {

    // Atributo
    private int fullTime = 0;

    // Getter para fullTime
    public int getFullTime() {
        return fullTime;
    }

    // Método para incluir o tempo de conteúdo audiovisual
    public void incluid(AudioVisualContent avc) {
        fullTime += avc.getDurationMinutes();
    }
}
