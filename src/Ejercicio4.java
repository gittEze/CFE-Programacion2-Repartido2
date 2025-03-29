import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Mayor valor");

        System.out.println("Ingrese el primer valor");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo valor");
        int num2 = leer.nextInt();
        System.out.println("Ingrese el tercer valor");
        int num3 = leer.nextInt();

        if (num1 > num2 && num1 > num3){
            System.out.printf(num1 + " es el mayor valor");
        } else if (num2 > num1 && num2 > num3){
            System.out.printf(num2 + " es el mayor valor");
        } else {
            System.out.printf(num3 + " es el mayor valor");
        }

    }
}
