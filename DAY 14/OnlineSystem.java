import java.util.*;

// Abstraction
abstract class ProductBase {
    abstract void showDetails();
}

// Encapsulation
class User {
    private String name;
    private String email;
    private String password;

    // Setters (Encapsulation)
    public void setDetails(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    void showUserDetails(){
         System.out.println("NAME OF USER :" + name);
          System.out.println("Email OF USER :" + email);
    }
}

// Inheritance
class AddProduct extends User {
    String productName;
    double price;

    void addProduct(String pname, double price) {
        this.productName = pname;
        this.price = price;
        System.out.println("Product Added: " + pname + " - " + price);
    }
   
}

// Polymorphism (via Abstraction)
class ShowProduct extends ProductBase {
    String pname;
    double price;

    ShowProduct(String pname, double price) {
        this.pname = pname;
        this.price = price;
    }

    // Overridden method
    void showDetails() {
        System.out.println("Product: " + pname + ", Price: " + price);
    }
}

public class OnlineSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create user and set details
        User u = new User();
        u.setDetails("Faizan", "faizan@mail.com", "pass123");
        u.showUserDetails();
        // Add product
        AddProduct ap = new AddProduct();
        ap.addProduct("Mobile", 999.99);

        // Show product (Polymorphism)
        ProductBase sp = new ShowProduct("Mobile", 999.99);
        sp.showDetails();
    }
}
