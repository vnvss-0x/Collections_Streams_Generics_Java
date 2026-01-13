package Part4_Generics1;

import java.util.ArrayList;
import java.util.List; 
public class GenericStorage<T> { 
    private List<T> elements = new ArrayList<>(); 
    public void addElement(T element) { elements.add(element); } 
    public void removeElement(int index) { elements.remove(index); } 
    public T getElement(int index) { return elements.get(index); } 
    public int getSize() { return elements.size(); } 
} 
