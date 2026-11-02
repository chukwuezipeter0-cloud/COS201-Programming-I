import java.util.Scanner;

public class ItemCost {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter item name: ");
        String itemName = scanner.nextLine();

        System.out.print("Enter price per item: ");
        double price = scanner.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        if (price < 0 || quantity <= 0) {
            System.out.println("Error: Price cannot be negative and quantity must be greater than 0.");
            scanner.close();
            return;
        }

        double totalCost = price * quantity;

        System.out.println();
        System.out.println("----- Item Cost -----");
        System.out.println("Item:       " + itemName);
        System.out.println("Price:      " + price);
        System.out.println("Quantity:   " + quantity);
        System.out.println("Total cost: " + totalCost);

        scanner.close();
    }
}