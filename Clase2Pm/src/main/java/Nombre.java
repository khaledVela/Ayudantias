import java.util.Scanner;

public class Nombre {
    public static void main(String[] args) {
        String tex;
        String nombre;
        String inver;
        String nuevo = "";
        int num;
        Scanner teclado = new Scanner(System.in);

        System.out.println("ingresa tu nombre");
        tex = teclado.nextLine();
        num = tex.indexOf(" ");
        nombre=tex.substring(0, num);
        tex = tex.substring(num+1);
        System.out.println(nuevo);
        num = tex.indexOf(" ");
        inver = tex.substring(num+1);
        tex=tex.substring(0, num);
        System.out.println(inver+" "+tex+ " "+nombre);
    }
}
