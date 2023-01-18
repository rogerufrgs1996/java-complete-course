package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class Program {
     public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Comment c1 = new Comment("Have a nice trip! ");
        Comment c2 = new Comment("Good day");
        String x = "16/01/2023 09:13:15";
        Post p1 = new Post(sdf.parse(x), "Travelling to new zeland", "im going visit this beautiful country", 12);
        p1.addComment(c1);
        p1.addComment(c2);
        System.out.println(p1);

    





    }


} 
