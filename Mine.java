import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        Random random = new Random();

        // Random integer (any int)
        int anyInt = random.nextInt();
        System.out.println("Random integer: " + anyInt);

        // Random integer between 0 and 99
        int boundedInt = random.nextInt(100);
        System.out.println("Random integer (0-99): " + boundedInt);

        // Random double between 0.0 and 1.0
        double randDouble = random.nextDouble();
        System.out.println("Random double: " + randDouble);

        // Random boolean
        boolean randBool = random.nextBoolean();
        System.out.println("Random boolean: " + randBool);
    }
}
