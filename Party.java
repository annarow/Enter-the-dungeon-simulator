
/**
 * Class Party holds the positions of all the characters about to
 * enter a dungeon.
 *
 * Anna Waldron
 * june 5, 2020
 */
public class Party
{
    private Character[] dungeon_party;//array of characters
    //Constructor that takes an integer for the number of characters
    //in the party.
    public Party(int num_of_characters)
    {
        if(num_of_characters <= 10){
            dungeon_party = new Character[num_of_characters];
        }
        else{
            System.out.println("Invalid number of characters.");
        }
    }
    //Void setter method that takes a character object that sets the
    //character in the party array depending on the characters position
    //and inserts at that index.Checks to see if spot is available.
    public void setPartyPosition(Character new_character)
    {
        int place_holder = new_character.getPosition();
        if(dungeon_party[place_holder] == null && 
            new_character.getPosition() == place_holder){
                dungeon_party[place_holder] = new_character;
        }
        else{
            System.out.println("Invalid position," +
            "character overlap.");
        }
    }
    //Getter method that returns the party array.
    public Character[] getParty()
    {
        return dungeon_party;
    }
    
}
