import java.util.Scanner;

public class Funciones {
    public Funciones(){
        int numero1;
        int numero2;
        System.out.println("ingrese un numero");
        numero1 = trie();
        numero2 = trie();
        System.out.println(suma(numero1, numero2));
        System.out.println("ingresa un numero");
        numero1 = trie();
        System.out.println("el numero es par : " + par(numero1));
        System.out.println("ingresa un numero");
        numero1=trie();
        System.out.println("el numero es par : " + par(numero1));
    }

    public int suma(int n1, int n2) {
        int suma = n1 + n2;
        return suma;
    }

    public boolean par(int n1) {
        boolean veri = false;
        if (n1 % 2 == 0) {
            veri = true;
        }
        return veri;
    }

    public int trie() {
        int n1 = 0;
        try {
            String letra;
            Scanner teclado = new Scanner(System.in);
            letra = teclado.nextLine();
            n1 = Integer.parseInt(letra);
        } catch (Exception e) {
            System.out.println(e);
        }
        return n1;
    }
}
