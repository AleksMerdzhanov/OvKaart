package ov;

public class OVType {
    String naam;
    double kostenPerMinuut;

    // Dit maakt een type vervoer aan, zoals trein of bus
    public OVType(String naam, double kostenPerMinuut) {
        this.naam = naam;
        this.kostenPerMinuut = kostenPerMinuut;
    }

    // Hiermee krijg je hoeveel het kost per minuut
    public double getKostenPerMinuut() {
        return kostenPerMinuut;
    }
}
