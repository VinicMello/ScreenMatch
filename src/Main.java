import br.com.screenmatch.calculations.Calculator;
import br.com.screenmatch.calculations.RecomendationFilter;
import br.com.screenmatch.models.Episode;
import br.com.screenmatch.models.Film;
import br.com.screenmatch.models.Series;

public class Main {
    public static void main(String[] args) {
        Film myFilm = new Film("Velozes e Furiosos: Desafio em Tóquio", 2006, true, 104, "Justin Lin");
        myFilm.displayInformation();

        System.out.println();
        Film otherFilm = new Film("Transformers", 2007, true, 144, "Michael Bay");
        otherFilm.displayInformation();

        myFilm.evaluate(8);
        myFilm.evaluate(5);
        myFilm.evaluate(10);

//        System.out.println("Soma das Avaliações: " + myFilm.getSumAssessment());
//        System.out.println("Total de Avaliações: " + myFilm.getAmountAssessment());
//        System.out.println("Média: " + myFilm.getAverage());

        System.out.println();
        Series mySeries = new Series("Prison Break: Em Busca da Verdade", 2005, true, 10, true, 10, 50);
        mySeries.displayInformation();

        Calculator calculator = new Calculator();
        calculator.incluid(myFilm);
        calculator.incluid(otherFilm);
        calculator.incluid(mySeries);
        System.out.println(calculator.getFullTime());

        RecomendationFilter filter = new RecomendationFilter();
        filter.filter(myFilm, myFilm.getName());

        Episode episode = new Episode();
        episode.setNum(1);
        episode.setName(mySeries.getName());
        episode.setSeries(mySeries);
        episode.setTotalViews(200);

        filter.filter(episode, episode.getName());
    }
}
