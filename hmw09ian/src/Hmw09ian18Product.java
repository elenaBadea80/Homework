// 18. Create a class Product with name and price fields. From a list of products,
// find the three most expensive products using streams.

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Hmw09ian18Product {
    public static void main(String[] args) {

        List<Product> productList = Arrays.asList(
                new Product("Product 1", 25),
                new Product("Product 2", 59),
                new Product("Product 3", 32),
                new Product("Product 4", 68),
                new Product("Product 5", 63),
                new Product("Product 6", 17)
        );

        List<Product> maxProduct = productList.stream()
                .sorted(Comparator.comparing(Product::getPrice).reversed())
                .limit(3)
                .toList();

        maxProduct.forEach(System.out::println);

    }
}

class Product {
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}