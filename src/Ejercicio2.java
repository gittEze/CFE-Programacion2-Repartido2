import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Valor par o impar");

        System.out.println("Ingrese un valor");
        int num = leer.nextInt();

        if (num % 2 == 0) {
            System.out.printf(num + " es un numero par");
        } else {
            System.out.println(num + " es un numero impar");
        }

    }
}
