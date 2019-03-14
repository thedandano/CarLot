import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu{
    private int userChoice = 0;
    private Scanner in = new Scanner(System.in);

    /**
     * Constructor
     */
    public Menu(){
        System.out.println("-------------------------");
        System.out.println("| Car Inventory Manager |");
        System.out.println("-------------------------");
        System.out.println("What would you like to do?\n");
        System.out.println("1: Create an Inventory");
        System.out.println("2: Display Inventory");
        System.out.print("\nEnter your choice: ");
        userChoice();
    }

    /**
     * Method to receive and process User input for the Menu.
     */
    public void userChoice(){
        int userChoice;

        while(true){
            try {
                userChoice = in.nextInt();
                break;
            } catch (InputMismatchException event) {
                in.nextLine();
                System.out.println("Must be a number!");
            }
        }
        switch (userChoice){
            case 1: choiceOne_CreateInventory();
            break;
            case 2: try{
                choiceTwo_DisplayInventory();
            }
            catch(IOException e){
                System.out.println("No Inventory exists");
            }
            break;
            default: System.out.println("Exiting...");
            System.exit(0);
        }
    }

    /**
     * Creates and Inventory and writes to a file
     */
    public void choiceOne_CreateInventory(){
        System.out.println("How many cars would you like to add?");
        while(true){
            try {
                userChoice = in.nextInt();
                break;
            } catch (InputMismatchException event) {
                in.nextLine();
                System.out.println("Must be a number!");
            }
        }
        Car_Inventory inventory = new Car_Inventory(true,userChoice);

        try {
            inventory.writeInventoryFile(inventory);
        }
        catch(IOException e){
            System.out.println("You suck at programming!");
        }

    }

    /**
     * Displays the inventory from a file.
     * @throws IOException
     */
    public void choiceTwo_DisplayInventory() throws IOException {
        int userInput = 0;
        Car_Inventory inventory = new Car_Inventory(false,userChoice);
        inventory.readInventoryFile("inventory.txt");
        inventory.displayInventory(inventory);
    }

}
