/**
 * Experimental Project dealing with Vehicle inventory.
 * @author thedandano
 * @version 0.1
 */

import java.util.*;
public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        char choice;

        do {
            Menu menu = new Menu();
            System.out.print("Anything else? (Y/N)");
            choice = in.next(".").charAt(0);
        }while(choice == 'y'|| choice == 'Y');

        System.out.println("Exiting...");
    }
}
