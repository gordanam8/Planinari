package Planina;

import java.util.ArrayList;

public class Alpinista extends Planinar {

    /*Kreirati klasu Kreirati klasu Alpinista koja nasledjuje Planinar i ima polja:
    ArrayList<Alpinista> tim
    int godineIskustva
    Od metoda:
    public double clanarina() koja iznosi 1000 - 4% za svaki brojPoena (5P)
    public boolean uspesanUspon(Planina p) koja racuna da li se objekat tipa Alpinista popeo na Planina p.
    Da li ce se alpinista popeti na planinu zavisi od toga da li ima barem
    jednog alpinisu u timu koji ima preko 5 ili vise godina iskustva u penjanju.
    konstruktor sa svim poljima (5P)*/


    private ArrayList<Alpinista> tim;
    private int godineIskustva;

    public Alpinista(int id, int brojPoena, String ime, String prezime, ArrayList<Alpinista> tim, int godineIskustva) {
        super(id, brojPoena, ime, prezime);
        this.tim = tim;
        this.godineIskustva = godineIskustva;
    }

    public double clanarina(){
        return 1000 - 40 * super.getBrojPoena();
    }
    public boolean uspesanUspon(Planina p){
        for (int i = 0; i < this.tim.size(); i++){
            if (this.tim.get(i).godineIskustva > 5){
                super.setBrojPoena(super.getBrojPoena() + 1);
                return true;
            }
        }
        return false;
    }
}

