package applicattion;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String nameClient = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birthday(dd/MM/yyyy): ");
        String birthday = sc.nextLine();
        System.out.println();
        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        String status = sc.nextLine();
        Order o = new Order(new Date(), OrderStatus.valueOf(status), new Client(sdf.parse(birthday), nameClient, email));
        System.out.println("How many items? ");
        Integer n = sc.nextInt();
        sc.nextLine();
        for (int i = 1 ; i<=n; i++){
            System.out.println("Enter item #"+i+" data: ");
            System.out.print("Product name: ");
            String nameProduct = sc.nextLine();
            System.out.print("Product price: ");
            Double price = sc.nextDouble();
            System.out.print("Quantity: ");
            Integer quantity = sc.nextInt();
            o.addItem(new OrderItem(quantity, new Product(nameProduct, price)));
            sc.nextLine();
        }
        System.out.println("ORDER SUMARY:");
        System.out.println(o);
        sc.close();
    
        


    }
}