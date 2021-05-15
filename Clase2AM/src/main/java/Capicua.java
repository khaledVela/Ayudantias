import java.util.Scanner;

public class Capicua {
    public static void main(String[] args) {
        String numero;
        String letra;
        String capi="";
        int num;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        numero= teclado.nextLine();
        num=numero.length();
        for (int i = num; i >0; i--) {
            letra= numero.substring(i-1, i);
            capi=capi + letra;
        }
        if(capi.equals(numero)){
            System.out.println("son Capicuas");
        }else{
            System.out.println("No son Capicuas");
        }
    }
}
