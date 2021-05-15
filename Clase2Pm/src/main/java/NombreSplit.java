import java.util.Scanner;

public class NombreSplit {
    public static void main(String[] args) {
        String tex;
        String nombre;
        String inver;
        String nuevo = "";
        int num;
        Scanner teclado = new Scanner(System.in);

        System.out.println("ingresa tu nombre");
        tex = teclado.nextLine();
        String separa[]=tex.split(" ");
        num = separa.length;
        for (int i=num-1;i>=0;i--){
            nuevo= nuevo + " " + separa[i];
        }
        System.out.println(nuevo);
    }
}
