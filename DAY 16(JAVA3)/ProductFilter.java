
import java.util.Arrays;
import java.util.List;

// 2. Streams
// Activity: Product Filter
 
// Task:
 
// Create a Product class with name, price, and category
 
// Add a list of products (e.g., 5–6 items with mixed categories and prices)
 
// Use streams to:
 
// Filter products under ₹500
 
// Get names of products in a certain category (e.g., "Electronics")
 
// Print all product names sorted by price
 
// Goal: Learn how to manipulate objects using stream operations.

class Product{
    String name;
    int price;
    String Category;

    public Product(String name, int price, String Category){
        this.name=name;
        this.price=price;
        this.Category=Category;
    }

    
}

public class ProductFilter {
    public static void main(String[] args) {
         List<Product> products = Arrays.asList(
            new Product("Headphones", 1500, "Electronics"),
            new Product("Notebook", 150, "Stationery"),
            new Product("Smartphone", 12000, "Electronics"),
            new Product("Pen", 30, "Stationery"),
            new Product("USB Cable", 200, "Electronics"),
            new Product("T-shirt", 400, "Clothing")
        );
        products.stream()
        .filter(p -> p.price < 500)
        .forEach(p -> System.out.println("Products below 500 price :" + p.name)); 
       System.out.println("");

       // Get names of products in a certain category (e.g., "Electronics")
         List<String> choice = Arrays.asList("Electronics", "Stationery", "Clothing");
        products.stream()
        .filter(p -> choice.stream().anyMatch(c -> c.equalsIgnoreCase(p.Category)))
        .forEach(p -> System.out.println(p.name + " - " + p.Category));
 System.out.println("");
// Print all product names sorted by price
     products.stream()
     .sorted((p1,p2) -> Integer.compare(p1.price, p2.price))
      .forEach(p -> System.out.println(p.name + " - ₹" + p.price));
    }
}
