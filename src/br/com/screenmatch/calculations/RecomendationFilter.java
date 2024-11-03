package br.com.screenmatch.calculations;

public class RecomendationFilter {

    // Método para filtrar recomendações
    public void filter(Classification c, String name) {
        if (c.getClassification() >= 4) {
            System.out.println("🎬 " + name + ": Está entre os preferidos! 🌟");
        } else if (c.getClassification() >= 2) {
            System.out.println("🎬 " + name + ": Bem avaliado. Vale a pena conferir! 👍");
        } else {
            System.out.println("🎬 " + name + ": Adicione à sua lista para assistir depois. 📝");
        }
    }
}
