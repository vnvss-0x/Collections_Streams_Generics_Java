package Part4_Generics1;

public class Application {
    public static void main(String[] args) { 
        GenericStorage<String> names = new GenericStorage<>(); 
        names.addElement("Java"); 
        names.addElement("Python"); 
        System.out.println("Element: " + names.getElement(0)); 
        names.removeElement(1); 
        System.out.println("Size: " + names.getSize()); 
        GenericStorage<Integer> numbers = new GenericStorage<>(); 
        numbers.addElement(100); 
        System.out.println("Number: " + numbers.getElement(0)); 
    } 
} 
