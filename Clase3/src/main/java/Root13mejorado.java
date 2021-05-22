import java.util.Scanner;

public class Root13mejorado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nuevo = "";
        String palabra;
        String letra;
        String prim = "abcdefghijklm";
        String sec =  "nopqrstuvwxyz";
        int num;
        int cop;
        System.out.println("ingrese una palabra");
        palabra = teclado.nextLine();
        num = palabra.length();
        for (int i = 0; i < num; i++) {
            letra = palabra.substring(i, i + 1);
            cop = prim.indexOf(letra);
            if (cop == -1) {
                cop = sec.indexOf(letra);
                if(cop>-1){
                    letra = prim.substring(cop, cop + 1);
                }
            } else {
                letra = sec.substring(cop, cop + 1);
            }
            nuevo=nuevo+letra;
        }
        System.out.println(nuevo);
    }
}