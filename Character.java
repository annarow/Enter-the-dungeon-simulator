
/**
 * Class Character holds all the info for each character, including
 * their name, attributes, class type and position in the party
 * line.
 *
 * Anna Waldron
 * June 5, 2020
 */
import java.util.Random;
import java.lang.Math;

public class Character
{
    // instance variables - replace the example below with your own
    private String name;//ask for name
    private String class_type;//ask for type
    private  int[] attributes;//randomly set attributes by class range
    private int position;//ask for position
    //constructor with name parameter
    public Character(String name_given)
    {
        position = -1;
        attributes = new int[5];
        name = name_given;
    }
    //Void setter method that sets the attributes of a character randomly,
    //but is scaled differently for each class.
    public void setAttributes()
    {
        Random rand = new Random();
        if(class_type.equals("Fighter")){
            attributes[0] = rand.nextInt(7) + 14;
            attributes[1] = rand.nextInt(7) + 9;
            attributes[2] = rand.nextInt(10) + 5;
            attributes[3] = rand.nextInt(10) + 5;
            attributes[4] = rand.nextInt(11) + 6;
        }
        else if(class_type.equals("Cleric")){
            attributes[0] = rand.nextInt(7) + 9;
            attributes[1] = rand.nextInt(10) + 5;
            attributes[2] = rand.nextInt(10) + 5;
            attributes[3] = rand.nextInt(7) + 14;
            attributes[4] = rand.nextInt(11) + 6;
        }
        else if(class_type.equals("Wizard")){
            attributes[0] = rand.nextInt(10) + 5;
            attributes[1] = rand.nextInt(7) + 9;
            attributes[2] = rand.nextInt(7) + 14;
            attributes[3] = rand.nextInt(11) + 6;
            attributes[4] = rand.nextInt(10) + 5;
        }
        else if(class_type.equals("Rogue")){
            attributes[0] = rand.nextInt(7) + 9;
            attributes[1] = rand.nextInt(7) + 14;
            attributes[2] = rand.nextInt(11) + 6;
            attributes[3] = rand.nextInt(10) + 5;
            attributes[4] = rand.nextInt(10) + 5;
        }
        else if(class_type.equals("Barbarian")){
            attributes[0] = rand.nextInt(7) + 14;
            attributes[1] = rand.nextInt(7) + 9;
            attributes[2] = rand.nextInt(10) + 5;
            attributes[3] = rand.nextInt(11) + 6;
            attributes[4] = rand.nextInt(10) + 5;
        }
        else if(class_type.equals("Sorcerer")){
            attributes[0] = rand.nextInt(11) + 6;
            attributes[1] = rand.nextInt(7) + 9;
            attributes[2] = rand.nextInt(10) + 5;
            attributes[3] = rand.nextInt(10) + 5;
            attributes[4] = rand.nextInt(7) + 14;
        }
    }
    //Void setter method that takes and integer for the position of the 
    //character in the line. 
    public void setPosition(int pos)
    {
        if(pos < 10){
            position = pos;
        }
        else{
            System.out.println("Invalid input.");
        }
    }
    //Void setter method which takes an integer for the class number
    //and assigns the corresponding string to the private varible class
    //type.
    public void setClass(int class_number)
    {
        if(class_number == 0){
            class_type = "Fighter";
        }
        else if(class_number == 1){
            class_type = "Cleric";
        }
        else if(class_number == 2){
            class_type = "Wizard";
        }
        else if(class_number == 3){
            class_type = "Rogue";
        }
        else if(class_number == 4){
            class_type = "Barbarian";
        }
        else if(class_number == 5){
            class_type = "Sorcerer";
        }
        else{
            System.out.println("Invalid input.");
        }
    }
    //Getter method that returns the position.
    public int getPosition()
    {
        return position;
    }
    //Getter method that returns the array of attributes.
    public int[] getAttributes()
    {
        return attributes;
    }
    //Getter method that returns a string for the class type.
    public String getClassType()
    {
        return class_type;
    }
    //Getter method that returns the string name.
    public String getName()
    {
        return name;
    }
        
}
