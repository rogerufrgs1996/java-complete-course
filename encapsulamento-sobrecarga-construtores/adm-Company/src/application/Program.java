package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Funcionario;
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int escolha = 1 ;
        List<Funcionario> funcionario = new ArrayList<>();
        while(escolha > 0){
            System.out.println("###########MENU############ ");
            System.out.println("1 - Cadastrar funcionario ");
            System.out.println("2 - Aumentar salario ");
            System.out.println("3 - Consultar funcionario ");
            System.out.println("4 - Lista de funcionarios ");
            System.out.println("5 - Demitir funcionario ");
            System.out.println("6 - Alterar cargo de funcionario ");
            System.out.println("0 - SAIR ");
            System.out.print("Digite a numero da opcao ");
            escolha = sc.nextInt();
            while(escolha > 6){
                System.out.println("OPCAO INVALIDA!! Tente novamente.");
                escolha = sc.nextInt();
            }
            System.out.println("##########################################################");
            switch(escolha){
                case 1: 
                    cadastrarFuncionario(funcionario, sc);
                    break;
                case 2:
                    aumentarSalario(funcionario, sc);
                    break;
                case 3:
                    consultarFuncionario(funcionario, sc);
                    break;
                case 4:
                    for(Funcionario x:funcionario){
                        System.out.println("FUNCIONARIO #" + (funcionario.indexOf(x) + 1));
                        System.out.println(x);
                        System.out.println("________________________concluido___________________________");
                    }
                    break;
                case 5:
                    demitirFuncionario(funcionario, sc);
                    break;
                case 6:
                    mudarCargoFuncionario(funcionario, sc);
                    break;
                default:
                    System.out.println("________________________PROGRAMA FINALIZADO___________________________");
            }
        }
        sc.close();
    }

    public static Funcionario buscaFuncionario(List<Funcionario> funcionario, int id){
            Funcionario f = funcionario.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
            return f;
    }
    public static void cadastrarFuncionario(List<Funcionario> funcionario, Scanner sc){
            System.out.print("Digite numero de funcionarios que deseja cadastrar? ");
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                System.out.print("Digite ID: ");
                int id = sc.nextInt();
                while(buscaFuncionario(funcionario, id) != null){
                    System.out.println("ID JA EXISTE NO SISTEMA! Tente novamente. ");
                    id = sc.nextInt();
                }
                sc.nextLine();
                System.out.print("Digite nome: ");
                String nome = sc.nextLine();
                System.out.print("Digite cargo: ");
                String cargo = sc.nextLine();
                System.out.print("Digite salario: ");
                double salario = sc.nextDouble();
                Funcionario f = new Funcionario(nome, salario, id,cargo);
                funcionario.add(f);
                System.out.println("_______________________concluido____________________________");
                sc.nextLine();
            }
    }
    public static void aumentarSalario(List<Funcionario> funcionario, Scanner sc){
        if(funcionario.size() != 0){
            System.out.print("Digite a ID do funcionario que recebera aumento -> ");
            int id = sc.nextInt();
            while(buscaFuncionario(funcionario, id)== null){
                System.out.println("ESTE FUNCIONARIO NAO EXISTE!! Tente novamente.");
                id = sc.nextInt();
            }
            System.out.println("Funcionario escolhido-> "+buscaFuncionario(funcionario, id));
            System.out.print("Digite a porcentagem de aumento? ");
            double porcentagem = sc.nextDouble();
            buscaFuncionario(funcionario, id).aumentoSalario(porcentagem);;
            System.out.println("_________________________concluido_________________________");
        }
        else{
            erro();
        }   
            
    }
    public static void consultarFuncionario(List<Funcionario> funcionario, Scanner sc){
        if(funcionario.size() != 0){   
            System.out.print("Digite a ID do funcionario que quer consultar -> ");
            int id = sc.nextInt();
            while(buscaFuncionario(funcionario, id)== null){
                System.out.println("ESTE FUNCIONARIO NAO EXISTE!! Tente novamente.");
                id = sc.nextInt();
            }
            System.out.println("CONSULTA-> "+buscaFuncionario(funcionario, id));
            System.out.println("______________________concluido________________________");  
        }
        else{
            erro();
        } 
    }  
    public static void demitirFuncionario(List<Funcionario> funcionario, Scanner sc){
        if(funcionario.size() != 0){      
            System.out.print("Digite a ID do funcionario que quer demitir -> ");
            int id = sc.nextInt();
            while(buscaFuncionario(funcionario, id)== null){
                System.out.println("ESTE FUNCIONARIO NAO EXISTE!! Tente novamente.");
                id = sc.nextInt();
            }
            System.out.println("FUNCIONARIO DEMITIDO-> "+buscaFuncionario(funcionario, id));
            funcionario.remove(buscaFuncionario(funcionario, id));
            System.out.println("______________________concluido________________________");  
        }
        else{
            erro();
        } 
    }
    public static void mudarCargoFuncionario(List<Funcionario> funcionario, Scanner sc){
        if(funcionario.size() != 0){       
            System.out.print("Digite a ID do funcionario que quer mudar de cargo -> ");
            int id = sc.nextInt();
            while(buscaFuncionario(funcionario, id)== null){
                System.out.println("ESTE FUNCIONARIO NAO EXISTE!! Tente novamente.");
                id = sc.nextInt();
            }
            System.out.println("FUNCIONARIO SELECIONADO-> "+buscaFuncionario(funcionario, id));
            System.out.print("Digite novo cargo -> ");
            sc.nextLine();
            String cargo = sc.nextLine();
            buscaFuncionario(funcionario, id).setCargo(cargo);
            System.out.println("________________________concluido______________________");  
        }
        else{
            erro();
        } 
    }
    public static void erro(){
        System.out.println("_________________________SEM FUNCIONARIOS CADASTRADOS_________________________");
    }                       
}