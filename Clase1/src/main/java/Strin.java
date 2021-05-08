import java.util.Locale;
import java.util.Scanner;

public class Strin {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String palabra;
        String palabra2;
        System.out.println("Ingrese dos palabras");
        palabra=teclado.nextLine();
        palabra2=teclado.nextLine();
        //.toLowerCase() -- tranformar todo a minusculas
        //.toUperCase() -- tranformar todo a mayusculas
        //.equals(otro Stirng) -- compara dos string
        if(palabra.equals(palabra2)){
            System.out.println("son iguales");
        }else{
            System.out.println("no son iguales");
        }
        palabra=palabra.toUpperCase();
        System.out.println(palabra);
        palabra2=palabra2.toLowerCase();
        System.out.println(palabra2);
        if(palabra.toLowerCase().equals(palabra2.toLowerCase())){
            System.out.println("son iguales");
        }else{
            System.out.println("no son iguales");
        }
    }
}

