package exercise02.search;

import java.util.Arrays;
import java.util.Comparator;

public class SearchDemo {

    // Linear Search
    public static Product linearSearch(Product[] products,
                                       String target) {

        for(Product product : products) {

            if(product.productName.equalsIgnoreCase(target)) {
                return product;
            }
        }

        return null;
    }

    // Binary Search
    public static Product binarySearch(Product[] products,
                                       String target) {

        int left = 0;
        int right = products.length - 1;

        while(left <= right) {

            int mid = (left + right) / 2;

            int comparison =
                    products[mid].productName
                            .compareToIgnoreCase(target);

            if(comparison == 0) {
                return products[mid];
            }
            else if(comparison < 0) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        Product[] products = {

                new Product(101,
                        "Laptop",
                        "Electronics"),

                new Product(102,
                        "Mobile",
                        "Electronics"),

                new Product(103,
                        "Shoes",
                        "Fashion"),

                new Product(104,
                        "Watch",
                        "Accessories")
        };

        // Linear Search
        Product result1 =
                linearSearch(products,
                        "Mobile");

        System.out.println("Linear Search Result:");
        System.out.println(result1);

        // Sort for Binary Search
        Arrays.sort(products,
                Comparator.comparing(
                        p -> p.productName));

        Product result2 =
                binarySearch(products,
                        "Mobile");

        System.out.println("\nBinary Search Result:");
        System.out.println(result2);
    }
}