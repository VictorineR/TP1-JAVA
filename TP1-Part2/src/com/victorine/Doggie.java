package com.victorine;

public class Doggie {
    String name;
    int fleasNumber;

    public Doggie(String n, int np){
        if(n == null || np < 0 ){
            throw new IllegalArgumentException();
        }
        this.name = n;
        this.fleasNumber = np;
    }

    public static void main(String[] args) {
        try{
            Doggie d1 = new Doggie("Milou", 4);
            System.out.println("d1 marche");
        }
        catch (IllegalArgumentException e){
            System.out.println("d1 ne marche pas ...");
        }
        try{
            Doggie d2 = new Doggie("Medor", -11);
            System.out.println("d3 marche");
        }
        catch (IllegalArgumentException e){
            System.out.println("d2 ne marche pas ...");
        }


    }
}


