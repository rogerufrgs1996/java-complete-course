package applicattion;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Reservation;

public class Program{
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Room number: ");
        int roomNumber = sc.nextInt();
        System.out.print("Check-in date (dd/MM/yyyy): ");
        String checkIn = sc.next();
        System.out.print("Check-out date (dd/MM/yyyy): ");
        String checkOut = sc.next();

        if(!sdf.parse(checkOut).after(sdf.parse(checkIn))){
            System.out.println("Error in reservation: Check out date must be after check-in date");
        }
        else{
            Reservation reservation = new Reservation(roomNumber, sdf.parse(checkIn), sdf.parse(checkOut));
            System.out.println("Reservation " + reservation);
        
            System.out.println();
            System.out.println("Enter data to update the reservation");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkIn = sc.next();
            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkOut = sc.next();

            Date now = new Date();
            if (sdf.parse(checkIn).before(now)|| sdf.parse(checkOut).before(now))
                System.out.println("Error in reservation: Reservation dates must be future");
            else if(!sdf.parse(checkOut).after(sdf.parse(checkIn))){
                System.out.println("Error in reservation: Check out date must be after check-in date");
            }
            else{
                reservation.updateDates(sdf.parse(checkIn), sdf.parse(checkOut));
                System.out.println(reservation);
            }    
        }
    sc.close();
    }
}