import java.util.Scanner;

public class ClaveCodigo {
    public static void main(String[] args) {
        String llave="";
        String numero = "0123456789";
        String tex;
        String letra;
        String nuevo="";
        int num;
        int cop;
        boolean veri = false;
        Scanner teclado = new Scanner(System.in);
        while (veri == false) {
            System.out.println("ingrese la llave para cifrado");
            llave = teclado.nextLine();
            if ((llave.length() <= 10)&&(llave.length()>0)) {
                veri = true;
            }
        }
        System.out.println("ingrese el texto");
        tex = teclado.nextLine();
        num = tex.length();
        for (int i = 0; i < num; i++) {
            letra = tex.substring(i, i + 1);
            cop=llave.indexOf(letra);
            if(cop>-1){
                letra= numero.substring(cop,cop+1);
            }
            nuevo=nuevo+letra;
        }
        System.out.println(nuevo);
    }
}
//murcielago
//0123456789