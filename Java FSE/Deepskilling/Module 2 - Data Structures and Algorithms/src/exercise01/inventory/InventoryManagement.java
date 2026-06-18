package exercise01.inventory;

import java.util.HashMap;

public class InventoryManagement {

    private HashMap<Integer, Product> inventory =
            new HashMap<>();

    // Add Product
    public void addProduct(Product product) {

        inventory.put(product.getProductId(), product);

        System.out.println("Product Added Successfully");
    }

    // Update Product
    public void updateProduct(int id,
                              int quantity,
                              double price) {

        Product product = inventory.get(id);

        if (product != null) {

            product.setQuantity(quantity);
            product.setPrice(price);

            System.out.println(
                    "Product Updated Successfully");
        } else {

            System.out.println("Product Not Found");
        }
    }

    // Delete Product
    public void deleteProduct(int id) {

        if (inventory.remove(id) != null) {

            System.out.println(
                    "Product Deleted Successfully");
        } else {

            System.out.println("Product Not Found");
        }
    }

    // Display Products
    public void displayInventory() {

        System.out.println("\nInventory Details");

        for(Product product : inventory.values()) {

            System.out.println(product);
        }
    }

    public static void main(String[] args) {

        InventoryManagement inventory =
                new InventoryManagement();

        inventory.addProduct(
                new Product(101,
                        "Laptop",
                        10,
                        50000));

        inventory.addProduct(
                new Product(102,
                        "Mobile",
                        20,
                        25000));

        inventory.displayInventory();

        inventory.updateProduct(
                101,
                15,
                52000);

        inventory.displayInventory();

        inventory.deleteProduct(102);

        inventory.displayInventory();
    }
}