/*
                                        Exercice 1
- Ecrire une classe Vehicule définie par vehicType et vehicNom de type String dans laquelle on trouve
une classe interne moteur telle que à chaque véhicule est associé un moteur de type moteurType.
Le moteur est dit « Grand » si le type du véhicule auquel il est associé est « 4WD » et que son
nom est « Crysler », « Petit » sinon.

- Le nombre de portes d’un véhicule est égal au nombre de portes passager ainsi que le coffre.
Ecrire la classe interne statique Porte définie par portePassager et coffre et
une méthode getTotalPortes() qui retourne le nombre total de portes dans le véhicule.

- Qu’arrive-t-il si l’on essaie d’accéder à partir de getTotalPortes() à l’un des attributs de Véhicule ?
    On a une erreur car (très bonne question)

- Ecrire le programme principal qui permet de tester ces 3 classes.
 */

package com.victorine;

public class Vehicule{
    String vehicType;
    String vehicNom;

    public Vehicule(String nom, String type){
        this.vehicNom = nom;
        this.vehicType = type;
    }
    private String getVehicNom() {
        return this.vehicNom;
    }

    class Moteur {
        String moteurType;

        void setMoteur (){
            if (Vehicule.this.vehicType.equals("4WD")){
                if (Vehicule.this.getVehicNom().equals("Crysler")){
                    this.moteurType = "Grand";
                } else {
                    this.moteurType = "Petit";
                }
            } else {
                this.moteurType = "Grand";
            }
        }
        String getMoteurType(){
            return this.moteurType;
        }
    }
    static class Porte {
        int portePassager = 4;
        int coffre = 1;

        int getTotalPortes() {
            return portePassager+coffre;
        }
    }
    public static void main(String[]args){
        Vehicule voiture1 = new Vehicule ("Clio", "1WD");
        Vehicule.Moteur engine = voiture1.new Moteur ();
        engine.setMoteur();
        System.out.println("Moteur type for 1WD = " +engine.getMoteurType());

        Vehicule voiture2 = new Vehicule("Crysler", "4WD");
        Vehicule.Moteur engin2 = voiture2.new Moteur();
        engin2.setMoteur();
        System.out.println("Moteur type for 4WD = " +engine.getMoteurType());

        Vehicule.Porte door= new Vehicule.Porte();
        System.out.println("Number of doors is "+door.getTotalPortes());
    }
}

