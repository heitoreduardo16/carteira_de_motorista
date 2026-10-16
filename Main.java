import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.println(" Quantos anos você tem?");
        var age = scanner.nextInt();

        System.out.printf("Você é emancipado?");
        var emancipado = scanner.nextBoolean();

        var canDrive = age >= 18 && (emancipado && age >= 16);

        System.out.printf("Você pode dirigir? %b", canDrive);

    }
}