/**
 *  This class is the main class of the "World of Zuul" application. 
 *  "World of Zuul" is a very simple, text based adventure game.  Users 
 *  can walk around some scenery. That's all. It should really be extended 
 *  to make it more interesting!
 * 
 *  To play this game, create an instance of this class and call the "play"
 *  method.
 * 
 *  This main class creates and initialises all the others: it creates all
 *  rooms, creates the parser and starts the game.  It also evaluates and
 *  executes the commands that the parser returns.
 * 
 * @author  Joshua Klenk
 * @version 10.21.23
 */

public class Game 
{
    private Parser parser;
    private Room currentRoom;
        
    /**
     * Create the game and initialise its internal map.
     */
    public Game() 
    {
        createRooms();
        parser = new Parser();
    }

    /**
     * Create all the rooms and link their exits together.
     * 
     * Add an item to each room
     */
    private void createRooms()
    {
        Room outside, theater, pub, lab, office, basement, cavern, dungeon, library,
            observatory,park,infirmary, gym, lockerRoom, boatHouse, greenHouse, clockTower,
            entranceHall, librarySecondFloor;
    
        //create items to put in the rooms
        Item outsideItem[] = {new Item("A rouge turtle to keep as a companion.", 2),
                                new Item("A fully grown succulent",1),
                                    new Item("A whimsical duck wearing a top hat.", 12)};
        
        Item theaterItem[] = {new Item("A mask to hide ones identity", 1)};
        
        Item pubItem[] = {new Item("A half eaten sandwich", 2),
                            new Item("A full pint of butterbeer",1),
                                new Item("A wheel of cheese",4)};
        
        Item labItem[] = {new Item("A skelton key",1),
                            new Item("Med Pack", 12),
                                new Item("Misc. cables",2)};
        
        Item officeItem[] = {new Item("A golden stapler",5), 
                                new Item("A laptop", 25)};
        
        Item basementItem[] = {new Item("A frayed piece of rope",1),
                                new Item("A bucket filled with a mysterious liquid", 3)};
        
        Item cavernItem[] = {new Item("Pile of rocks", 5),
                                new Item("Empty beer can",1),
                                    new Item("Assortment of bones",45)};
        
        Item dungeonItem [] = {new Item("A dull sword",18),
                                new Item("Small elixir vial",2)};
        
        Item libraryItem[] = {new Item("The Fulcrum",3),
                                new Item("A monocle",1)};
        
        Item observatoryItem[] = {new Item("Telescope",600),
                                    new Item("Copy of Astronomy for Dummies", 4),
                                        new Item("Telescope lenses",2)};
        
        Item parkItem[] = {new Item("A bumpy TOAD!!!!!",1),
                                new Item("Bench",500),};
        
        Item infirmaryItem[] = {new Item("Needles",1),
                                    new Item("Bandages",1)};
        
        Item gymItem[] = {new Item("Dumbbell",10),
                            new Item("Sweat rag", 1),
                                new Item("Weight plate",45)};
        
        Item lockerRoomItem[] = {new Item("Soggy towel",1),
                                    new Item("Dirty socks",1)};
        
        Item boatHouseItem[] = {new Item("Oar",5)};
        
        Item greenHouseItem[] = {new Item("Shears",3),
                                    new Item("Cracked watering can",2),
                                        new Item("Fertilizer",5)};
      
        Item clockTowerItem[] = {new Item("Bolts",3),
                                    new Item("Black cat companion",8),
                                        new Item("Cape",1)};
        
        Item entranceHallItem[] = {new Item("Welcome pamphelt",1),
                                    new Item("Pen", 1)};
        
        Item librarySecondFloorItem[] = {new Item("Candle",2),
                                            new Item("Matches",1),
                                                new Item("Robe",1)};
        
        // create the rooms
        outside = new Room("outside in the court yard you see the main entrance of the university." 
                            + "\nTo the North you see the Entrance hall."
                            + "\nTo your East you see a bustling pub."
                            + "\nTo your West you see a colossal clock tower"
                            + "\nTo your south you see the Universities gym.");
                            
        theater = new Room("in the bustling campus theater there is a screening of Night of the Living Dead"
                            + "\nEveryone is dressed in their best zombie outfits."
                            +" \nThrough the North window you spot the local pub from the the orange hue in the distance."); 
                            
        pub = new Room(" walking up to the pub....leaves crackle under your feet."
                            + "\nA cool breeze passes"
                            + "\nAs you open the door the smell of cider is in the air."
                            + "\nYou are at ease with the calming warm precence of other students." 
                            + "\nYou're now in the pub." 
                            + "\nTo the North you see the ominous green hue of what looks like a green house.");
                                
        lab = new Room(" walking downstairs from the observatory and enter the university state of the art computer lab." 
                            + "\nTo the West you see the office space for the Science & Tech department");
                        
        office = new Room("in the Science & Tech office. \nYou see the Professors debating on whether the Star Wars"
                            + " sequel trilogy is even apart of the franchise.");
        
        basement = new Room("in the basement of the clock tower." 
                            +"\nOff in the distance you see a hatch in the floor."
                            + "\nDo you go down or back the way you came?");
                            
        cavern = new Room("entering a the hatch in the floor where you find a secret cavern." 
                            +"\nOff in the distance you hear an ominous growling." 
                            + "\nDo you continue down further or retreat back up?");
                            
        dungeon = new Room("entering what appears to be a dungeon. Scanning around the room you hear a loud crash."
                            + "\n From one of the cells a Troll appears and begins to charge you."
                            + "\n You are done exploring. You must retreat back the way you came.");
                            
        library = new Room("in the campus libray. The crisp smell of parchment is in the air." 
                            + "\nTo the left you see a sprial stair case leading to the second floor"
                            + "\nDo you go upstairs?");
                             
        librarySecondFloor = new Room("entering the second floor. Looking around you see solid oak desks."
                                        + "\nStudents are studying by candlelight."
                                        + "\nA warm ambiance from the glow of the candles make you feel at home.");
        
        observatory = new Room("in the astronomy tower."
                                + "\nStudents are looking through the telescope hoping to catch a glimpse of Saturn"
                                + " and it's rings tonight."
                                + "\nThere is a stair case that leads to a lower level" 
                                + "\nDo you go down or go back the way you came?");
        
        park = new Room("in the park now, standing between the Greenhouse to your North, and the pub to your South"
                        + "\nWhere to next?");
        
        infirmary = new Room("in the infirmary." 
                             + "*Luckily its a quiet night here* you think to yourself as the nurse greets you"
                             + "They ask if you need any medical assistance."
                             + "\nTo the North exit is a passage leading to the theater");
        
        gym = new Room("entering the gym, You hear clanking of weights and friendly comraderie of the gym goers."
                        +"\nOn the opposite side of the room is the locker room"
                        + " do you enter or go back North to the main grounds?");
        
        lockerRoom = new Room("entering the locker room. Lockers line the wall; a thick smell of must is in the air"
                                + "\nYou contemplate why you came in here."
                                + "\nQuickly you retreat back to the gym.");
        
        boatHouse = new Room("entering the boat house. A single canoe is tied up in the water."
                                + "\nYou think back to your first year when you arrived here"
                                + " on the very same boat.");
        
        greenHouse = new Room("inside the green house. It is a bontanical wonderland." 
                            + "You are surrounded by all sorts of flora;"
                            + " the sweet smell of roses and lavender fills the air.");
                                
        clockTower = new Room("in the clock tower. Chimes from the hour rolling over ring through your head."
                            + "\nThere are stairs leading to the top but they are under construction."
                            + "\nFeeling adventurous, you explore and find a door on the opposite side of the room."
                            +"\nDo you dare to enter or will you go back to the courtyard?");
        
        entranceHall = new Room("standing in the main hall of the university." 
                                + "To the north is the library." 
                                + "To the east you see a glowing green house."
                                + "To the west lies the observatory.");
        
        //add the array of items to the rooms
        outside = addRoomItem(outside, outsideItem);
        theater = addRoomItem(theater, theaterItem);
        pub = addRoomItem(pub, pubItem);
        lab = addRoomItem(lab, labItem);
        office = addRoomItem(office, officeItem);
        
        
        // initialise room exits
        outside.setExit("east", pub);
        outside.setExit("north", entranceHall);
        outside.setExit("west", clockTower);
        outside.setExit("south", gym);
        
        entranceHall.setExit("north", library);
        entranceHall.setExit("west", observatory);
        entranceHall.setExit("east", greenHouse);
        entranceHall.setExit("south", outside);
        
        library.setExit("up", librarySecondFloor);
        library.setExit("south", entranceHall);
        librarySecondFloor.setExit("down",library);
        
        greenHouse.setExit("south", park);
        greenHouse.setExit("east", boatHouse);
        
        boatHouse.setExit("west", greenHouse);
        
        park.setExit("north", greenHouse);
        park.setExit("south", pub);
        
        pub.setExit("north", park);
        pub.setExit("south", theater);
        pub.setExit("west", outside);
        
        clockTower.setExit("east", outside);
        clockTower.setExit("down", basement);
        
        basement.setExit("up", clockTower);
        basement.setExit("down", cavern);
        
        cavern.setExit("up", basement);
        cavern.setExit("down", dungeon);
        
        dungeon.setExit("up", cavern);
        
        gym.setExit("north", outside);
        gym.setExit("east", infirmary);
        gym.setExit("south", lockerRoom);
        
        lockerRoom.setExit("north", gym);
        
        infirmary.setExit("north", theater);
        infirmary.setExit("west", gym);

        theater.setExit("north", pub);
        theater.setExit("south", infirmary);
        
        observatory.setExit("east", entranceHall);
        observatory.setExit("down", lab);
        
        lab.setExit("up", observatory);
        lab.setExit("west", office);
        
        office.setExit("east", lab);
        
        currentRoom = outside;  // start game outside
    }

    /**
     *  Main play routine.  Loops until end of play.
     */
    public void play() 
    {            
        printWelcome();

        // Enter the main command loop.  Here we repeatedly read commands and
        // execute them until the game is over.
                
        boolean finished = false;
        while (! finished) {
            Command command = parser.getCommand();
            finished = processCommand(command);
        }
        System.out.println("Thank you for playing.  Good bye.");
    }

    /**
     * Print out the opening message for the player.
     */
    private void printWelcome()
    {
        System.out.println();
        System.out.println("Welcome to the World of Zuul!");
        System.out.println("World of Zuul is a new, incredibly boring adventure game.");
        System.out.println();
        System.out.println(currentRoom.getLongDescription());
        System.out.println("\nYour command words are:");
        parser.showCommands();
    }

    /**
     * Add an array of items to the rooms
     * and return the room.
     * 
     * @return room A fully populated room with items
     */
    private Room addRoomItem(Room room, Item items[])
    {
        for(int i = 0; i < items.length; i++)
        {
            room.addItem(items[i]);
        }
        return room;
    }
    
    /**
     * Given a command, process (that is: execute) the command.
     * @param command The command to be processed.
     * @return true If the command ends the game, false otherwise.
     */
    private boolean processCommand(Command command) 
    {
        boolean wantToQuit = false;

        CommandWord commandWord = command.getCommandWord();

        switch (commandWord) {
            case UNKNOWN:
                System.out.println("I don't know what you mean...");
                break;

            case HELP:
                printHelp();
                break;

            case GO:
                goRoom(command);
                break;

            case QUIT:
                wantToQuit = quit(command);
                break;
                
            case LOOK:
                look();
                break;
                
            case EAT:
                eat();
                break;
        }
        return wantToQuit;
    }

    // implementations of user commands:

    /**
     * Print out some help information.
     * Here we print some stupid, cryptic message and a list of the 
     * command words.
     */
    private void printHelp() 
    {
        System.out.println("You are lost. You are alone. You wander");
        System.out.println("around at the university.");
        System.out.println("\nYour command words are:");
        parser.showCommands();
    }

    /** 
     * Try to go in one direction. If there is an exit, enter the new
     * room, otherwise print an error message.
     */
    private void goRoom(Command command) 
    {
        if(!command.hasSecondWord()) {
            // if there is no second word, we don't know where to go...
            System.out.println("Go where?");
            return;
        }

        String direction = command.getSecondWord();

        // Try to leave current room.
        Room nextRoom = currentRoom.getExit(direction);

        if (nextRoom == null) {
            System.out.println("\nThere is no door!");
            System.out.println("\nYour command words are:");
            parser.showCommands();
        }
        else {
            currentRoom = nextRoom;
            System.out.println("\n" + currentRoom.getLongDescription());
            System.out.println("\nYour command words are:");
            parser.showCommands();
        }
    }

    /** 
     * "Quit" was entered. Check the rest of the command to see
     * whether we really quit the game.
     * @return true, if this command quits the game, false otherwise.
     */
    private boolean quit(Command command) 
    {
        if(command.hasSecondWord()) {
            System.out.println("Quit what?");
            return false;
        }
        else {
            return true;  // signal that we want to quit
        }
    }
    
    /**
     * Look re=prints the current location of the user
     * and the available exits
     */
    private void look()
    {
        System.out.println("\n" + currentRoom.getLongDescription());
        System.out.println("\nYour command words are:");
        parser.showCommands();
    }
    
    /**
     * Eat replnishes the players hunger 
     * 
     */
    private void eat()
    {
        System.out.println("\nYou have eaten. You now have a re-newed sense of purpose.");
        System.out.println("\nYour command words are:");
        parser.showCommands();
    }
}
