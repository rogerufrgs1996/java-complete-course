package entities;

public class Conta {
    private int numeroConta;
    private String nome;
    private double saldo;
    public Conta(int numeroConta, String nome) {
        this.numeroConta = numeroConta;
        this.nome = nome;
    }
    public Conta(int numeroConta, String nome, double primeiroDeposito){
        this.numeroConta = numeroConta;
        this.nome = nome;
        deposito(primeiroDeposito);
    }
    public int getConta() {
        return numeroConta;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSaldo() {
        return saldo;
    }
    public void deposito(double deposito){
        this.saldo+=deposito;
    }
    public void saque(double saque){
        this.saldo-=(saque+5);
    }
    public String toString(){
        return  " Numero da conta: "
                +numeroConta
                +", Nome: "
                +nome
                +", Saldo: "
                +saldo;
    }
}
