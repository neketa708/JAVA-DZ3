package zad2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("bmw", "gemany", 100, 53, 1);
        Product product2 = new Product("lada", "russia", 150, 20, 3);
        Product product3 = new Product("pego", "franch", 50, 53, 1);
        Product product4 = new Product("mrc", "gemany", 100, 70, 1);
        Product product5 = new Product("mrc", "gemany", 100, 60, 2);
        List<Product> productList= new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        Scanner scaner = new Scanner(System.in);
        System.out.println("введите сорт от 1 до 3");
        Integer searchSort = scaner.nextInt();
        Integer min= 99999;
        for (Product product: productList){
            if (searchSort>0 && searchSort<3){
                if (product.getSort().equals(searchSort)){
                    if (product.getCost()<min){
                        min = product.getCost();
                    }
                }
            } else {
                System.out.println("введите нужное число");
                break;
            }

        }
        for (Product product: productList){
            if (product.getSort().equals(searchSort) && product.getCost().equals(min)){
                System.out.println(product);
            }
        }
    }
}
