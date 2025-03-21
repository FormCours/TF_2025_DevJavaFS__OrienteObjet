package models;

import java.time.LocalDate;

public class Car {

    // region Attribut
    private String brand;
    private String model;
    private Integer kilometers;
    private boolean crash;
    private LocalDate registrationDate;
    private LocalDate lastServiceDate;
    private double price;
    private String availability; //TODO Replace by Enum 😲
    // endregion

    // region Constructeur
    public Car(String brand, String model, Integer kilometers, LocalDate registrationDate, double salePrice) {
        this.setBrand(brand);
        this.setModel(model);
        this.setKilometers(kilometers);
        this.setRegistrationDate(registrationDate);
        this.setLastServiceDate(null);

        setPrice(salePrice);
        crash = false;
        availability = "NOPE";
    }

    public Car(String brand, String model, Integer kilometers, LocalDate registrationDate, double salePrice, LocalDate lastServiceDate, boolean crash) {
        // Appel au constructeur (Toujours la premiere operation !!!)
        this(brand, model, kilometers, registrationDate, salePrice);

        this.setLastServiceDate(lastServiceDate);
        this.crash = crash;
    }
    // endregion

    // region Encapsulation
    // - Getters (Accesseurs)
    public String getBrand() {
        return this.brand.toUpperCase();
    }

    public String getModel() {
        return this.model;
    }

    public Integer getKilometers() {
        return this.kilometers;
    }

    public boolean isCrash() {
        return this.crash;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public LocalDate getLastServiceDate() {
        return lastServiceDate;
    }

    public double getPrice() {
        return this.price;
    }

    public String getAvailability() {
        return this.availability;
    }

    public boolean isAvailabe() {
        return this.availability.equals("YES");
    }

    // - Setters (Mutateurs)
    public void setBrand(String value) {
        if (value.trim().isEmpty()) {
            throw new RuntimeException("Boulet, il faut mettre une marque !!! Bisous");
        }
        this.brand = value;
    }

    public void setModel(String value) {
        this.model = value;
    }

    public void setKilometers(int value) {
        if (value < 0) {
            throw new RuntimeException("La valeur du kilometrage doit être positif.");
        }
        this.kilometers = value; // Boxing (int -> Interger)
    }

    public void setRegistrationDate(LocalDate value) {
        if (value.isAfter(LocalDate.now())) {
            throw new RuntimeException("Les machines a voyager dans le temps ne sont pas autorisé");
        }
        this.registrationDate = value;
    }

    public void setLastServiceDate(LocalDate value) {
        if (value != null && value.isAfter(LocalDate.now())) {
            throw new RuntimeException("Les machines a voyager dans le temps ne sont pas autorisé");
        }
        if (value != null && value.isBefore(this.getRegistrationDate())) {
            throw new RuntimeException("Un entretien ne peut pas être réaliser avant la mise en circulation !");
        }

        this.lastServiceDate = value;
    }

    public void setPrice(double value) {
        if (value <= 0) {
            throw new RuntimeException("Le prix ne peut pas être negatif !");
        }
        this.price = Math.round(value * 100) / 100.0;
    }
    // endregion

    // region Comportement (Méthode)
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
        availability = "RESERVE";
    }

    public void makeAvailable() {
        availability = "YES";
    }

    public void hasCrash() {
        this.crash = true;
    }
    // endregion
}