package TipoPro1;

import TipoPro2.Alumo;

import java.util.ArrayList;
import java.util.Scanner;

public class RegistroP1 {
    String nombres[];
    int notas[][];
    int numero;
    boolean fin = false;
    Scanner teclado = new Scanner(System.in);

    public RegistroP1() {
        System.out.println("Bienvenido Ing");
        System.out.println("ingrese la cantidad de alumnos que tiene");
        numero = teclado.nextInt();
        nombres = new String[numero];
        notas = new int[4][numero];
        for (int i=0;i<nombres.length;i++){
            nombres[i]="";
        }
        while (!fin) {
            menu();
            numero = tri();
            switch (numero) {
                case 1:
                    list();
                    System.out.println("ingrese el numero del alumno");
                    numero=teclado.nextInt()-1;
                    System.out.println("Primero: " + notas[numero][0]);
                    System.out.println("Segundo: " + notas[numero][1]);
                    System.out.println("Final: " + notas[numero][2]);
                    break;
                case 2:
                    agregarEstudiante();
                    break;
                case 3:
                    list();
                    System.out.println("ingrese el numero del alumno");
                    numero=teclado.nextInt()-1;
                    System.out.println("Promedio: " + notas[numero][3]);
                    break;
                case 4:
                    int general=0;
                    int cont=0;
                    for (int i = 0; i < nombres.length; i++) {
                        if (!nombres[i].equals("")) {
                            general+=notas[i][3];
                            cont++;
                        }
                    }
                    System.out.println("El promedio de la materia es: "+ (general/cont));
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

    public void agregarEstudiante() {
        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].equals("")) {
                System.out.println("Ingrese nombre del alumno");
                nombres[i] = teclado.nextLine();
                System.out.println("Primer parcial");
                notas[i][0]=teclado.nextInt();
                System.out.println("Segundo parcial");
                notas[i][1]=teclado.nextInt();
                System.out.println("Final");
                notas[i][2]=teclado.nextInt();
                notas[i][3] = (notas[i][0] + notas[i][1] + notas[i][2]) / 3;
                break;
            }
        }
    }
    public void list(){
        for (int i = 0; i < nombres.length; i++) {
            if (!nombres[i].equals("")) {
                System.out.println((i+1)+".- Nombre "+nombres[i]);
            }
        }
    }
}
