/*
Problem 1:
Create a class called InsectManager. This class should have a main module and will be used to create Insect objects, and test your Insect classes (and subclasses, which you’ll create in a moment).
And, create a class called Insect. This will represent a generic insect species. We’ll specialize it with subclasses soon.
For the Insect class, please add 3 variables:
•	A String to store the insect’s name
•	An int to store the number of wings
•	A constant to store the number of legs, and set it to 6.
Will these be public, private, or protected?
Add get and set methods for the first 2 variables. What will you do with the constant? Make it public, or add a get method?
Next, create another new class called Butterfly. Butterfly needs to extend Insect. Butterfly needs two methods
•	A String to store the butterfly’s wing color
•	A String to store the butterfly’s favorite flower
Will these be public, private, or protected? Add get and set methods for these variables.
Also, please add a constructor that takes 4 arguments – the butterfly’s name, wing color, number of wings, and favorite flower.
Also, add a method to the Butterfly class called printSpeciesData. This method should print all the info for a Butterfly object – it’s name, wing color, number of wings, number of legs, and favorite flower.
Test your Butterfly class by writing code in the InsectManager class to create some test Butterfly object. Create two Butterfly objects, and then call the printButterflyData method on each to display all the data for each of the Butterfly objects.
Suggestions: A Monarch butterfly has 6 legs, 4 wings, it is orange and black, and likes a plant called milkweed.
A Common Yellow Swallowtail butterfly has 6 legs, 4 wings, it is yellow and black, and likes a plant called milk parsley.
Next, create another subclass of Insect.  This class should be called Bee. A Bee is a Bee, and a Bee is also an Insect.
Bee needs to have three variables:
•	A String for the bee’s color
•	A boolean for whether this species of bee makes honey (not all bees do)
•	A String for this bee’s favorite flower
Bee also needs a constructor to set all the variables a Bee object has. And, bee needs a method called printSpeciesData() that prints out all of the data for a Bee species. This method has the same name as the Butterfly method, but prints out the Bee information. As it prints out the information, it should print “This bee does make honey” or “this bee does not make honey” instead of “true” or “false”.
Test your Bee class by writing code in the InsectManager class to create some test Bee object. Create two Bee objects, and then call the printSpeciesData method on each to display all the data for each of the Bee objects.
Suggestions: name = “Honey bee”, color = “yellow and black”, makes honey = true, favorite flower = “Jasmine”, number of wings = 4
Name= “Bumble bee”, color = “yellow, black and white”, makes honey = False, favorite flower = “clover”, number of wings = 4
Last task: Create a LinkedList of Insects (recommended: use Generic types to require that the list can only contain Insect objects).  Add all of your Bee and Butterfly objects to this list.
Use a for each loop to iterate over your list and call printSpeciesData for each Insect.
	LinkedList<Insect> insects = new LinkedList<Insect>();
	//Create and add some Butterfly and Bee objects to the list
	for (Insect i : insects) {
		i.printSpeciesData();}
Unfortunately, this doesn’t work. The insect class does not have a method called printSpeciesData. While Bee and Butterfly both do, there is nothing to guarantee you won’t add an Insect object to this LinkedList, and Insect does not have this method. So the compiler complains.
To fix, please add this code to Insect class
public abstract void printSpeciesData();
And change the first line of the class from
public class Insect {   //class definition follows
To
public abstract class Insect {  //your class definition here
Now your code should work.
“Abstract”, for the method, means that all Insect objects will have a method called printSpeciesData. But Insect doesn’t want to define exactly what printSpeciesData does, and Insect doesn’t need to implement it.  This is useful if you will never instantiate your superclass, if it doesn’t make sense to make objects from the superclass. In this program, it doesn’t make sense to make Insect objects, it’s only useful to make the Butterfly and Bee subclasses. But, you want every insect to have printSpeciesData. So declare it as Abstract in Insect, and the compiler will make sure all subclasses of Insect will create a printSpeciesData method.
You also need to change the class to an Abstract class. You can never make objects from an abstract class. After all, you haven’t written all the method definitions it needs.
This is useful in any scenario where you have a general description class, and then specialize it with many subclasses; and only the subclasses will be useful in your program. You can now specify more required behavior in the (abstract) superclass and enforce that the subclasses will be able to have this behavior too... helps with polymorphism.
Notice that printSpeciesData should call the method of that name for the correct type of insect – this is polymorphism! So it should call printSpeciesData from the Butterfly class if the Insect object in the list is a Butterfly, and it will call the printSpeciesData from the Bee class if the Insect object in the list is a Bee.
This example uses generic types to make the LinkedList only able to store Insect objects. Please see the Data Types lab for more information and examples on generic types.
 */
package com.MarieErickson;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	// initialize linked list to contain list of insect subclass objects
        LinkedList<Insect> insects = new LinkedList<Insect>();
        //create butterfly subclass object instance
        Butterfly monarch= new Butterfly("Monarch", 4, "orange and black", "Milkweed");
        //add object to linked list
        insects.add(monarch);
        Butterfly comYellSwa = new Butterfly("Common Yellow Swallowtail", 4, "yellow and black",
                "Milk Parsley");
        insects.add(comYellSwa);
        //create bee subclass object instance
        Bee honey = new Bee("Honey", 4,"black and yellow", "Jasmine", true);
        insects.add(honey);
        Bee bumble = new Bee("Bumble", 4, "yellow, black and white","Clover", false);
        insects.add(bumble);

        //Print out information about each insect object in teh linked list
        for (Insect i : insects) {
            System.out.println(i.printSpeciesData());
        }

    }

}
