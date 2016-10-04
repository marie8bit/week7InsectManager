package com.MarieErickson;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LinkedList<Insect> insects = new LinkedList<Insect>();
        Butterfly monarch= new Butterfly("Monarch", 4, "orange and black", "Milkweed");
        insects.add(monarch);
        Butterfly comYellSwa = new Butterfly("Common Yellow Swallowtail", 4, "yellow and black",
                "Milk Parsley");
        insects.add(comYellSwa);
        Bee honey = new Bee("Honey", 4,"black and yellow", "Jasmine", true);
        insects.add(honey);
        Bee bumble = new Bee("Bumble", 4, "yellow, black and white","Clover", false);
        insects.add(bumble);

        //Create and add some Butterfly and Bee objects to the list
        for (Insect i : insects) {
            System.out.println(i.printSpeciesData());
        }

    }

}
