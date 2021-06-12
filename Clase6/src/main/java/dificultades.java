import java.util.Scanner;

public class dificultades {
    Scanner teclado = new Scanner(System.in);
    String dif;
    int num;
    public dificultades() {
        System.out.println("\u001B[31m que dificultad deseas?\u001B[37m");
        dif=teclado.nextLine();
        switch (dif.toLowerCase()){
            case "facil": num=1;
                System.out.println("hola");
            break;
            case "medio":num=2;
            break;
            case "dificil":num=3;
            break;
        }
    }
}
