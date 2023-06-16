package zad1;

import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("хлеб высший", 82, 1);
        Product product2 = new Product("средний", 92, 1);
        Product product3 = new Product("высший", 92, 3);
        Product product4 = new Product("высший", 82, 2);
        List<Product> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        Integer max = 0;

        for (Product product:productList) {
            if (product.getSort().equals(1) | product.getSort().equals(2) && product.getName().contains("высший")) {
                if (product.getCost()>max){
                    max = product.getCost();
                }
            }
        }
        for (Product product:productList){
            if (product.getCost().equals(max)){
                System.out.println(product);
            }
        }
    }
}
