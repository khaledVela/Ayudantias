import java.util.Scanner;

public class Series {
    //0,1,1,2,3,5,8,13,21
    public static void main(String[] args) {
        int numero;
        int anterior = 0;
        int actual = 1;
        Scanner teclado = new Scanner(System.in);
        System.out.println("cunatos numeros de la serie desea ver??");
        numero = teclado.nextInt();
        System.out.print(anterior + ",");
        System.out.print(actual + ",");
        for (int i = 0; i < numero - 2; i++) {
            anterior = actual + anterior;//0+1,3
            actual = anterior + actual;//0+1,2
            System.out.print(anterior + "," + actual + ",");//1
            i++;
        }
    }
}
