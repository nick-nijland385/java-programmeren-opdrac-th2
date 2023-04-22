class Kok extends Personeel {

    private boolean kookboek;

    Kok(String naam, String adres, String postcode, String woonplaats, int sofi, double salaris, boolean kookboek) {
        super(naam, adres, postcode, woonplaats, sofi, salaris);
        super.increaseAantalKoks();
        this.kookboek = kookboek;
    }

    public boolean heeftKookboek() {
        return kookboek;
    }

}