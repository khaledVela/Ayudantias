import java.util.Scanner;

public class CosasNuevas {
    int numero;
    int numero2;
    Scanner teclado = new Scanner(System.in);
    public CosasNuevas(){
        System.out.println("Primeras Funciones");
        System.out.println();
        cosa();
    }
    public int trie() {
        int n1 = 0;
        try {
            String letra;
            letra = teclado.nextLine();
            n1 = Integer.parseInt(letra);
        } catch (Exception e) {
            System.out.println(e);
        }
        return n1;
    }
    public void cosa(){
        System.out.println("\u001B[31mIngresa un numero para ver si es capicua\u001B[37m");
        numero=trie();
        if(esCapicua(numero)==true){
            System.out.println("es capicua");
        }else{
            System.out.println("no es capicua");
        }
        System.out.println("ingrese un numero para ver si es capicua");
        numero2=trie();
        if(esCapicua(numero2)==true){
            System.out.println("es capicua");
        }else{
            System.out.println("no es capicua");
        }
        System.out.println(numero+"|"+numero2);
    }

    public boolean esCapicua(int a) {
        boolean veri=false;
        int aux=a;
        int inverso=0;
        while(a!=0) {
            int cifra = a % 10;
            inverso = inverso * 10 + cifra;
            a = a / 10;
        }
        if(inverso==aux){
            veri=true;
        }
        return veri;
    }

    public static void main(String[] args) {
     new CosasNuevas();
    }
}
