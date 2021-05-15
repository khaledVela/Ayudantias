import java.util.Scanner;

public class DeTodoUnPoco {
    public static void main(String[] args) {
        // variables

        Scanner teclado = new Scanner(System.in);
        String numero;
        int numero1 = 0;
        int numero2 = 0;
        int numero3 = 0;
        int aux=0;
        boolean veri = false;

        // inicio

        while (veri == false) {
            System.out.println("Ingresa el numero 1");
            try {
                numero = teclado.nextLine();
                numero1 = Integer.parseInt(numero);
                veri = true;
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        veri = false;
        while (veri == false) {
            System.out.println("Ingresa el numero 2");
            try {
                numero = teclado.nextLine();
                numero2 = Integer.parseInt(numero);
                veri = true;
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        veri = false;
        while (veri == false) {
            System.out.println("Ingresa el numero 3");
            try {
                numero = teclado.nextLine();
                numero3 = Integer.parseInt(numero);
                veri = true;
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        aux = numero2;//4
        numero2 = numero1;//5
        numero1 = numero3;//3
        numero3 = aux;//4
        System.out.println("El numero 1 es: " + numero1);
        System.out.println("El numero 2 es: " + numero2);
        System.out.println("El numero 3 es: " + numero3);
    }
}
