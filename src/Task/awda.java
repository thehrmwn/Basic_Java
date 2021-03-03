package Task;
 
import java.util.InputMismatchException;
import java.util.Scanner;
 
public class awda {
    public static void main(String[] args) {
        System.out.println("*** Welcome to Shelly's Candy Shop ***");
 
        // Create dispenser objects:
        ProductDispenser Candy = new ProductDispenser(0.50, 12);
        ProductDispenser Chips = new ProductDispenser(0.65, 12);
        ProductDispenser Gum = new ProductDispenser(0.45, 12);
        ProductDispenser Cookies = new ProductDispenser(0.85, 12);
 
        // Create cash register object:
        CashRegister CR = new CashRegister();
 
        int select = 0;
        do {
            select = getIntInput("nTo select an item, entern" + "1 for Candyn"
                    + "2 for Chipsn" + "3 for Gumn" + "4 for Cookiesn"
                    + "9 to exitn");
            switch (select) {
            case 1:
                purchase(Candy, CR);
                break;
            case 2:
                purchase(Chips, CR);
                break;
            case 3:
                purchase(Gum, CR);
                break;
            case 4:
                purchase(Cookies, CR);
                break;
            case 9:
                break;
            default:
                System.out.println("Invalid Selection");
            }
        } while (select != 9);
    }
 
    // Method to execute purchase:
    public static void purchase(ProductDispenser product, CashRegister cashreg) {
        Scanner input = new Scanner(System.in);
        if (product.getProdQty() > 0) {
            double pmt = 0;
            // Collect enough coin to purchase product.
            do {
                System.out.print("Please deposit "
                        + (product.getProdCost() * 100 - pmt) + " cents.");
                pmt += input.nextDouble();
            } while (pmt < product.getProdCost() * 100);
            product.setProdQty(1);
            cashreg.setCashOnHand(product.getProdCost());
            System.out.println("Collect your item at the bottom and enjoy.");
        }
    }
 
    // Method to handle integer input:
    public static int getIntInput(String prompt) {
        Scanner input = new Scanner(System.in);
        System.out.print(prompt);
        int intValue = 0;
        try {
            intValue = input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("*** That is not a number. ***");
        }
        return intValue;
    }
}
 
 
class CashRegister {
    // Data elements:
    private double cashOnHand;
 
    // Methods:
    CashRegister() {                        // Constructor
        cashOnHand = 0;
    }
    double getCashOnHand() {
        return cashOnHand;
    }
    void setCashOnHand(double purchase) {
        cashOnHand += purchase;
    }
}
 
 
class ProductDispenser {
    // Data elements:
    private double prodCost;
    private int prodQty;
 
    // Methods:
    ProductDispenser(double cost, int qty) { // Constructor
        prodCost = cost;
        prodQty = qty;
    }
    double getProdCost() {
        return prodCost;
    }
    int getProdQty() {
        return prodQty;
    }
    void setProdQty(int qty) {
        prodQty -= qty;
    }
}