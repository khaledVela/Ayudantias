import java.util.Scanner;

public class Swic {
    public static void main(String[] args) {
        int var;
        boolean verificador = false;
        Scanner teclado = new Scanner(System.in);
        while (verificador != true) {
            System.out.println("ingrese un numero y vea que pasa");
            var = teclado.nextInt();
            switch (var) {
                case 1:
                    System.out.println("Ganaste 1000$");
                    break;
                case 2:
                    System.out.println("Perdiste todo");
                    verificador=true;
                    break;
                case 3:
                    System.out.println("Ganaste la isla");
                    break;
            }
        }
        System.out.println("Fin");
    }
}
