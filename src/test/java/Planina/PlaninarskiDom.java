package Planina;


import java.util.ArrayList;

public class PlaninarskiDom {
    /*Kreirati klasu PlaninarskiDom koja ima polja:
    String nazivDoma
    int godinaOsnivanja
    ArrayList<Planinari> clanoviDoma
    Od metoda:
    konstruktor sa svim poljima (5P)
    public void uclaniPlaninara(Planinar p)koja dodaje Planinar p u clanoviDoma5(P)
    public int uspesnoPopeli()koja vraca broj planinara koji su se uspesno popeli na barem jednu planinu 5(P)
    public void izbaciPlaninara(int idPlaninara)koja izbacuje planinara iz clanoviDoma prema unetom  idPlaninara (5P)
    public double mesecniPrihod() koja racuna i vraca mesecni prihod od clanarina svih planinara
    public ArrayList<Planinar> sortPlaninari()koja sortira planinare po brojPoena
    ostvarenih za svaku savladanu planinu od najuspesnijeg do namanje uspesnog planinara (5P)*/

    private String nazivDoma;
    private int godinaOsnivanja;
    private ArrayList<Planinar> clanoviDoma;

    public PlaninarskiDom(String nazivDoma, int godinaOsnivanja, ArrayList<Planinar> clanoviDoma) {
        this.nazivDoma = nazivDoma;
        this.godinaOsnivanja = godinaOsnivanja;
        this.clanoviDoma = clanoviDoma;
    }

    public void uclaniPlaninara(Planinar p) {
        this.clanoviDoma.add(p);
    }

    public int uspesnoPopeli() {
        int brUspesnih = 0;
        for (int i = 0; i < this.clanoviDoma.size(); i++) {
            if (this.clanoviDoma.get(i).getBrojPoena() > 0) {
                brUspesnih++;
            }
        }
        return brUspesnih;
    }

    public void izbaciPlaninara(int idPlaninara) {
        int index = 0;
        for (int i = 0; i < this.clanoviDoma.size(); i++) {
            if (this.clanoviDoma.get(i).getId() == idPlaninara) {
                index = i;
            }
        }
        this.clanoviDoma.remove(index);
    }

    public double mesecniPrihod() {
        double prihod = 0;
        for (int i = 0; i < this.clanoviDoma.size(); i++) {
            prihod = prihod + this.clanoviDoma.get(i).clanarina();
        }
        return prihod;
    }

    public ArrayList<Planinar> sortPlaninari() {
        ArrayList<Planinar> sortiraniPlaninariPomocna = new ArrayList<Planinar>();
        ArrayList<Planinar> sortiraniPlaninari = new ArrayList<Planinar>();
        for (int i = 0; i < this.clanoviDoma.size(); i++) {
            sortiraniPlaninariPomocna.add(this.clanoviDoma.get(i));
        }
        int maxIndex = 0;
        int maxBrPoena = 0;

        while (sortiraniPlaninariPomocna.size() > 0) {

            maxIndex = 0;
            maxBrPoena = 0;
            for (int i = 0; i < sortiraniPlaninariPomocna.size(); i++) {
                if (sortiraniPlaninariPomocna.get(i).getBrojPoena() > maxBrPoena) {
                    maxBrPoena = sortiraniPlaninariPomocna.get(i).getBrojPoena();
                    maxIndex = i;
                }
            }
            sortiraniPlaninari.add(sortiraniPlaninariPomocna.get(maxIndex));
            sortiraniPlaninariPomocna.remove(maxIndex);
        }
        return sortiraniPlaninari;
    }
}
