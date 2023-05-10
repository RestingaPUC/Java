package Comparator.App;

import java.util.Comparator;

import Comparator.entities.Product;

public class MyComparator implements Comparator<Product> {

    @Override
    public int compare(Product p1, Product p2) {
        return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
    }
    
}
