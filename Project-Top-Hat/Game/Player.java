import java.util.*;
public class Player{
    public static final String[] phases = {"waiting","moving","selection"};
    private int currentphase;
    private int money,index;
    private int location;
    private String token;
    private Displayer displayer;
    private ArrayList<Integer> properties;//int array because properties will be associated with a number.

    //Constructors
    
    /**
     *Default constructor (only constructor). Initializes a player with starting money and intilizies the empty properties list. 
     */
    public Player(String token,int ind){
	currentphase = 0;
	money = 1500;
	location = 0;
	this.token = token;
	properties = new ArrayList<Integer>();
	this.index = ind;
    }

    //Accessor methods
    public int getIndex(){
	return index;
    }

    
    public int getPhase(){
	return currentphase;
    }

    public Displayer getDisplayer(){
	return displayer;
    }
    
    /**Use this to figure out how much money this player has.
     *@return returns the amount of money.
     */
    public int getMoney(){
	return money;
    }

    /**Use this if you want to figure out all the properties that this player owns.
     *@return Returns an Arraylist of property IDs
     */
    public ArrayList<Integer> getProperties(){
	return properties;
    }

    /**Use this to get the token of the player.
     *@return a String with the token's name
     */
    public String getToken(){
	return token;
    }

    /**Use this to get the ID number of the Slot that the Player is currently on.
     *@return an int that represents the int.
     */
    public int getLocation(){
	return location;
    }
    
    //Mutator methods

    public void setDisplayer(Displayer x){
	displayer =x;
    }
    
    /**Use this if you want to add or subtract some amount of money from this person's possession.
     *@param money amount
     */
    public void changeMoney(int income){
	money = money + income;
    }

    /**Use this to change the location of the player
     *@param the new location.
     */
    public void changeLocation(int newL){
	location = newL;
    }

    /**Use this if you want to add a property to this player's ownership.
     *@param property's ID number
     */
    public void addProperty(int ID){
	properties.add(ID);
    }

    /**Use this if you want to remove a property from this player's ownership.
     *@param property's ID number
     */
    public void removeProperty(int ID){
	properties.remove(ID);
    }

    public void setPhase(int x){
	currentphase = x;
    }

    //Other methods

    /**Use this to check if player is bankrupt or not.
     *@return returns a boolean.
     */
    public boolean checkBankruptcy(){
	return money <= 0;
    }

    /**
     *Use this to bankrupt the player (or the player forfeits).
     */
    public void declareBankrupt(){
	money = 0;
    }
    
    public String toString(){
	return token;
    }
    
    
    
    
}
