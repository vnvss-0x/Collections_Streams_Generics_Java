package Part5_Generics2;

import java.util.Scanner;
public class Application { 
    public static void main(String[] args) { 
        MetierProduitImpl metier = new MetierProduitImpl(); 
        Scanner scanner = new Scanner(System.in); 
        int choice = 0; 
        while (choice != 5) { 
            System.out.println("1. Display Products"); 
            System.out.println("2. Search Product by ID"); 
            System.out.println("3. Add Product"); 
            System.out.println("4. Delete Product by ID"); 
            System.out.println("5. Exit"); 
            choice = scanner.nextInt(); 
            if (choice == 1) { 
                for (Product p : metier.getAll()) System.out.println(p.getId() + ": " + p.getName()); 
            } else if (choice == 2) { 
                System.out.print("ID: "); 
                long id = scanner.nextLong(); 
                Product p = metier.findById(id); 
                if (p != null) System.out.println("Found: " + p.getName()); 
            } else if (choice == 3) { 
                System.out.print("ID: "); long id = scanner.nextLong(); 
                System.out.print("Name: "); String name = scanner.next(); 
                metier.add(new Product(id, name, "", 0.0, "", 0)); 
            } else if (choice == 4) { 
                System.out.print("ID to delete: "); 
                long id = scanner.nextLong(); 
                metier.delete(id); 
            } 
        } 
    } 
} 
