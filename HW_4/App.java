package edu.neu.mgen;
import java.util.Scanner;
/* This program is part of the Chapter 4 Java project. It uses sample data about Apple products to practice variables.
 */
public class App {
    public static void main(String[] args) {
        System.out.println("It is my first Java program");
        int iphone18ProStock = 20;
        int macBookStock = 10;
        long iphone18ProViews = 3000000000L;
        long macBookViews = 50000L;
        double iphone18ProPrice = 999.99;
        double macBookPrice = 1299.99;
        boolean isIphone18ProOnSale = true;
        boolean isMacBookOnSale = false;
        char burgundyColorCode = 'B'; // B stands for Burgundy
        char glacierColorCode = 'G';  // G stands for Glacier
        System.out.println("iphone18ProStock = " + iphone18ProStock);
        System.out.println("macBookStock = " + macBookStock);
        System.out.println("iphone18ProViews = " + iphone18ProViews);
        System.out.println("macBookViews = " + macBookViews);
        System.out.println("iphone18ProPrice = " + iphone18ProPrice);
        System.out.println("macBookPrice = " + macBookPrice);
        System.out.println("isIphone18ProOnSale = " + isIphone18ProOnSale);
        System.out.println("isMacBookOnSale = " + isMacBookOnSale);
        System.out.println("burgundyColorCode = " + burgundyColorCode);
        System.out.println("glacierColorCode = " + glacierColorCode); 
        long iphone18ProStockAsLong = iphone18ProStock;
        long macBookStockAsLong = macBookStock;
        System.out.println("--- int to long ---");
        System.out.println("iphone18ProStockAsLong = " + iphone18ProStockAsLong);
        System.out.println("macBookStockAsLong = " + macBookStockAsLong);
        System.out.println("--- long to int ---"); 
        int iphone18ProViewsAsInt = (int) iphone18ProViews;
        int macBookViewsAsInt = (int) macBookViews;
        System.out.println("iphone18ProViewsAsInt = " + iphone18ProViewsAsInt);
        System.out.println("macBookViewsAsInt = " + macBookViewsAsInt);
        System.out.println("--- input from terminal ---");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter iPhone 18 Pro order quantity: ");
        int iphone18ProOrderQuantity = scanner.nextInt();
        System.out.print("Enter MacBook order quantity: ");
        int macBookOrderQuantity = scanner.nextInt();
        System.out.print("Enter order number: ");
        long orderNumber = scanner.nextLong();
        System.out.print("Enter delivery fee: ");
        double deliveryFee = scanner.nextDouble();
        System.out.print("Are you a member? Enter true or false: ");
        boolean isMember = scanner.nextBoolean();
        System.out.print("Enter color code (B for Burgundy, G for Glacier): ");
        char selectedColor = scanner.next().charAt(0);
        System.out.println("--- your input ---");
        System.out.println("iphone18ProOrderQuantity = " + iphone18ProOrderQuantity);
        System.out.println("macBookOrderQuantity = " + macBookOrderQuantity);
        System.out.println("orderNumber = " + orderNumber);
        System.out.println("deliveryFee = " + deliveryFee);
        System.out.println("isMember = " + isMember);
        System.out.println("selectedColor = " + selectedColor);
        scanner.close();
        System.out.println("--- arithmetic and logical operations ---");
        double iphone18ProCost = iphone18ProOrderQuantity * iphone18ProPrice;
        double macBookCost = macBookOrderQuantity * macBookPrice;
        double totalCost = iphone18ProCost + macBookCost + deliveryFee;
        System.out.println("Total items ordered = " + (iphone18ProOrderQuantity + macBookOrderQuantity));
        System.out.println("iPhone 18 Pro cost = " + iphone18ProCost);
        System.out.println("MacBook cost = " + macBookCost);
        System.out.println("Total price including delivery = " + totalCost);
        System.out.println("iPhone 18 Pro stock remaining = " + (iphone18ProStock - iphone18ProOrderQuantity));
        System.out.println("MacBook stock remaining = " + (macBookStock - macBookOrderQuantity)); 
        System.out.println("iPhone order / stock (integer division) = " + (iphone18ProOrderQuantity / iphone18ProStock));
        System.out.println("iPhone order / stock (decimal division) = " + ((double) iphone18ProOrderQuantity / iphone18ProStock));
        System.out.println("Order number remainder when divided by 2 = " + (orderNumber % 2));
        System.out.println("Enough iPhone stock = " + (iphone18ProOrderQuantity <= iphone18ProStock));
        System.out.println("Enough MacBook stock = " + (macBookOrderQuantity <= macBookStock));
        System.out.println("Member and iPhone on sale = " + (isMember && isIphone18ProOnSale));
        System.out.println("At least one product on sale = " + (isIphone18ProOnSale || isMacBookOnSale));
        System.out.println("Not a member = " + (!isMember));
        System.out.println("Selected Burgundy = " + (selectedColor == burgundyColorCode));
        System.out.println("Selected Glacier = " + (selectedColor == glacierColorCode));
    }
}