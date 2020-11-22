/*
                            Exercice 1
Ecrire un programme prenant un nombre sur l'entrée standard et affichant celui-ci.
Pour cela, on utilisera un objet (une instance) de classe Scanner et particulièrement sa méthode nextInt().


import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        System.out.print("Enter a value: ");
        Scanner scanner = new Scanner(System.in);

        int value;
        value = scanner.nextInt();
        System.out.println(("Your value is = " + value));
    }
}
 */
/*
                            Exercice 2
Modifier le programme précédent afin qu’il lise au clavier une suite de nombres réels positifs ou nuls
(correspondant à des notes), terminée par la valeur -1, et calcule la moyenne olympique de ces valeurs,
c'est à dire la moyenne des notes sans prendre en compte la note la plus élevée ni la note la moins élevée.

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value, max, min;
        float somme = 0;
        int valueVal = 0;

        System.out.print("What is your note: ");
        value = scanner.nextInt();
        max = min = value ;

        while (value != -1){
            valueVal ++;

            if (value > max){
                max = value;
            }
            if (value< min){
                min = value;
            }
            somme = somme + value;
            System.out.print("What is your note: ");
            value = scanner.nextInt();
        }

        System.out.println("The maxiaml note is : " +max);
        System.out.println("The minimal note is : " +min);
        System.out.println("This values are been remove of  the calculus ");

        somme = somme - max - min;
        System.out.println("The somme is = " + somme/valueVal);
    }
}
*/


public class Ex1 {

}

