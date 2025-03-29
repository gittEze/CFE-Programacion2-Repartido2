import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Numeor positivo o negativo");

        System.out.println("Ingrese un valor");
        int num = leer.nextInt();

        if (num > 0) {
            System.out.printf(num + " es un numero positivo");
        } else if (num < 0) {
            System.out.println(num + " es un numero negativo");
        } else {
            System.out.println(num + " es neutro");
        }

    }
}
