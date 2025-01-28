package _23_01_25.classWork;

import java.util.ArrayList;

public class Basket {
    private ArrayList<Product> products;

    public Basket(ArrayList<Product> products) {
        this.products = products;
    }

    public ArrayList<Product> getProducts() {
        return this.products;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "products=" + products +
                '}';
    }
}
