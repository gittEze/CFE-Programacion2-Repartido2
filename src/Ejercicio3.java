import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("If (cifras");

        System.out.println("Ingrese un valor del 0 al 999");
        int num = leer.nextInt();

        if (num >= 0 && num <= 9){
            System.out.printf(num + " es un numero de 1 cifra");
        } else if (num >= 10 && num <= 99) {
            System.out.println(num + " es un numero de 2 cifras");
        } else if (num >= 100 && num <= 999) {
            System.out.println(num + " es un numero de 3 cifras");
        }

    }
}
