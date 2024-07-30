package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.calculations.Sortable;

public class Episodes implements Sortable {
    private int num;
    private String name;
    private String serie;
    private int totalViews;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalViews() {
        return totalViews;
    }

    public void setTotalViews(int totalViews) {
        this.totalViews = totalViews;
    }

    @Override
    public int getClassification() {
        if (totalViews > 100 ) {
            return 4;
        } else {
            return 2;
        }

    }
}
