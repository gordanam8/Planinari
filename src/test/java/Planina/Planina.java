package Planina;

import java.util.ArrayList;

public class Planina {
    /*Kreirati klasu Planina koja od polja ima:
    String ime
    String nazivDrzave
    double visina
    Od metoda:
    konstruktor sa svim poljima (5P)
    public double getVisina() getter koji vraca visina (5P)
    public Planina getNajvisaPlanina(ArrayList<Planina> planine)metodu koja vraca najvisu planinu u datoj listi (5P)*/

    private String ime;
    private String nazivDrzave;
    private double visina;

    public Planina(String ime, String nazivDrzave, double visina) {
        this.ime = ime;
        this.nazivDrzave = nazivDrzave;
        this.visina = visina;
    }

    public double getVisina() {
        return visina;
    }

    public Planina getNajvisaPlanina(ArrayList<Planina> planine){
        double maxVisina = 0;
        int maxIndex = 0;
        for (int i = 0; i < planine.size(); i++){
           if (planine.get(i).getVisina() > maxVisina){
               maxVisina = planine.get(i).getVisina();
               maxIndex = i;
           }
        }
        return planine.get(maxIndex);
    }
}
