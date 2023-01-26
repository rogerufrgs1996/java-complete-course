package entities;

public class LegalEntity extends Person {
    private int employees;

    public LegalEntity() {
        super();
    }

    public LegalEntity(String name, double annualIncome, int employees) {
        super(name, annualIncome);
        this.employees = employees;
    }

    public int getEmployees() {
        return employees;
    }

    public void setEmployees(int employees) {
        this.employees = employees;
    }
    @Override
    public double tax(){
        if(employees>10){
            return getAnnualIncome()*0.14;
        }
        else{
            return getAnnualIncome()*0.16;
        }
    }
    
}
