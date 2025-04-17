package ov;

import java.util.Scanner;

public class OV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Maak een object voor het OV-type (bijvoorbeeld Trein)
        OVType trein = new OVType("Trein", 0.20); 

        // Maak een OV-kaart aan met saldo van 2 euro
        OVKaart ov = new OVKaart("OV123", 2.00);

        // Maak een bankkaart aan met saldo van 10 euro
        BankKaart bank = new BankKaart("BANK456", 10.00);

        // Maak een OV-paal aan voor het type 'Trein'
        OVPaal paal = new OVPaal(trein);

     
        System.out.print("Hoeveel wil je overzetten van de bankkaart naar de OV-kaart? €");
        double overTeZetten = scanner.nextDouble();

        // Controleer of het kan, en voer het uit
        if (bank.getSaldo() >= overTeZetten) {
            bank.setSaldo(bank.getSaldo() - overTeZetten);
            ov.setSaldo(ov.getSaldo() + overTeZetten);
            System.out.println("€" + overTeZetten + " overgezet naar de OV-kaart.");
        } else {
            System.out.println("Niet genoeg saldo op de bankkaart om dit bedrag over te zetten.");
        }

        // Check in bij de OV-kaart
        ov.checkIn();

        // Stel dat de reis 10 minuten duurt
        long duurReis = 10;
        double kosten = paal.berekenReisKosten(duurReis);
        System.out.println("De reis duurt " + duurReis + " minuten en de kosten zijn: €" + kosten);

        // Check uit bij de OV-paal
        if (ov.getSaldo() >= kosten) {
            ov.checkOut(paal);
        } else {
            System.out.println("Niet genoeg saldo voor de reis.");
        }

        scanner.close();
    }
}
