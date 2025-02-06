class product {
    private String productName;
    private int productID;
    private double price;
    private int quantityInStock;

    public product(String productName, int productID, double price, int quantityInStock) {
        this.productName = productName;
        this.productID = productID;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }
    public void applyDiscount(double discountPercent) {
        if (discountPercent > 0 && discountPercent < 100) {
            price -= price * (discountPercent / 100);
        } else {
            System.out.println("Invalid discount percentage. Must be between 0 and 100.");
        }
    }

    public void displayProductInfo() {
        System.out.println("Product: " + productName + " (ID: " + productID + ")");
        System.out.println("Price: $" + String.format("%.2f", price));
        System.out.println("Stock: " + quantityInStock);
    }
    public static void main(String[] args) {
        product product = new product("Smartphone", 202, 500.00, 15);
        product.displayProductInfo();

        System.out.println("\nApplying 20% discount...");
        product.applyDiscount(20);
        product.displayProductInfo();
    }
}
