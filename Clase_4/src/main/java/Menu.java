import java.util.Scanner;

public class Menu {
    int alumno;
    String general[][];
    String user;
    String opcion;
    Scanner teclado = new Scanner(System.in);
    int num = 0;
    int n;
    boolean veri=false;

    public Menu() {
        System.out.println("Ingrese la cantidad de alumnos");
        alumno = teclado.nextInt();
        general = new String[5][alumno];
        while (veri==false) {
            System.out.println("que desea relaizar?");
            opcion = teclado.nextLine();
            switch (opcion.toLowerCase()) {
                case "registrar":
                    RegistrarEstudiante();
                    break;
                case "agregar nota":
                    AgregarNotas();
                    break;
                case "ver nota":
                    VerNotas();
                    break;
                case "ver prom":
                    VerPromedio();
                    break;
                case "ver prom mat":
                    VerPromMat();
                    break;
                case "salir":
                    Salir();
                    break;
            }
        }
    }

    public void RegistrarEstudiante() {
        System.out.println("Ingrese nombre del estudiante");
        user = teclado.nextLine();
        for (int i = 0; i < alumno ; i++) {
            if (general[0][i] == null) {
                general[0][i] = user;
                break;
            }
        }
        for (int i = 0; i <alumno; i++){
            System.out.println( general[0][i]);
        }
    }

    public void AgregarNotas() {
        System.out.println("Ingrese el nombre del alumno");
        user = teclado.nextLine();
        for (int i = 0; i < alumno; i++) {
            if (general[0][i].equals(user)) {
                System.out.println("ingrese las notas del 1º parcial");
                general[1][i] = teclado.nextLine();
                num += Integer.parseInt(general[1][i]);
                System.out.println("ingrese las notas del 2º parcial");
                general[2][i] = teclado.nextLine();
                num += Integer.parseInt(general[2][i]);
                System.out.println("ingrese las notas del final");
                general[3][i] = teclado.nextLine();
                num += Integer.parseInt(general[3][i]);
                general[4][i] = (num / 3) + "";
                num = 0;
                break;
            }
        }

    }

    public void VerNotas() {
        System.out.println("Ingrese el nombre del alumno");
        user = teclado.nextLine();
        for (int i = 0; i <alumno; i++) {
            if (general[0][i].equals(user)) {
                System.out.println("Primer parcial: " + general[1][i]);
                System.out.println("Segundo parcial: " + general[2][i]);
                System.out.println("Final parcial: " + general[3][i]);
                break;
            }
        }
    }

    public void VerPromedio() {
        System.out.println("Ingrese el nombre del alumno");
        user = teclado.nextLine();
        for (int i = 0; i < alumno; i++) {
            System.out.println("Promedio: " + general[4][i]);
            break;
        }
    }

    public void VerPromMat() {
        for (int i = 0; i < alumno; i++) {
            if(!general[4][i].equals(null)) {
                num += Integer.parseInt(general[4][i]);
            }
        }
        System.out.println("El promedio de la materia es: "+num);
    }
    public boolean Salir(){
        return true;
    }
}
