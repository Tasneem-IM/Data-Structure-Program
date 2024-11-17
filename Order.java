public class Order {
    private int orderNumber;
    private String productName;
    private int quantity;
    private String customerName;
    private String status;
    private double price;

    public Order(int orderNumber, String productName, int quantity, String customerName, String status, double price) {
        this.orderNumber = orderNumber;
        this.productName = productName;
        this.quantity = quantity;
        this.customerName = customerName;
        this.status = status;
        this.price = price;
    }

    public int getOrderNumber() { return orderNumber; }
    public String getProductsName() { return productName; }
    public int getQuantity() { return quantity; }
    public String getCustomerName() { return customerName; }
    public String getStatus() { return status; }
    public double getPrice() { return price; }

    @Override
    public String toString() {
        return "Order{" +
               "orderNumber=" + orderNumber +
               ", productName='" + productName + '\'' +
               ", quantity=" + quantity +
               ", customerName='" + customerName + '\'' +
               ", status='" + status + '\'' +
               ", price=" + price +
               '}';
    }
}
