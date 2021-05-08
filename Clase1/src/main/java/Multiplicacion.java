import java.util.Scanner;

public class Multiplicacion {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        int contador = 1;
        String conca;
        System.out.println("Ingrese un numero");
        numero = teclado.nextInt();
        while (contador <= numero) {
            for (int i = 1; i <= 10; i++) {
                conca = contador + "x" + i + "=";
                System.out.println(conca + contador * i);
            }
            contador++;
        }
    }
}
