package com.MarieErickson;

/**
 * Created by yd7581ku on 10/4/2016.
 */
public class Bee extends Insect
{
    private String bodyColor;
    private boolean makesHoney;
    private String favFlower;

    public Bee(String name, int numberOFWings, String bodyColor,
               String favFlower, boolean makesHoney)
    {
        super(name, numberOFWings);
        this.bodyColor = bodyColor;
        this.favFlower = favFlower;
        this.makesHoney = makesHoney;
    }

    public String getBodyColor()
    {
        return bodyColor;
    }

    public boolean isMakesHoney()
    {
        return makesHoney;
    }

    public String getFavFlower()
    {
        return favFlower;
    }

    public String printSpeciesData()
    {
        String message;
        if (!this.makesHoney)
        {
            message= "A "+this.getName()+ " bee does not make honey, has "+
                    this.getNumberOfWings()+" wings, "+Insect.getNumberOfLegs()+" legs, it is "
            + this.getBodyColor()+" and likes a plant called "+this.getFavFlower();
        } else
        {
            message = "A "+this.getName()+ " bee makes honey, has "+
                    this.getNumberOfWings()+" wings, "+Insect.getNumberOfLegs()+" legs, it is "
                    + this.getBodyColor()+" and likes a plant called "+this.getFavFlower();
        }
        return message;
    }
}


