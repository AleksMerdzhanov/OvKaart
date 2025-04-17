package ov;

public class OVKaart {
    String kaartNummer;
    double saldo;
    long incheckTijd = -1; // Tijd van inchecken

    // Dit maakt de OV-kaart met nummer en hoeveel geld erop staat
    public OVKaart(String kaartNummer, double saldo) {
        this.kaartNummer = kaartNummer;
        this.saldo = saldo;
    }

    // Hiermee check je in
    public void checkIn() {
        incheckTijd = System.currentTimeMillis(); // Tijd van inchecken wordt opgeslagen
        System.out.println("U bent ingecheckt met kaart: " + kaartNummer);
    }

    // Hiermee check je uit en wordt geld eraf gehaald
    public void checkOut(OVPaal paal) {
        if (incheckTijd == -1) {
            System.out.println("U bent niet ingecheckt!");
            return;
        }

        long nu = System.currentTimeMillis();
        long duur = (nu - incheckTijd) / 60000; // Hoelang je hebt gereisd in minuten
        double kosten = paal.berekenReisKosten(duur); // Kosten berekenen

        if (saldo >= kosten) {
            saldo -= kosten; // Geld eraf halen
            System.out.println("Reis klaar. Kosten: €" + kosten);
            System.out.println("Nieuw saldo: €" + saldo);
        } else {
            System.out.println("Niet genoeg saldo. Kosten waren: €" + kosten);
        }

        incheckTijd = -1; // Klaar om weer opnieuw in te checken
    }

    // Geld toevoegen op de kaart
    public void addSaldo(double bedrag) {
        saldo += bedrag;
    }

    // Laat zien hoeveel geld erop staat
    public double getSaldo() {
        return saldo;
    }

    // Zet het saldo handmatig 
    public void setSaldo(double nieuwSaldo) {
        this.saldo = nieuwSaldo;
    }
}
