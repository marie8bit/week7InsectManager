package com.MarieErickson;

/**
 * Created by yd7581ku on 10/4/2016.
 */
//code to identify inheritance/
//identify subclass/superclass
public class Bee extends Insect
{

    private String bodyColor;
    private boolean makesHoney;
    private String favFlower;
    //bee subclass constructor that takes 5 arguments
    public Bee(String name, int numberOFWings, String bodyColor,
               String favFlower, boolean makesHoney)
    {
        //call superclass constructor
        super(name, numberOFWings);
        //add subclass specific members
        this.bodyColor = bodyColor;
        this.favFlower = favFlower;
        this.makesHoney = makesHoney;
    }

    public String getBodyColor()
    {
        return bodyColor;
    }

    //String makesHoneyString = this.makesHoney ? "does not make honey":"makes honey";

    public String getFavFlower()
    {
        return favFlower;
    }

    public String printSpeciesData()
    {
        //initialize string variable to return to method call
        String message;
        //ternary to make code more concise
            message= "A "+this.getName()+ " bee "+(this.makesHoney ? "makes honey":"does not make honey")
                    +", has "+ this.getNumberOfWings()+" wings, "+Insect.getNumberOfLegs()+" legs, it is "
                    + this.getBodyColor()+" and likes a plant called "+this.getFavFlower();

        return message;
    }
}


