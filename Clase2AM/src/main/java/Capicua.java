import java.util.Scanner;

public class Capicua {
    public static void main(String[] args) {
        String numero="";
        String letra;
        String capi="";
        int num=0;
        boolean veri= false;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        while (veri == false) {
            System.out.println("Ingresa el numero 1");
            try {
                numero = teclado.nextLine();
                num = Integer.parseInt(numero);//1516
                veri = true;
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("ingresa solo numeros");
            }
        }
        num=numero.length();//4
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
