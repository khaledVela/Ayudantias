import java.util.Scanner;

public class RepetidorLetras {
    public static void main(String[] args) {
        String tex;
        String letra;
        String nuevo = "";
        int num;
        Scanner teclado = new Scanner(System.in);

        System.out.println("ingresa tu palabra a repetir");
        tex = teclado.nextLine();
        num = tex.length();
        for (int i = 0; i < num; i++) {
            letra = tex.substring(i, i + 1);//hol
            for (int j = 0; j < i +1; j++) {//hoolll
                nuevo=nuevo+letra;
            }
        }
        System.out.println(nuevo);
    }
}
