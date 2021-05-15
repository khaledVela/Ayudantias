import java.util.Scanner;

public class SustitucionDePares {
    public static void main(String[] args) {
        String letra;
        String palabra;
        String nuevo="";
        int numero;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese una palabra");
        palabra = teclado.nextLine();
        numero = palabra.length();
        for (int i = 0; i < numero; i++) {
            letra = palabra.substring(i, i + 1);
            if(i%2!=0){
                letra="*";
            }
            nuevo=nuevo+letra;
        }
        System.out.println(nuevo);
    }
}
