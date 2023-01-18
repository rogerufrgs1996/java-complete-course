import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        LocalDate d1 = LocalDate.now();
        System.out.println(d1);
        LocalDateTime d2 = LocalDateTime.now();
        System.out.println(d2);
        Instant d3 = Instant.now();
        System.out.println(d3);
    }
}
