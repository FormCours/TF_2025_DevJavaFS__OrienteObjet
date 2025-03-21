package models;

import java.util.Date;

public class Car {

    // Attribut
    public String brand;
    public String model;
    public Integer kilometers;
    public boolean isCrash;
    public Date registrationDate;
    public Date lastServiceDate;
    public double price;
    public String availability = "NOPE"; //TODO Replace by Enum 😲

    // Comportement (Méthode)
    //  - Fonction -> Execute des codes pour renvoyer un resultat
    //  - Procedure -> Excute du codes dans un but (pas de retour)

    public String getRecap() {
        // Traitement
        String resume = brand + " " + model + " - " + kilometers + "km (" + price + " €)";
        // Retour de la valeur
        return resume;
    }

    public int getAge() {
        throw new RuntimeException("Not implemented !!!");
    }

    public void reserve() {
        availability= "RESERVE";
    }

    public void makeAvailable() {
        availability = "YES";
    }
}