import br.com.screenmatch.models.Film;
import br.com.screenmatch.models.Series;

public class Main {
    public static void main(String[] args) {
        Film myFilm = new Film("Velozes e Furiosos: Desafio em Tóquio", 2006, true, 70, "Justin Lin");
        myFilm.displayInformation();

        myFilm.evaluate(8);
        myFilm.evaluate(5);
        myFilm.evaluate(10);

        System.out.println("Soma das Avaliações: " + myFilm.getSumAssessment());
        System.out.println("Total de Avaliações: " + myFilm.getAmountAssessment());
        System.out.println("Média: " + myFilm.getAverage());

        Series mySeries = new Series("Prison Break: Em Busca da Verdade", 2005, true, 10, true, 10, 50);
        mySeries.displayInformation();
    }
}
