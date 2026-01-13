package Part1_Lists;

import java.util.ArrayList;
import java.util.Scanner; 
public class ProductManagementApp { 
    public static void main(String[] args) { 
        ArrayList<Product> products = new ArrayList<>(); 
        Scanner scanner = new Scanner(System.in); 
        products.add(new Product(1, "Laptop", 1200.0)); 
        products.add(new Product(2, "Mouse", 25.0)); 
        products.add(new Product(3, "Keyboard", 45.0)); 
        products.remove(1); 
        for (Product p : products) { 
            System.out.println("ID: " + p.getId() + ", Name: " + p.getName() + ", Price: " + p.getPrice()); 
        } 
        if (products.size() > 0) { 
            Product p = products.get(0); 
            p.setName("Updated Laptop"); 
            p.setPrice(1150.0); 
        } 
        System.out.print("Enter product name to search: "); 
        String searchName = scanner.nextLine(); 
        for (Product p : products) { 
            if (p.getName().equalsIgnoreCase(searchName)) { 
                System.out.println("Found: ID " + p.getId() + ", Price " + p.getPrice()); 
            } 
        } 
    } 
} 
