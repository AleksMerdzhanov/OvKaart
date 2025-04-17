package ov;

public class OVPaal {
    OVType type;

    // Dit maakt een OV-paal aan met een soort vervoer
    public OVPaal(OVType type) {
        this.type = type;
    }

    // Dit rekent uit hoeveel de reis kost op basis van de tijd in minuten
    public double berekenReisKosten(long duur) {
        return type.getKostenPerMinuut() * duur;
    }
}
