import java.util.*;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.println("Hello " + name.nextLine() + "!");

        Map<Double, Double> results = new HashMap<>();
        double angle = 0.0;
        double radians;

        for (int i = 0; i <= 9; ++i) {
            radians = Math.toRadians(angle);
            results.put(angle, Math.sin(radians));
            angle += 5;
        }

        System.out.println("-----------------------------");
        System.out.printf("%6s %6s", "Angle", "Mean");
        System.out.println();
        System.out.println("-----------------------------");
        for (Map.Entry<Double, Double> result : results.entrySet()){
            System.out.format(" %-5s | %-15s\n", result.getKey(), result.getValue());
        }
    }
}
