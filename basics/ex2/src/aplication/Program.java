package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Program {
    public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    Aluno a = new Aluno();
    System.out.println("Name:");
    a.name= sc.nextLine();
    System.out.println("nota1:");
    a.n1 = sc.nextDouble();
    System.out.println("nota2:");
    a.n2 = sc.nextDouble();
    System.out.println("nota3:");
    a.n3 = sc.nextDouble();
    if(a.calculoNotaFinal()>=60){
        System.out.print("PASSOU! NOTA - >"+a.calculoNotaFinal());
    }
    else{
        System.out.print("RODOU! NOTA - >"+a.calculoNotaFinal()+"  FALTAM - >"+a.calculoNotaPassar()+" PARA ATINGIR MEDIA");
    }
    sc.close();
        
    }
        
    
}
