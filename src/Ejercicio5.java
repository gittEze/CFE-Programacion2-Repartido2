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

        if ((peso/(altura*altura)) < 18.5) {
            System.out.println("Bajo peso");
        } else if ((peso/(altura*altura)) >= 18.5 && ((peso/(altura*altura)) <= 24.9)) {
            System.out.println("Peso normal");
        } else if ((peso/(altura*altura)) >= 25 && ((peso/(altura*altura)) <= 29.9)) {
            System.out.println("Sobrepeso");
        } else if ((peso/(altura*altura)) >= 30) {
            System.out.println("Obesidad");
        }

    }
}
