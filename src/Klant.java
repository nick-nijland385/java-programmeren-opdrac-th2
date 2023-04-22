class Klant extends Persoon {

    public Klant(String naam, String adres, String postcode, String woonplaats) {
        super(naam, adres, postcode, woonplaats);
    }

    public Klant() {
        super();
    }

    // Klant methode, die een tevreden tekst op het scherm zet
    public void tevreden(String klantNaam) {
        System.out.println(klantNaam + " zegt: Dank u, dit is een lekker broodje shoarma");
    }

}
