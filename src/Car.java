public class Car {
    private int stockNumber;
    private String carName;
    private double carPrice;
    private String carColor;

    /**
     * Constructor
     * @param stockNumber
     * @param carName
     * @param carColor
     * @param carPrice
     */
    public Car(int stockNumber,String carName,String carColor, double carPrice){
        this.stockNumber = stockNumber;
        this.carName = carName;
        this.carColor = carColor;
        this.carPrice = carPrice;
    }

    /**
     * Returns the Stock Number (Inventory number)of a vehicle.
     * @return Returns the Stock Number (Inventory number)of a vehicle.
     */
    public int getStockNumber(){
        return stockNumber;
    }

    /**
     * Returns the name of a vehicle.
     * @return the name of a vehicle.
     */
    public String getName(){
        return carName;
    }

    /**
     * Returns the color of a vehicle.
     * @return the color of a vehicle.
     */
    public String getColor(){
        return carColor;
    }

    /**
     * Returns the price of a vehicle.
     * @return the price of a vehicle.
     */
    public double getPrice(){
        return carPrice;
    }
    /**
     * A toString method for Testing Purposes.
     * @return a String representation of a Car Object.
     */
    public String toString(){
        String string = "";

        string = String.format("\nStock Number: %5d " +
                               "\nCar Name: %10s " +
                               "\nCar Color: %10s " +
                               "\nCar Price: %10.2f\n"
                               ,stockNumber,carName,carColor,carPrice);
        return string;
    }
}
