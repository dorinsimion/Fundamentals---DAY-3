package com.sdacademy.model;

public class Animal {
    private String type;
    private int nrPicioare;
    private boolean blana;
    private static int nrAnimale;

    public Animal(String type,int nrPicioare,boolean blana){
        this.blana=blana;
        this.nrPicioare=nrPicioare;
        this.type=type;
        nrAnimale++;
    }

    public static int getNrAnimale() {
        return nrAnimale;
    }

     public void merge(){
        switch (type){
            case "terestru":
                System.out.println("merge");
                break;
            case "acvatic":
                System.out.println("inoata");
        }
    }
}
