package Exercise1;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> basket = new ArrayList<>();
        basket.add("apple");
        basket.add("grape");
        basket.add("lemon");
        basket.add("lemon");
        basket.add("watermelon");

        //find(String):boolean - finds if received fruit is in the list and returns true/false
        System.out.println(basket.contains("apple"));
        System.out.println(basket.contains("banana"));

        //remove(String): boolean - removes the received string returns true/false if found
        System.out.println(basket.remove("apple"));
        System.out.println(basket.remove("apple")); //"apple" a fost deja sters, deci se returneaza valoarea false

        //position(String):int - returns the position on which the received fruit is in the basket
        System.out.println(basket.indexOf("grape")); //pentru ca "apple' a fost sters, grape e primul
        //element din lista, deci are indexul 0
        System.out.println(basket.indexOf("watermelon")); //"watermelon" e al patrulea element, deci are index 3

        //distinct():Collection<String> - returns an unique collection containing all fruits once
        HashSet<String> setUnic = new HashSet<>(basket);
        ArrayList<String> basketWithoutDuplicates = new ArrayList<>(setUnic);
        for (String s : basketWithoutDuplicates) {
            System.out.print(s + " ");
        }

        //add(String) - adds a fruit to the basket
        basket.add("kiwi");

        System.out.println(); // linie goala in consola

        //count():int - count the fruits
        System.out.println("The basket has " + basket.size() + " fruits.");

        //customCount():int - count the fruits without using size method (use a loop control statement + counter)
        int customCounter = 0;
        for (String i : basket) {
            customCounter++;
        }
        System.out.println(customCounter);

    }
}
