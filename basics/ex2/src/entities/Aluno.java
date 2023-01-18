package entities;

public class Aluno {
    public String name;
    public double n1;
    public double n2;
    public double n3;
    public double calculoNotaFinal(){
        return n1 + n2 + n3;
    }
    public double calculoNotaPassar(){
        return 60 - calculoNotaFinal();
    }
}
