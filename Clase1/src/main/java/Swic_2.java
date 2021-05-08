import java.util.Scanner;

public class Swic_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String palabra;
        boolean veri = false;
        float factura = 0;
        while (veri != true) {
            System.out.println("ingrese una palabra");
            palabra = teclado.nextLine();
            switch (palabra.toLowerCase()) {
                case "empanada":
                    System.out.println("compraste una empanada");
                    factura += 2.50;
                    break;
                case "api":
                    System.out.println("compraste un api");
                    factura += 5;
                    break;
                case "salir":
                    veri = true;
                    System.out.println("su monto es: " + factura);
                    break;
                default:
                    System.out.println("no pediste nada");
                    break;
            }
        }
    }
}