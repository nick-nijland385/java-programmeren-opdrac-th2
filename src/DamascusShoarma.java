import java.util.ArrayList;

public class DamascusShoarma {

    static ArrayList<Kok> koks = new ArrayList<>();
    static ArrayList<Bezorger> bezorgers = new ArrayList<>();

    static Klant klant = new Klant();
    public static void main(String[] args) {

        // bevat 2 koks
        Kok henk = new Kok("Henk De Vries", "Grote Poort 1", "8364AA", "Utrecht", 0001, 1.2d, true);
        Kok werner = new Kok("Werner Jansen", "Kleine Draak 6", "1937AN", "Groningen", 0002, 1.4d, false);

        // bevat 2 bezorgers
        Bezorger mark = new Bezorger("Mark De Jong", "Middenweg 3", "2837AH", "Amsterdam", 0003, 0.3d, true);
        Bezorger albert = new Bezorger("Albert Nul", "Dorpsweg 4", "8461VV", "Zierikzee", 0004, 0.25d, false);

        // voeg personeel toe aan arraylists
        koks.add(henk);
        koks.add(werner);
        bezorgers.add(mark);
        bezorgers.add(albert);

        // maak 1 klant
        klant.setNaam("Bert Zwiers");
        klant.setAdres("Bierstraat 20");
        klant.setPostcode("3841TT");
        klant.setWoonplaats("Deventer");

        bestelBroodje();
    }

    public static void bestelBroodje() {

        Bezorger bezorger = null;

        // bekijk of er koks aanwezig zijn
        if (Personeel.getAantalKoks() > 0) {
            System.out.println("Aantal koks = " + Personeel.getAantalKoks());
            System.lineSeparator();
        } else {
            broodjeBestellenMislukt("Geen koks aanwezig");
        }

        // bekijk of er koks met een kookboek zijn
        boolean kookboekAanwezig = false;
        for (int i = 0; i < Personeel.getAantalKoks(); i++) {
            if (koks.get(i).heeftKookboek()) {
                String kok = koks.get(i).getNaam();
                kookboekAanwezig = true;
                System.out.println("Kok " + kok + " kookboek=" + koks.get(i).heeftKookboek());
                System.lineSeparator();
                break;
            }
        }

        // indien er geen koks met kookboek aanwezig zijn kan er niets bereid worden
        if (!kookboekAanwezig) {
            broodjeBestellenMislukt("Geen kok met Kookboek aanwezig");
        }

        // bekijk of er bezorgers aanwezig zijn
        if (Personeel.getAantalBezorgers() > 0) {
            System.out.println("Aantal bezorgers = " + Personeel.getAantalBezorgers());
            System.lineSeparator();
        } else {
            broodjeBestellenMislukt("Geen bezorgers aanwezig");
        }

        // bekijk of er bezorgers met een brommer zijn
        boolean brommerAanwezig = false;
        for (int i = 0; i < Personeel.getAantalBezorgers(); i++) {
            if (bezorgers.get(i).heeftEigenBrommer()) {
                bezorger = bezorgers.get(i);
                System.out.println("Bezorger " + bezorgers.get(i).getNaam() + " eigenbrommer=" + bezorgers.get(i).heeftEigenBrommer());
                brommerAanwezig = true;
                System.lineSeparator();
                System.lineSeparator();
                break;
            }
        }

        // indien er geen bezorgers met brommer aanwezig zijn kan er niets bezorgd worden
        if (!brommerAanwezig) {
            broodjeBestellenMislukt("Geen bezorger met brommer aanwezig");
        }

        // Laat een bezorger een broodje bij de klant bezorgen.
        bezorger.bezorgen(klant);

    }

    public static void broodjeBestellenMislukt(String reden) {
        System.out.println(reden);
        System.exit(0);
    }

}

