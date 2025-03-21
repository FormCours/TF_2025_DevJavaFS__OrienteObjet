import models.Car;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        System.out.println("Demo - Orienté objet");
        // Classe pour interagir avec des voitures.
        // Context / Object
        //  - Vente de voiture
        // Attributs :
        //  - Marque
        //  - Model
        //  - Kilometrage
        //  - Accidenté
        //  - Date de mise en circulation
        //  - Date du dernier entretien (Nullable ?)
        //  - Prix
        // Comportement :
        //  - Obtenir un recap
        //  - Obtenir l'age de voiture
        //  - Modifier la disponibilité

        // Création d'une instance de la classe "Car"
        Car car1 = new Car("VW", "Polo", 42_000, LocalDate.of(2024, 1, 13), 13_000.42);
        Car car2 = new Car("Renaut", "Megane", 94_001, LocalDate.of(2010, 1, 1), 500, null, true);

        System.out.println(car1.toString());
    }
}