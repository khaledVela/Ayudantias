import java.util.Scanner;

public class Root13 {
    public static void main(String[] args) {
        String user;
        String letra;
        String palabra;
        String root13 = "";
        int numero;
        int contador = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("que desea hacer");
        user=teclado.nextLine();
        if(user.toLowerCase().equals("codificar")){
            user="el codigo codificado es: ";
        }
        if(user.toLowerCase().equals("descodificar")){
            user="el codigo descodificado es: ";
        }
        System.out.println("Ingrese una palabra");
        palabra = teclado.nextLine();
        numero = palabra.length();
        for (int i = 0; i < numero; i++) {
            letra = palabra.substring(i, i + 1);
            switch (letra.toLowerCase()) {
                case "a":
                    letra = "n";
                    break;
                case "b":
                    letra = "o";
                    break;
                case "c":
                    letra = "p";
                    break;
                case "d":
                    letra = "q";
                    break;
                case "e":
                    letra = "r";
                    break;
                case "f":
                    letra = "s";
                    break;
                case "g":
                    letra = "t";
                    break;
                case "h":
                    letra = "u";
                    break;
                case "i":
                    letra = "v";
                    break;
                case "j":
                    letra = "w";
                    break;
                case "k":
                    letra = "x";
                    break;
                case "l":
                    letra = "y";
                    break;
                case "m":
                    letra = "z";
                    break;
                case "n":
                    letra = "a";
                    break;
                case "o":
                    letra = "b";
                    break;
                case "p":
                    letra = "c";
                    break;
                case "q":
                    letra = "d";
                    break;
                case "r":
                    letra = "e";
                    break;
                case "s":
                    letra = "f";
                    break;
                case "t":
                    letra = "g";
                    break;
                case "u":
                    letra = "h";
                    break;
                case "v":
                    letra = "i";
                    break;
                case "w":
                    letra = "j";
                    break;
                case "x":
                    letra = "k";
                    break;
                case "y":
                    letra = "l";
                    break;
                case "z":
                    letra = "m";
                    break;
            }
            root13 = root13 + letra;
        }
        System.out.println(user +""+ root13);

        /* while (contador < numero) {
            letra = palabra.substring(contador, contador + 1);//0,1 1,2 2,3 3,4
            System.out.println(letra);
            contador++;
        }
        for (int i = 0; i < numero; i++) {
            letra = palabra.substring(i, i + 1);//0,1 1,2 2,3 3,4
            System.out.println(letra);
        }
        System.out.println(contador);
        contador = 0;
        while (contador < numero) {
            letra = palabra.substring(contador, contador + 1);//0,1 1,2 2,3 3,4
            System.out.println(letra);
            contador++;
        }
        */
    }
}
