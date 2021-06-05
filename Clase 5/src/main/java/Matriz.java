import java.util.Scanner;

public class Matriz {
    int num[] = new int[3];
    String letras[] = new String[3];
    String palabras[];
    Scanner teclado = new Scanner(System.in);
    int nume;

    public Matriz() {
        System.out.println("cuantos alumnos tiene");
        nume = teclado.nextInt();
        palabras = new String[nume];
        System.out.println(palabras.length);//muestro la cantidad en la lista
        System.out.println("ingrese unos numeros");
        num[1] = teclado.nextInt();
        System.out.println(num[2]);
        System.out.println(num[1]);
        System.out.println("usamos la lista");
        palabras[0] = teclado.nextLine();
        palabras[0] = teclado.nextLine();
        System.out.println(palabras[0]);
        System.out.println(palabras[palabras.length - 1]);
        palabras[3] = "hola mundo";
        //String
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i] != null) {
                System.out.println(palabras[i] + " pos " + i);
            }
            if (palabras[i] == null) {
                palabras[i] = "ya es avaricia";
            }
        }
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i] != null) {
                System.out.println(palabras[i] + " pos " + (i + 1));
            }
        }
        //int
        for (int i = 0; i < num.length; i++) {
            if (num[i] != 0) {
                System.out.println(num[i] + " pos " + i);
            }
            if (num[i] == 0) {
                num[i]=teclado.nextInt();
            }
        }
        for (int i = 0; i < num.length; i++) {
            if (num[i] != 0) {
                System.out.println(num[i] + " pos " + i);
            }
        }
    }

    public static void main(String[] args) {
        new Matriz();
    }
}
