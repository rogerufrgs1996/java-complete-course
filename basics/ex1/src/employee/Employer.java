package employee;

public class Employer {
    public String name;
    public double salary;
    public double tax;

    public double netSalary(){
        return salary - tax;
    }
    public double increaseSalary(double percent){
        return salary*(1+(percent/100));
    }
}
