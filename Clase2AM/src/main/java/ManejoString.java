import java.util.Scanner;

public class ManejoString {
    public static void main(String[] args) {
        String letra;
        String copia;
        int numero;
        float decimal;
        boolean veri;
        Scanner teclado = new Scanner(System.in);



        //Transformacion numero String - entero
        System.out.println("entero");
        letra=teclado.nextLine();
        numero=Integer.parseInt(letra);
        System.out.println("numero "+numero);
        letra=numero+"";

        //Transformacion de String - decimal
        System.out.println("decimal");
        letra=teclado.nextLine();
        decimal = Float.parseFloat(letra);
        System.out.println("decimal "+decimal);

        //Transformacion de String - boolean
        System.out.println("boolean ");
        letra=teclado.nextLine();
        veri = Boolean.parseBoolean(letra);
        System.out.println("boolean " + veri);

        // Mayusculas
        System.out.println("minusculas");
        letra=teclado.nextLine();
        letra=letra.toUpperCase();
        System.out.println(letra);

        // Minusculas
        System.out.println("MAYUSCULAS");
        letra=teclado.nextLine();
        letra=letra.toLowerCase();
        System.out.println(letra);

        //Copiar porcion de cadena
        System.out.println("copia");
        letra= teclado.nextLine();
        copia=letra.substring(1, 2);
        System.out.println("la copia es: "+copia);

        //Saber la longitud de la cadena
        System.out.println("longitud");
        letra= teclado.nextLine();
        numero=letra.length();
        System.out.println("la longitud es: "+ numero);

        // Concatenacion
        System.out.println("Concatenacion");
        letra=teclado.nextLine();//sergg
        letra=letra + "gfsg";        //sergg+gfsg =sergggfsg
        System.out.println("concatenacion letra + string: "+letra);
        System.out.println("numero");
        numero= teclado.nextInt();
        letra=numero + letra ;//15 + sergggfsg= 15sergggfsg
        System.out.println("concatenacion de numero + letra: " + letra);
        System.out.println(letra.substring(0,2));

        //Buscar la posicison de la letra
        System.out.println("Posicion");
        letra= teclado.nextLine();
        numero= letra.indexOf("a");
        System.out.println("la posicion de la primera letra a es: "+numero);

        // uso del Split
        System.out.println("split");
        letra= teclado.nextLine();
        String separa[]=letra.split(" ");
        for (int i=0; i<separa.length;i++){
            System.out.println(separa[i]);
        }
    }

}
