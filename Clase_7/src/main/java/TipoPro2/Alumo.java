package TipoPro2;

import java.util.Scanner;

public class Alumo {
    float primero;
    float segundo;
    float tercero;
    float promedio;
    String nombre;
    String apellido;

    public Alumo(float primero, float segundo, float tercero, float promedio, String nombre, String apellido) {
        this.primero = primero;
        this.segundo = segundo;
        this.tercero = tercero;
        this.promedio = promedio;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Alumo() {
        System.out.println("Ingrese nombre del alumno");
        nombres();
        System.out.println("Primer parcial");
        this.primero = tri();
        System.out.println("Segundo parcial");
        this.segundo = tri();
        System.out.println("Final");
        this.tercero = tri();
        this.promedio = (primero + segundo + tercero) / 3;
    }

    public void nombres() {
        Scanner teclado = new Scanner(System.in);
        String completo = teclado.nextLine();
        String aux = completo;
        int auxi = 0;
        int cop;
        int contador = 0;
        boolean fin = false;
        while (!fin) {
            try {
                cop = aux.indexOf(" ");
                if (aux.substring(cop, cop + 1).equals(" ")) {
                    aux = aux.substring(0, cop) + aux.substring(cop + 1);
                    contador++;
                    if (contador == 2) {
                        auxi = cop + 2;
                    }
                }
            } catch (Exception e) {
                fin = true;
            }
        }
        if (contador == 3) {
            nombre = completo.substring(0, auxi - 1);
            apellido = completo.substring(auxi);
        } else {
            cop = completo.indexOf(" ");
            nombre = completo.substring(0, cop);
            apellido = completo.substring(cop + 1);
        }
    }

    public int tri() {
        int numero = 0;
        String letra;
        boolean esNumero = false;
        Scanner teclado = new Scanner(System.in);
        while (!esNumero) {
            try {
                letra = teclado.nextLine();
                numero = Integer.parseInt(letra);
                esNumero = true;
            } catch (Exception e) {
                System.out.println("no ingrese letras solo numeros");
            }

        }
        return numero;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public float getPrimero() {
        return primero;
    }

    public void setPrimero(float primero) {
        this.primero = primero;
    }

    public float getSegundo() {
        return segundo;
    }

    public void setSegundo(float segundo) {
        this.segundo = segundo;
    }

    public float getTercero() {
        return tercero;
    }

    public void setTercero(float tercero) {
        this.tercero = tercero;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
