package ru.itmo.homework6.product;

public class Application {
    public static void main(String[] args) {
        Product product1 = new Product("avocado", 1200, 300, 45);
        Product product2 = new Product("strawberry", 1200, 2000, 45);
        Product product3 = new Product("bread", 1200, 300, 45);
        Product product4 = new Product("soap", 1200, 300, 45);


        MyProduct myProduct = new MyProduct(1300, 5000, 300, 2000, 3);
        MyProduct myProduct1 = new MyProduct(599, 700, 90, 9, 1);
        myProduct.addProduct(product1);
        myProduct.addProduct(product2);
        myProduct.addProduct(product3);
        myProduct.addProduct(product4);
        System.out.println(myProduct);
        myProduct.printName();


    }
}
