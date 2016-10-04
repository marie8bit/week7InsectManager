package com.MarieErickson;

/**
 * Created by yd7581ku on 10/4/2016.
 */
//basic class coding
public class Butterfly extends Insect
{

    private String wingColor;
    private String favFlower;
    public Butterfly (String name, int numberOFWings, String wingColor, String favFlower)
    {
        super(name, numberOFWings);
        this.favFlower = favFlower;
        this.wingColor = wingColor;
    }
    public String getWingColor()
    {
        return wingColor;
    }

    public void setWingColor(String wingColor)
    {
        this.wingColor = wingColor;
    }

    public String getFavFlower()
    {
        return favFlower;
    }

    public void setFavFlower(String favFlower)
    {
        this.favFlower = favFlower;
    }
    public String printSpeciesData()
    {
        String message = "A "+this.getName()+" butterfly has "+Insect.getNumberOfLegs()+" legs, "+
                this.getNumberOfWings()+" wings, it is "+this.getWingColor()+
                ", and likes a plant called "+this.getFavFlower();
        return message;
    }

}


