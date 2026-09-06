import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Tạo 1 danh sách sản phẩm
        List<Product> products = new ArrayList<>();

        // Thêm 5 sản phẩm thuộc đủ 3 loại
        products.add(new Laptop(
                1,
                "Dell XPS 13",
                25000000,
                "Dell"
        ));

        products.add(new Laptop(
                2,
                "MacBook Air M3",
                28000000,
                "Apple"
        ));

        products.add(new Smartphone(
                3,
                "iPhone 15",
                22000000,
                171
        ));

        products.add(new Smartphone(
                4,
                "Samsung Galaxy S24",
                20000000,
                167
        ));

        products.add(new Tablet(
                5,
                "iPad Air",
                18000000,
                10.9
        ));

        // Hiển thị danh sách sản phẩm ra màn hình
        System.out.println("===== DANH SACH SAN PHAM =====");

        for (Product product : products) {
            System.out.println(product);
        }
    }
}