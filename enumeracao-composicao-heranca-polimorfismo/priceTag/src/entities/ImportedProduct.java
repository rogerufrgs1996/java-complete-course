package entities;

public class ImportedProduct extends Product {
    private double customsFee;
    
    public ImportedProduct(){
    }
    public ImportedProduct(String name, double price, double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }
    public double getCustomsFee() {
        return customsFee;
    }
    public void setCustomsFee(double customsFee) {
        this.customsFee = customsFee;
    }
    @Override
    public String priceTag(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.getName() + " $ "
         + String.format("%.2f", totalPrice())
         + " (Customs fee: $ "+ customsFee+")");
        return sb.toString();
    }
    public double totalPrice(){
        return super.getPrice() + customsFee;
    }
    
    
}
