import javax.naming.ldap.PagedResultsControl;
import java.util.Scanner;

public class Arenas {
    public static void main(String[] args) {
        int numero=0;
        int aux;
        int par = 0;
        boolean veri = false;
        Scanner teclado = new Scanner(System.in);
        while (veri == false) {
            System.out.println("Ingrese un numero impar mayor a 5");
            numero = teclado.nextInt();
            if ((numero % 2 != 0) && (numero > 5)) {
                veri = true;
            }
        }
        aux = numero;//7
        for (int i = 0; i <= aux / 2; i++) {//4
            for (int k = 0; k < par; k++) {
                System.out.print(" ");
            }
            for (int j = numero; j > 0; j--) {
                System.out.print(i + 1);
            }
            numero -= 2;
            par += 1;
            System.out.println();
        }
        numero = par - 1;
        par -= 2;
        for (int i = 2; i <= aux; i += 2) {
            for (int k = 0; k < par; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(numero);
            }
            numero--;
            par--;
            System.out.println();
        }
    }

}
