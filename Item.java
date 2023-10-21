/**
 * The item class allows for the addition of items and objects
 * to be placed in various rooms for the player. Items/objects 
 * contain a description and a weight.
 *
 * @author Joshua Klenk
 * @version 10.21.23
 */
public class Item
{
    // instance variables - replace the example below with your own
    private int itemWeight;
    private String itemName;

    /**
     * Constructs an item
     * 
     * @param weight - the weight of an item.
     * @param name - the name of an object.
     */
    public Item()
    {
        itemWeight = 0;
        itemName = "";
    }
    
    /**
     * Counstructs an item with which sets
     * the instance variable to the passed in
     * parameters
     * 
     * @param weight - the weight of an item.
     * @param name - the name of an object.
     */
    public Item(String name, int weight)
    {
        itemName = name;
        itemWeight = weight;
    }
    
    /**
     * Returns the description and weight of an item contained in a room.
     * 
     * @return A description of the item & weight.
     */
    public String getItemInfo()
    {
        String itemString = "Item Description: " + this.itemName + "\n"
                                + "Item Weight: " + this.itemWeight;
        return itemString;
    }
}
