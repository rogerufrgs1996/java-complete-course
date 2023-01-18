package entities;



import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
    private OrderStatus status;
    private Client client;
    private Date moment;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private List<OrderItem> items = new ArrayList<>();
    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }
    
    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }
    public void setStatus(OrderStatus status) {
        this.status = status;
    }
    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }
    public List<OrderItem> getItems() {
        return items;
    }
    public void addItem(OrderItem item){
        items.add(item);
    }
    public void removeItem(OrderItem item){
        items.remove(item);
    }
    public double total(){
        double sum = 0;
        for(OrderItem o : items){
            sum= sum + o.subTotal();
        }
        return sum;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: "+ sdf1.format(moment)+ "\n");
        sb.append("Order status: ");
        sb.append(status + "\n");
        sb.append("Client: "+ client.getName() +" ("+sdf.format(client.getBirthday())+")"+ " - "+ client.getEmail()+ "\n");
        sb.append("Order items \n");
        for(OrderItem o : items){
            sb.append(o.getProduct().getName()+", $"
            +String.format("%.2f", o.getProduct().getPrice()) + ", Quantity: "
            +o.getQuantity()+", Subtotal: $"+String.format("%.2f", o.subTotal())
            +"\n");
        }
        sb.append("Total price: $" + String.format("%.2f", total()));
        return sb.toString();


    }



}
