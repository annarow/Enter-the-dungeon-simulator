
/**
 * Driver class that represents the character and party creation.
 *
 * Anna Waldron
 * June 5, 2020
 */
import java.util.Scanner;
public class Driver
{
    //Main method that takes user input and prints out a description 
    //of the program. Enters a while loop for character creation calling 
    //another method to create the character after creating a party
    //object. Then prints out the results by calling another method.
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int terminator = 1;
        String pos_taken = "";
        description();
        System.out.println("Enter the number of characters for"
            + " your party");
        System.out.println("(maximum of 10 characters).");
        int party_size = keyboard.nextInt();
        Party new_party = new Party(party_size);
        while(terminator <= party_size){
            System.out.println("Enter a name for your character: ");
            String name_given = keyboard.next();
            System.out.println("Enter the number corresponding to "+
            "the class");
            System.out.println("type for your character from the " +
            "options:\n" +
            "0 - Fighter\n 1 - Cleric\n 2 - Wizard\n 3 - Rogue\n" +
            "4 - Barbarian\n 5 - Sorcerer");
            int type = keyboard.nextInt();
            System.out.println("Enter the position of your character"
            + " in the party, with ");
            System.out.println("each character at a different" +
            " position (from 0 to " + (party_size - 1) + ").");
            System.out.println("Positions already taken: " + pos_taken);
            int pos = keyboard.nextInt();
            pos_taken += pos + " ";
            createCharacter(name_given, type, pos, new_party);
            System.out.println("Character completed.");
            terminator += 1;
        }
        printResults(new_party);
    }
    //Void method that prints out a description of the program.
    public static void description()
    {
        System.out.println("This program lets you create up to 10 " +
        "different ");
        System.out.println("characters to enter a dungeon in a party " +
        "order of your choice.");
        System.out.println("Create your characters, name them, and " +
        "strategically position");
        System.out.println("them to enter the dungeon depths (" +
        "to be implemented).");
        System.out.println("Attributes for each character will be " +
        "randomly ");
        System.out.println("generated based on the class type.");
        
    }
    //Void method that takes a string name, integer for class type,
    //integer for position in party, and a party object. Creates a 
    //character object with the given information.
    public static void createCharacter(String name_given, int class_num,
    int pos, Party given_party)
    {
        Character new_char = new Character(name_given);
        new_char.setClass(class_num);
        new_char.setPosition(pos);
        new_char.setAttributes();
        given_party.setPartyPosition(new_char);
    }
    //Void method that prints out information for each character in 
    //the party. Uses a nested for loop to do this.
    public static void printResults(Party party_given)
    {
        int current = 1;
        for(int i = 0; i < party_given.getParty().length; i++){
            System.out.println("Character " + current);
            System.out.println("Name: " + 
            party_given.getParty()[i].getName());
            System.out.println("Class: " + 
            party_given.getParty()[i].getClassType());
            for(int j = 0; j < 5; j++){
                if(j == 0){
                    System.out.println("STR: " + 
                    party_given.getParty()[i].getAttributes()[j]);
                }
                else if(j == 1){
                    System.out.println("DEX: " + 
                    party_given.getParty()[i].getAttributes()[j]);
                }
                else if(j == 2){
                    System.out.println("INT: " + 
                    party_given.getParty()[i].getAttributes()[j]);
                }
                else if(j == 3){
                    System.out.println("WIS: " + 
                    party_given.getParty()[i].getAttributes()[j]);
                }
                else if(j == 4){
                    System.out.println("CHAR: " + 
                    party_given.getParty()[i].getAttributes()[j] 
                    + "\n");
                }
            }
            current += 1;
        }
    }
}
