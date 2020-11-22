package com.victorine;
/*
                        Exercie 1
- Ecrire une classe Entreprise. Une entreprise a un nombre d’employés, un capital, un nom, une mission,
 et une méthode public String mission() qui renvoie la mission de l’entreprise et qui déclare le
 lancement de l’exception SecretMissionException. On aura également une méthode public int capital()
 qui renvoie le capital et qui déclare le lancement de l’exception NonProfitException.
 */

public class Entreprise {
    private Integer nb_employe;
    private Integer capital;
    private String nom;
    private String mission;

    public Entreprise(Integer nb_employe,Integer capital, String nom, String mission)
    {
        this.nb_employe = nb_employe;
        this.capital = capital;
        this.nom = nom;
        this.mission = mission;
    }

    public String getNom(){
        return this.nom;
    }

    public String mission() throws SecretMissionException {
        return this.mission ;
    }

    public int capital() throws NonProfitException{
        return this.capital;
    }

    public static class SecretMissionException extends Exception{
        // here, we set the exception of no mission
    }

    public static class NonProfitException extends Exception{
        // here, we set the exception of non profit
    }


    public static class EntrepriseSecrete extends Entreprise{
        public EntrepriseSecrete (int nb_employe, int capital, String nom) {
            super (nb_employe, capital, nom, null);
        }
        public String mission() throws SecretMissionException {
            throw new SecretMissionException();
        }
    }


    public static class EntrepriseSansProfit extends Entreprise{
        public EntrepriseSansProfit(int nb_employe, String nom, String mission) {
            super(nb_employe, null, nom, mission);
        }
        public int capital() throws NonProfitException{
            throw new NonProfitException();
        }
    }

    public static String PrintEntreprise(Entreprise[] tabE) {
        StringBuilder stringArray = new StringBuilder();

        for(int i= 0; i< tabE.length; i++){ // we go trougth the entire given array
            stringArray.append(tabE[i].getNom());

            try{
                stringArray.append(": "+tabE[i].mission()+" - ");
            }
            catch (SecretMissionException npe){
                stringArray.append(": No mission"); // if no mission we print this
            }
            try{
                stringArray.append(tabE[i].capital()+"M€ of capital\n");
            }
            catch(NonProfitException npe){
                stringArray.append(": No capital\n");// if no capital we print this
            }

        }
        return stringArray.toString(); // we tranform the array to a string

    }

    public static void main(String[] args){

        Entreprise entreprise1 = new Entreprise(100, 100, "Ford", "Sell Cars");
        Entreprise entreprise2 = new EntrepriseSecrete(200,200, "CIA");
        Entreprise entreprise3 = new Entreprise(300, 300, "Spectre", "cell musique tools");
        Entreprise entreprise4 = new EntrepriseSansProfit(400, "Croix rouge", "Caritative mission");
        Entreprise entreprise5 = new Entreprise(500, 500, "Microsoft", "Web blabla");
        Entreprise entreprise6 = new Entreprise(600,600, "Efrei", "school");

        Entreprise tabE[] = {entreprise1, entreprise2, entreprise3, entreprise4, entreprise5, entreprise6};

        System.out.println((PrintEntreprise(tabE)));
    }

}

