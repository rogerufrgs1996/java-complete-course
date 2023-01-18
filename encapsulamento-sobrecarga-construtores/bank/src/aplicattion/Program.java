package aplicattion;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Conta c;
        System.out.print("Digite nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite numero da conta: ");
        int numeroConta = sc.nextInt();
        System.out.print("Deseja fazer primeiro deposito [y/n]: ");
        char resposta = sc.next().charAt(0);
        if (resposta == 'y'){
            System.out.println();
            System.out.print("Digite deposito inicial: ");
            double primeiroDeposito = sc.nextDouble();
            c = new Conta(numeroConta, nome, primeiroDeposito);
        }
        else{
            c = new Conta(numeroConta, nome);
        }
        System.out.println("Dados da conta: ");
        System.out.println(c);
        System.out.println();
        System.out.print("Valor deposito: ");
        double deposito = sc.nextDouble();
        c.deposito(deposito);
        System.out.println("Dados da conta atualizado: ");
        System.out.println(c);
        System.out.println();
        System.out.print("Valor saque: ");
        double saque = sc.nextDouble();
        c.saque(saque);
        System.out.println("Dados da conta atualizado: ");
        System.out.println(c);       
        
        
        sc.close();
    }
}
