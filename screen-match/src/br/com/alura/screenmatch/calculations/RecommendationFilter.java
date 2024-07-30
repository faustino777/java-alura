package br.com.alura.screenmatch.calculations;

public class RecommendationFilter {

    public void filter(Sortable sortable) {
        if (sortable.getClassification() >= 4) {
            System.out.println("Está entre os preferidos do momento.");
        } else if (sortable.getClassification() >= 2) {
            System.out.println("Bem avaliado, no momento.");
        } else {
            System.out.println("Assista depois.");
        }
    }
}
