package com.cc.java;

public class bestellung  
{

    public static void main(String[] args) {
// Variablen deklarieren
        String food = "noch kein Burger gewählt";
        String drink = "noch kein Getränk gewählt";
        String itemNumStr;
        String flag;
           //System.out.println(food);
           //System.out.println(drink);
 // Bestelldialog 1 : Ausgabe
        System.out.println("-------------------------------");
        System.out.println("Herzlich Willkommen bei MD, Ihre Bestellung bitte!");
        System.out.println("Hamburger(1), Cheeseburger(2) oder Chilliburger(3) ?");

        // Bestelldialog 1 : Eingabe
        itemNumStr = System.console().readLine("Ihre Wahl? : ");
        // System.out.println(itemNumStr);  // 1 oder 2 oder 3


    }
    
}


