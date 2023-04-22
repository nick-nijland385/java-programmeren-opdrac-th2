Damascus Shoarma

Maak een project in Netbeans en noem dit project opdracht2.

De opdracht is het opzetten van een proefapplicatie voor een shoarmatent.

Maak de volgende abstracte class: Persoon

Maak de volgende classes: Personeel en Klant die zijn afgeleid van Persoon.

Maak de volgende classes: Kok en Bezorger die zijn afgeleid van Personeel.

Maak een testclass DamascusShoarma. DamascusShoarma is een demonstratie, met een main method.

Class inheritance is nog niet uitvoerig in de leerstof aan bod gekomen. Dat komt pas in het volgende hoofdonderwerp. U heeft class inheritance wel nodig in deze feedbackopdracht. Kijk daarom vast in het boek naar de paragrafen "Introducing class inheritance" (p. 234) en "Creating abstract classes" (p. 259), voordat u deze opdracht gaat maken.

De volgende begrippen worden gebruikt: abstract, static, this, super De volgende instance-variabelen/class variabelen komen voor in het programma:

String naam

String adres

String postcode

String woonplaats

boolean kookboek

int aantalKoks

boolean eigenBrommer

int aantalBezorgers

int sofinummer

double salaris

De volgende methods komen voor in het programma:

no-arg constructors en overloaded constructors voor alle instance variablen in een class

getter en setter methods voor alle non static instance variabelen

toString() om de gegevens van de class bezorger en kok in een string te zetten

tevreden() [klant methode, die een tevreden tekst op het scherm zet]

getAantalKoks() [Geeft het totaal aantal koks terug]

getAantalBezorgers() [geeft het totaal aantal bezorgers terug]

bezorgen(Klant a)

Eisen DamascusShoarma class:

Bevat twee koks en twee bezorgers, met compleet verzonnen naw-gegevens.

Bevat een klant met verzonnen naw-gegevens.

Laat zien dat het aantal bezorgers en koks correct door de applicatie worden geteld, met een print op het scherm. Gebruik daarvoor een static variabele.

Laat een bezorger een broodje bij de klant bezorgen.

Zet de gegevens van kok, bezorger en klant in de output.

De output ziet er ongeveer zo uit:

aantal koks = 2

Kok{Jan de Vries kookboek=true}

aantal bezorgers = 2

Bezorger{Ali Baba eigenbrommer=false}

Piet Hein zegt: Dank u, dit is een lekker broodje shoarma

De package-directory met daarin de Java-bestanden dient te worden gezipt, zodat deze kan worden ingestuurd.

Voor deze programmeeropdracht zijn in totaal 80 punten te behalen