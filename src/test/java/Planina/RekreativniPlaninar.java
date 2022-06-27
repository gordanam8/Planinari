package Planina;


public class RekreativniPlaninar extends Planinar {

    /*Kreirati klasu RekreativniPlaninar koja nasledjuje Planinar i ima polja:
    double tezinaOpreme
    String nazivOkruga
    double maxUspon
    Od metoda:
    public double clanarina() koja iznosi 1000 - 1% za svaki brojPoena (5P)
    public boolean uspesanUspon(Planina p) koja racuna da li se objekat tipa RekreativniPlaninar
    popeo na Planina p. Da li ce rekreativni planinar uspešno popeti na planinu zavisi
    od toga da li je njegov najveci uspon veci od visine planine,
    s tim da oprema dodatno otežava penjanje i za svaki kilogram opreme koji nosi može da prede 50 metara manje.
    Ukoliko je uspon uspesan, povecaj brojPoena  za 1(5P)
    konstruktor sa svim poljima (5P)*/

    private double tezinaOpreme;
    private String nazivOkruga;
    private double maxUspon;

    public RekreativniPlaninar(int id, int brojPoena, String ime, String prezime,
                               double tezinaOpreme, String nazivOkruga, double maxUspon) {
        super(id, brojPoena, ime, prezime);
        this.tezinaOpreme = tezinaOpreme;
        this.nazivOkruga = nazivOkruga;
        this.maxUspon = maxUspon;
    }

    public double clanarina(){
        return 1000 - 10*super.getBrojPoena();
    }

    public boolean uspesanUspon(Planina p){
        if(p.getVisina() <= this.maxUspon - this.tezinaOpreme*50){
            super.setBrojPoena(super.getBrojPoena()+1);
            return true;
        }
        else return false;
    }
}


