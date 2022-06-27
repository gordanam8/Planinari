package Planina;

public abstract class Planinar {
    /*Kreirati klasu Planinar koja ima polja:
    int id
    int brojPoena
    String ime
    String prezime
    Od metoda:
    konstruktor sa svim poljima (5P)
    public String toString() (5P)
    public abstract double clanarina() (2.5P)
    public abstract boolean uspesanUspon(Planina p)(2.5P)
    public int getBrojPoena()getter za broj poena (2.5P)
    public void setBrojPoena() setter za broj poena (2.5P)*/

    private int id;
    private int brojPoena;
    private String ime;
    private String prezime;

    public Planinar(int id, int brojPoena, String ime, String prezime) {
        this.id = id;
        this.brojPoena = brojPoena;
        this.ime = ime;
        this.prezime = prezime;
    }


    @Override
    public String toString() {
        return "Planinar{" +
                "id=" + id +
                ", brojPoena=" + brojPoena +
                ", ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                '}';
    }

    public abstract double clanarina();

    public abstract boolean uspesanUspon(Planina p);

    public int getBrojPoena() {
        return brojPoena;
    }

    public void setBrojPoena(int brojPoena) {
        this.brojPoena = brojPoena;
    }

    public int getId() {
        return id;
    }

}

