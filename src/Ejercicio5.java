import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("If (IMC)");

        System.out.println("Ingrese su peso");
        float peso = leer.nextFloat();
        System.out.println("Ingrese su altura");
        float altura = leer.nextFloat();

        System.out.println("El IMC es : " + (peso/(altura*altura)));

    }
}
