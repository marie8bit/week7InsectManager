package com.MarieErickson;

/**
 * Created by yd7581ku on 10/4/2016.
 */
//abstract superclass will not be used to instantiate an insect object
// only used for inheritance/requires all subclasses create abstract methods in superclass
public abstract class Insect
{
    private String name;
    private int numberOfWings;
    private static int numberOfLegs = 6;



    public Insect(String name, int numberOfWings)
    {
        this.setName(name);
        this.setNumberOfWings(numberOfWings);

    }

    public static int getNumberOfLegs()
    {
        return numberOfLegs;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getNumberOfWings()
    {
        return numberOfWings;
    }

    public void setNumberOfWings(int numberOfWings)
    {
        this.numberOfWings = numberOfWings;
    }
    public abstract String printSpeciesData();
//    {
//        String message = "A "+this.getName()+" has "+Insect.getNumberOfLegs()+"legs, "+
//                this.getNumberOfWings()+" wings";
//        return message;
//    }
}
