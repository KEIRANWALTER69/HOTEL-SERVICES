import java.util.Scanner;
public class Main {
    public double subTotal;
    public static double runningTotal;
    private static double itemPrice;
    static boolean ordering = true;
    static boolean done=true;
    static Scanner input = new Scanner(System.in);
    public static void menu(){
        System.out.println("Welcome to Steve and Humphrey Resturant \n ITEM\t\tPRICE\n1. Nyamachoma  200.00 \n2. Pilau  150.00\n3. Soda   80.00 \n4. Water  20.00\n5.Wine   300.00\n6.Insert '6' if your done");
    }
    public static double itemPrice(int foodItem) {
        if (foodItem == 1) {
            System.out.println("You have ordered a Nyamachoma");
            itemPrice = 200.00;
        }
        if (foodItem == 2) {
            System.out.println("You have ordered Pilau");
            itemPrice = 150.00;
        }
        if (foodItem == 3) {
            System.out.println("You have ordered a soda");
            itemPrice = 80.00;
        }
        if (foodItem == 4) {
            System.out.println("You have ordered Water");
            itemPrice = 20.00;
        }
        if (foodItem == 5) {
            System.out.println("You have ordered a Wine");
            itemPrice = 300.00;
        }
        quantity();
        return itemPrice;
    }
    public static double quantity() {
        System.out.println("Enter quantity");
        double quantity = input.nextDouble();
        subTotal(quantity, itemPrice);
        return quantity;
    }
    public static double subTotal(double quantity, double itemPrice) {
        double subTotal = quantity*itemPrice;
        System.out.println("Your total bill is: "+ subTotal);
        runningTotal += subTotal;
        return subTotal;
    }
    public static void done(){
        ordering = false;
        System.out.println(runningTotal);

        System.out.println("Your total bill is: "+  runningTotal);
        System.out.println("Enjoy your meal");
    }
    public static void main(String[] args) {
        int menuOption;
        int foodItem = 0;
        input = new Scanner(System.in);
        do{
            double runningTotal=0;
            menu();
            menuOption = input.nextInt();
            switch(menuOption){
                case 1:
                    foodItem = 1;
                    itemPrice(foodItem);
                    break;
                case 2:
                    foodItem = 2;
                    itemPrice(foodItem);
                    break;
                case 3:
                    foodItem = 3;
                    itemPrice(foodItem);
                    break;
                case 4:
                foodItem = 4;
                itemPrice(foodItem);
                break;
                case 5:
                foodItem = 5;
                itemPrice(foodItem);
                break;

                case 6:
                    done();
                    break;
                default:
                    System.out.println("Invalid option.");
            }

        } while(ordering); {
        }
    }
}