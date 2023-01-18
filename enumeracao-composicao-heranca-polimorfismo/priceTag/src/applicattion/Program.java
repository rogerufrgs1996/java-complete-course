package applicattion;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        List<Product> pL = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            System.out.println("Product #"+i+" data");
            System.out.print("Common, used or imported (c/u/i)? ");
            char op = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            Double price = sc.nextDouble();
            if(op == 'i'){
                System.out.print("Customs fee: ");
                Double customsFee = sc.nextDouble();
                pL.add(new ImportedProduct(name, price, customsFee));
            }
            else if(op == 'u'){
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                String manufactureDate = sc.next();
                pL.add(new UsedProduct(name, price, sdf.parse(manufactureDate)));
            }
            else{
                pL.add(new Product(name, price));
            }
        }
        System.out.println();
        System.out.println("PRICE TAGS: ");
        for(Product p : pL){
            System.out.println(p.priceTag());
        }
        sc.close();    
    }
}
