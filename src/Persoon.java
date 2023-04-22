
abstract class Persoon {

    private String naam;
    private String adres;
    private String postcode;
    private String woonplaats;

    public Persoon(String naam, String adres, String postcode, String woonplaats) {
        this.naam = naam;
        this.adres = adres;
        this.postcode = postcode;
        this.woonplaats = woonplaats;
    }

    public Persoon() {

    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setWoonplaats(String woonplaats) {
        this.woonplaats = woonplaats;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getAdres() {
        return adres;
    }

    public String getPostcode() {
        return postcode;
    }

    public String getWoonplaats() {
        return woonplaats;
    }

    public String getAdresToString() {
        return adres + " " + postcode + ", " + woonplaats ;
    }

}
