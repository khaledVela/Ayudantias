import com.sun.security.jgss.GSSUtil;

import java.util.Locale;
import java.util.Scanner;

public class NotasMalas {
    //0-5 p
    //6-10 m
    //11-14 r
    //15-17 b
    //18-20 e

    public static void main(String[] args) {
        //Variables

        Scanner teclado = new Scanner(System.in);
        boolean veri = false;
        boolean veri2 = false;
        int nota = 0;
        String tri="";

        // inicio

        System.out.println("Ingrese un estudiante, o presione S para salir");
        while (veri2 == false) {
            while (veri == false) {
                System.out.println("Ingresa la nota");
                try {
                    tri = teclado.nextLine();
                    nota = Integer.parseInt(tri);
                    if ((nota >= 0) && (nota <= 20)) {
                        veri= true;
                    }else{
                            System.out.println("los numeros ingresados tienen que estar entre el 0 y el 20");
                        }
                } catch (Exception e) {
                    if (tri.toLowerCase().equals("salida")) {
                        System.out.println("Salio del programa");
                        veri2= true;
                        nota=21;
                        veri= true;
                    }else{
                        System.out.println(e);
                    }
                }
            }
            if ((nota >= 0) && (nota <= 5)) {
                System.out.println("Su alumno es Pesimo");
            }
            if ((nota >= 6) && (nota <= 10)) {
                System.out.println("Su alumno es Malo");
            }
            if ((nota >= 11) && (nota <= 14)) {
                System.out.println("Su alumno es Regular");
            }
            if ((nota >= 15) && (nota <= 17)) {
                System.out.println("Su alumno es Bueno");
            }
            if ((nota >= 18) && (nota <= 20)) {
                System.out.println("Su alumno es Excelente");
            }
            veri = false;
        }
    }
}
