public class SearchTest {

    public static void main(String[] args) {

        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Smartphone", "Electronics"),
            new Product(103, "Headphones", "Accessories"),
            new Product(104, "Keyboard", "Accessories"),
            new Product(105, "Mouse", "Accessories")
        };

        System.out.println("Linear Search:");
        Product result1 = LinearSearch.search(products, 104);

        if (result1 != null)
            System.out.println(result1);
        else
            System.out.println("Product not found");

        System.out.println("\nBinary Search:");
        Product result2 = BinarySearch.search(products, 104);

        if (result2 != null)
            System.out.println(result2);
        else
            System.out.println("Product not found");
    }
}