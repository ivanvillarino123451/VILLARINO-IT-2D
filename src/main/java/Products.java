import java.util.ArrayList;
import java.util.List;

public class Products {
    private final List<Product> products;

    public Products() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }
}


    
