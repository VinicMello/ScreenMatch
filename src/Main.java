import br.com.screenmatch.calculations.Calculator;
import br.com.screenmatch.calculations.RecomendationFilter;
import br.com.screenmatch.models.Episode;
import br.com.screenmatch.models.Film;
import br.com.screenmatch.models.Series;

public class Main {
    public static void main(String[] args) {
        RecomendationFilter filter = new RecomendationFilter();
        Calculator calculator = new Calculator();

        Film myFilm = new Film("Velozes e Furiosos: Desafio em Tóquio", 2006, true, 104, "Justin Lin");
        myFilm.evaluate(8);
        myFilm.evaluate(5);
        myFilm.evaluate(10);
        myFilm.evaluate(10);
        myFilm.displayInformation();
        filter.filter(myFilm, myFilm.getName());


        System.out.println();
        Film otherFilm = new Film("Transformers", 2007, true, 144, "Michael Bay");
        otherFilm.evaluate(6.5);
        otherFilm.evaluate(7);
        otherFilm.evaluate(9);
        otherFilm.displayInformation();
        filter.filter(otherFilm, otherFilm.getName());


        System.out.println();
        Series mySerie = new Series("Prison Break: Em Busca da Verdade", 2005, true, 10, true, 10, 50);
        mySerie.displayInformation();
        Episode episode = new Episode(1, mySerie.getName(), mySerie, 200);
        filter.filter(episode, episode.getName());

        calculator.incluid(myFilm);
        calculator.incluid(otherFilm);
        calculator.incluid(mySerie);
        System.out.println();
        System.out.println("Para maratonar os filmes " + myFilm.getName() + " e " + otherFilm.getName() + ", " +
                "e a série " + mySerie.getName() + ", você vai precisar de: " +
                calculator.getFullTime() + " minutos.");
    }
}
