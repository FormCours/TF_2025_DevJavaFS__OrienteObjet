package models;

import java.time.LocalDate;

public class Car {

    // Attribut
    public String brand;
    public String model;
    public Integer kilometers;
    public boolean isCrash;
    public LocalDate registrationDate;
    public LocalDate lastServiceDate;
    public double price;
    public String availability; //TODO Replace by Enum 😲

    // Constructeur
    public Car(String brand, String model, Integer kilometers, LocalDate registrationDate, double salePrice) {
        this.brand = brand;
        this.model = model;
        this.kilometers = kilometers;
        this.registrationDate= registrationDate;
        this.lastServiceDate = null;

        price = salePrice;
        isCrash = false;
        availability = "NOPE";
    }

    public Car(String brand, String model, Integer kilometers, LocalDate registrationDate, double salePrice, LocalDate lastServiceDate, boolean isCrash) {
        // Appel au constructeur
        this(brand, model, kilometers, registrationDate, salePrice);

        this.lastServiceDate = lastServiceDate;
        this.isCrash = isCrash;
    }



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