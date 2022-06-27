package Planina;


import java.util.ArrayList;

public class MainKlasa {
    public static void main(String[] args) {

        Planina p1 = new Planina("Avala", "Srbija", 450.0);
        Planina p2 = new Planina("Stara planina", "Srbija", 2376);
        Planina p3 = new Planina("Kopaonik", "Srbija", 2000);

        ArrayList<Planina> planine = new ArrayList<Planina>();
        planine.add(p1);
        planine.add(p2);
        planine.add(p3);

        System.out.println("Visina najvise planine je: " + p1.getNajvisaPlanina(planine).getVisina());

        RekreativniPlaninar rp1 = new RekreativniPlaninar(1,0, "Pera","Peric", 0, "Okrug1", 509);
        RekreativniPlaninar rp2 = new RekreativniPlaninar(2,1, "Sima","Simic", 10, "Okrug2", 2190);
        RekreativniPlaninar rp3 = new RekreativniPlaninar(3,0, "Bosko","Simic", 15, "Okrug3", 2);

        ArrayList<Alpinista> listaAlpinista = new ArrayList<Alpinista>();

        Alpinista alp1 = new Alpinista(17, 0, "Marko", "Markovic", listaAlpinista, 17);
        listaAlpinista.add(alp1);
        Alpinista alp2 = new Alpinista(15, 1, "Homer", "Simpson", listaAlpinista, 0);
        Alpinista alp3 = new Alpinista(16, 1, "Iskusni", "Alpinista", listaAlpinista, 5);

        ArrayList<Planinar> clanoviDoma = new ArrayList<Planinar>();
        clanoviDoma.add(rp1);
        clanoviDoma.add(rp2);
        clanoviDoma.add(rp3);
        clanoviDoma.add(alp1);
        clanoviDoma.add(alp1);
        clanoviDoma.add(alp3);

        System.out.println("");
        for (int i = 0; i < clanoviDoma.size(); i++){
            System.out.println("Clan doma " + (i+1) + " " + clanoviDoma.get(i).toString());
        }

        System.out.println("");
        for (int i = 0; i < clanoviDoma.size(); i++){
            for ( int j = 0; j < planine.size(); j++){
                System.out.println("Planinar ciji je ID " + clanoviDoma.get(i).getId() + " moze da se popne na planinu visine " +
                        planine.get(j).getVisina() + " " + clanoviDoma.get(i).uspesanUspon(planine.get(j)));
            }
        }
        for (int i = 0; i < clanoviDoma.size(); i++){
            System.out.println("Clanarina planinara ciji je ID " + clanoviDoma.get(i).clanarina());
        }

        ArrayList<Planinar> clanoviDomaInit = new ArrayList<Planinar>();
        PlaninarskiDom pd = new PlaninarskiDom("Planinarski Dom", 2000, clanoviDomaInit);
        pd.uclaniPlaninara(rp1);
        pd.uclaniPlaninara(rp2);
        pd.uclaniPlaninara(rp3);
        pd.uclaniPlaninara(alp1);
        pd.uclaniPlaninara(alp2);
        pd.uclaniPlaninara(alp3);


        System.out.println("Uspesno se popelo " + pd.uspesnoPopeli() + " planinara. ");
        System.out.println("Mesecni prihod drustva je " + pd.mesecniPrihod());

        pd.izbaciPlaninara(0);

        System.out.println("Uspesno se popelo " + pd.uspesnoPopeli() + " planinara. ");
        System.out.println("Mesecni prihod drustva je " + pd.mesecniPrihod());

        ArrayList<Planinar> sortiraniPlaninari = new ArrayList<Planinar>();
        sortiraniPlaninari = pd.sortPlaninari();
        for (int i = 0; i < sortiraniPlaninari.size(); i++){
            System.out.println(sortiraniPlaninari.get(i).toString());
        }

    }
}
