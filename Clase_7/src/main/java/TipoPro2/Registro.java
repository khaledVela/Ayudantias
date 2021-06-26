package TipoPro2;

import java.util.ArrayList;
import java.util.Scanner;

public class Registro {
    ArrayList<Alumo> lista = new ArrayList();
    int numero;
    boolean fin = false;
    Scanner teclado = new Scanner(System.in);
    public Registro() {
        System.out.println("Bienvenido Ing");
        while (!fin) {
            menu();
            numero = tri();
            switch (numero) {
                case 1:
                    for (int i = 0; i < lista.size(); i++) {
                        System.out.print((i + 1) + ".-");
                        System.out.print("Nombre: " + lista.get(i).getNombre());
                        System.out.print(" Apellido: " + lista.get(i).getApellido());
                        System.out.println();

                    }
                    System.out.println("Que alumno desea ver notas");
                    numero = tri() - 1;
                    System.out.println("Primero: " + lista.get(numero).getPrimero());
                    System.out.println("Segundo: " + lista.get(numero).getSegundo());
                    System.out.println("Tercero: " + lista.get(numero).getTercero());
                    break;
                case 2:
                    Alumo alumo = new Alumo();
                    lista.add(alumo);
                    break;
                case 3:
                    for (int i = 0; i < lista.size(); i++) {
                        System.out.print((i + 1) + ".-");
                        System.out.print("Nombre: " + lista.get(i).getNombre());
                        System.out.print("Apellido: " + lista.get(i).getApellido());
                        System.out.println();
                    }
                    System.out.println("Que alumno desea editar el promedio");
                    numero = tri() - 1;
                    System.out.println("Promedio: " + lista.get(numero).getPromedio());
                    break;
                case 4:
                    numero=0;
                    int cont=0;
                    for (int i = 0; i < lista.size(); i++) {
                        numero += lista.get(i).getPromedio();
                        cont++;
                    }
                    System.out.println("el promedio de la clase es: "+ (numero)/cont);

                    break;
                case 5:
                    fin = true;
                    System.out.println("nos vemos el proximo semestre");
                    break;
            }
            teclado.nextLine();
        }
    }

    public void menu() {
        System.out.println(" 1• Ver notas de un estudiante\n" +
                " 2• Agregar estudiante y notas\n" +
                " 3• Ver promedio del estudiante\n" +
                " 4• Ver promedio de la materia\n" +
                " 5• Salir");
        System.out.println("Que desea realizar?, ingrese un numero");
    }

    public int tri() {
        int numero = 0;
        String letra;
        boolean esNumero = false;
        while (!esNumero) {
            try {
                letra = teclado.nextLine();
                numero = Integer.parseInt(letra);
                if (numero > 0 && numero < 6) {
                    esNumero = true;
                } else {
                    System.out.println("ingrese numeros entre el 1 y el 5");
                }
            } catch (Exception e) {
                System.out.println("no ingrese letras solo numeros");
            }

        }
        return numero;
    }
}
