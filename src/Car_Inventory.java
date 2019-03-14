import java.util.ArrayList;
import java.util.*;
import java.io.*;

public class Car_Inventory {

    private ArrayList<Car> cars;


    public Car_Inventory(boolean addCars,int numberOfCars){
        cars = new ArrayList<>();

        if(addCars == true) {

            for (int x = 1; x < numberOfCars + 1; x++) {
                cars.add(new Car(x, "Toyota" + x, "Blue", 10000.00 + x * 100));
            }
        }
        else{
            System.out.println("Fetching Inventory...");
        }
    }

    /**
     * Reads inventory from a file.
     * @param file
     * @throws IOException
     */
    public void readInventoryFile(String file) throws IOException {
        String line;
        Scanner readFile = new Scanner(new File(file));

        while(readFile.hasNextLine()){
            line = readFile.nextLine();
            int stockNumber = Integer.parseInt(line);

            String carName = readFile.nextLine();
            String carColor = readFile.nextLine();

            line = readFile.nextLine();
            double carPrice = Double.parseDouble(line);

            cars.add(new Car(stockNumber,carName,carColor,carPrice));
        }
        readFile.close();
    }

    /**
     * Writes to a file.
     * @param car_inventory
     * @throws IOException
     */
    public void writeInventoryFile(Car_Inventory car_inventory) throws IOException{
        String inventoryFile = "inventory.txt";
        PrintWriter writer = new PrintWriter(new FileWriter(inventoryFile));
        for(int x = 0; x < cars.size(); x++) {
            writer.println(cars.get(x).getStockNumber());
            writer.println(cars.get(x).getName());
            writer.println(cars.get(x).getColor());
            writer.println(cars.get(x).getPrice());
        }
        writer.close();
    }

    /**
     * Displays inventory.
     * @param car_inventory
     */
    public void displayInventory(Car_Inventory car_inventory){
        System.out.println(car_inventory.toString());
    }

    /**
     * A String representation of Cars
     * @return a String representation of Cars
     */
    public String toString(){
        return cars.toString();
    }
}
