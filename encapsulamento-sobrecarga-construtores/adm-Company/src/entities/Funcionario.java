package entities;


public class Funcionario {
    private String nome;
    private double salario;
    private int id;
    private String cargo;
    public Funcionario(String nome, double salario, int id, String cargo) {
        this.nome = nome;
        this.salario = salario;
        this.id = id;
        this.cargo = cargo;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSalario() {
        return salario;
    }
    public void aumentoSalario(double porcentagem) {
        this.salario = salario*(1+(porcentagem/100));
    }
    public int getId() {
        return id;
    }
    public String toString(){
        return "ID-> "+ id+
        " , Nome-> "+ nome + 
        " , Cargo-> "+ cargo + 
        ", Salario-> R$"+ String.format("%.2f", salario);
    }
    
}
 
