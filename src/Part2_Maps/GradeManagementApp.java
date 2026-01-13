package Part2_Maps;

import java.util.HashMap;
import java.util.Map; 
public class GradeManagementApp { 
    public static void main(String[] args) { 
        HashMap<String, Double> grades = new HashMap<>(); 
        grades.put("Ahmed", 15.5); 
        grades.put("Sanae", 20.0); 
        grades.put("Omar", 12.0); 
        displayMap(grades); 
        grades.put("Ahmed", grades.get("Ahmed") + 2.0); 
        displayMap(grades); 
        grades.remove("Omar"); 
        displayMap(grades); 
        System.out.println("Size: " + grades.size()); 
        double total = 0, max = -1, min = 21; 
        for (double g : grades.values()) { 
            total += g; 
            if (g > max) max = g; 
            if (g < min) min = g; 
        } 
        System.out.println("Average: " + (total / grades.size())); 
        System.out.println("Max: " + max); 
        System.out.println("Min: " + min); 
        System.out.println("Has 20? " + grades.containsValue(20.0)); 
    } 
    public static void displayMap(Map<String, Double> map) { 
        map.forEach((name, grade) -> System.out.println(name + ": " + grade)); 
    } 
} 
