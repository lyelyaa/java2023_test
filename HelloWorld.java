import java.util.*;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.println("Hello " + name.nextLine() + "!");

        ArrayList<Double> angles = new ArrayList<>();
        ArrayList<Double> means = new ArrayList<>();
        double angle = 0.0;
        double radians;

        for (int i = 0; i <= 9; ++i) {
            angles.add(angle);
            radians = Math.toRadians(angle);
            means.add(Math.sin(radians));
            angle += 5;
        }

        System.out.println("-----------------------------");
        System.out.printf("%6s %6s", "Angle", "Mean");
        System.out.println();
        System.out.println("-----------------------------");

        for (int i = 0; i <= 9; ++i) {
            System.out.format(" %-5s | %-15s\n", angles.get(i), means.get(i));
        }
    }
}
