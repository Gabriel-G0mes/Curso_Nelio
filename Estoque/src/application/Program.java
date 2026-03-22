package application;
import entities.Product;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Price: ");
        double price = input.nextDouble();
        Product product = new Product(name, price);

        product.setName("Computer");
        System.out.println("Updated name: " + product.getName());
        product.setPrice(1200.00);
        System.out.println("Updated price: " + product.getPrice());

        System.out.print("");
        System.out.println("Product data: " + product);

        System.out.println("");
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = input.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);
        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = input.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);


        input.close();
    }
}
