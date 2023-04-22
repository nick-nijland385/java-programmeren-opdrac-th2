class Personeel extends Persoon {
    private int sofinummer;
    private double salaris;
    private static int aantalKoks;
    private static int aantalBezorgers;

    Personeel(String naam, String adres, String postcode, String woonplaats, int sofi, double salaris) {
        super(naam, adres, postcode, woonplaats);
        this.sofinummer = sofi;
        this.salaris = salaris;
    }

    public static int getAantalKoks() {
        return aantalKoks;
    }

    public static void increaseAantalKoks() {
        aantalKoks++;
    }

    public static int getAantalBezorgers() {
        return aantalBezorgers;
    }

    public static void increaseAantalBezorgers() {
        aantalBezorgers++;
    }

    public double getSalaris() {
        return salaris;
    }

    public int getSofiNummer() {
        return sofinummer;
    }

}
