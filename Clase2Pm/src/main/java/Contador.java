import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        String llave="aeiou";
        String tex;
        String letra;
        int num;
        int cop;
        int contador=0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese el texto");
        tex = teclado.nextLine();
        num = tex.length();
        for (int i = 0; i < num; i++) {
            letra = tex.substring(i, i + 1);
            cop=llave.indexOf(letra);
            if(cop>-1){
                contador++;
            }
        }
        System.out.println("la palabra tiene: "+contador +" vocales");
    }
}
