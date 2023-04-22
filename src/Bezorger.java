class Bezorger extends Personeel {

    private final boolean eigenBrommer;

    Bezorger(String naam, String adres, String postcode, String woonplaats, int sofi, double salaris, boolean heeftEigenBrommer) {
        super(naam, adres, postcode, woonplaats, sofi, salaris);
        increaseAantalBezorgers();
        this.eigenBrommer = heeftEigenBrommer;
    }

    public boolean heeftEigenBrommer() {
        return eigenBrommer;
    }

    // Laat een bezorger een broodje bij de klant bezorgen.
    public void bezorgen(Klant klant) {
        System.out.println(this.getNaam() + " gaat een broodje bezorgen bij " + klant.getNaam() + " aan het volgende adres: " + klant.getAdresToString());
        klant.tevreden(klant.getNaam());
    }

}
