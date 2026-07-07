import java.util.ArrayList;
import java.util.List;

class BookCategory {
    String category;

    BookCategory(String category) {
        this.category = category;
    }

    public String toString() {
        return category;
    }
}

class ClothingCategory {
    String category;

    ClothingCategory(String category) {
        this.category = category;
    }

    public String toString() {
        return category;
    }
}

class GadgetCategory {
    String category;

    GadgetCategory(String category) {
        this.category = category;
    }

    public String toString() {
        return category;
    }
}

class Product<T> {
    String name;
    double price;
    T category;

    Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String toString() {
        return "Product: " + name + ", Price: " + price + ", Category: " + category;
    }
}

public class DynamicOnlineMarketplace {

    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        product.price = product.price - (product.price * percentage / 100);
    }

    public static void main(String[] args) {

        Product<BookCategory> book =
                new Product<>("Java Programming", 500,
                        new BookCategory("Education"));

        Product<ClothingCategory> cloth =
                new Product<>("T-Shirt", 1200,
                        new ClothingCategory("Men"));

        Product<GadgetCategory> gadget =
                new Product<>("Laptop", 70000,
                        new GadgetCategory("Electronics"));

        List<Product<?>> catalog = new ArrayList<>();

        catalog.add(book);
        catalog.add(cloth);
        catalog.add(gadget);

        applyDiscount(book, 10);
        applyDiscount(cloth, 20);
        applyDiscount(gadget, 5);

        System.out.println("Product Catalog:");

        for (Product<?> product : catalog) {
            System.out.println(product);
        }
    }
}