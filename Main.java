import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyLinkedList<Order> orderList = new MyLinkedList<>();

        while (true) {
            System.out.println("\n1. Add Order");
            System.out.println("2. Remove Order");
            System.out.println("3. Display Orders");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Order Number: ");
                    int orderNumber = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Product Name: ");
                    String productName = scanner.nextLine();
                    System.out.print("Enter Quantity: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Customer Name: ");
                    String customerName = scanner.nextLine();
                    System.out.print("Enter Status: ");
                    String status = scanner.nextLine();
                    System.out.print("Enter Price: ");
                    double price = scanner.nextDouble();

                    Order newOrder = new Order(orderNumber, productName, quantity, customerName, status, price);
                    orderList.add(newOrder);
                    System.out.println("Order added successfully!");
                    break;
                case 2:
                    System.out.print("Enter Order Number to remove: ");
                    int removeOrderNumber = scanner.nextInt();
                    orderList.remove(removeOrderNumber);
                    System.out.println("Order removed successfully!");
                    break;
                case 3:
                    System.out.println("\nDisplaying all orders:");
                    orderList.displayOrders();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
