package ov;

public class BankKaart {
    String kaartNummer;
    double credits;

    // Dit maakt een bankkaart aan met nummer en saldo
    public BankKaart(String kaartNummer, double credits) {
        this.kaartNummer = kaartNummer;
        this.credits = credits;
    }

    // Dit haalt het saldo op van de bankkaart
    public double getSaldo() {
        return credits;
    }

    // Dit zet het saldo van de bankkaart naar een nieuw bedrag
    public void setSaldo(double nieuwSaldo) {
        this.credits = nieuwSaldo;
    }
}
