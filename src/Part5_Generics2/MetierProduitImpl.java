package Part5_Generics2;

import java.util.ArrayList;
import java.util.List; 
public class MetierProduitImpl implements IMetier<Product> { 
    private List<Product> productList = new ArrayList<>(); 
    @Override 
    public void add(Product o) { productList.add(o); } 
    @Override 
    public List<Product> getAll() { return productList; } 
    @Override 
    public Product findById(long id) { 
        for (Product p : productList) { 
            if (p.getId() == id) return p; 
        } 
        return null; 
    } 
    @Override 
    public void delete(long id) { 
        Product p = findById(id); 
        if (p != null) productList.remove(p); 
    } 
} 
