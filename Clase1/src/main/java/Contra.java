import java.util.Scanner;

public class Contra {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String palabra;
        boolean veri=false;
        String contra = "alabama185@";
        for (int i = 0; i < 3; i++) {
            System.out.println("ingrese la clave");
            palabra = teclado.nextLine();
            if (palabra.equals(contra)) {
                System.out.println("Bienvenido");
                veri= true;
                break;
            }
        }
        if(veri==false){
            System.out.println("fuera de aqui intruso");
        }
    }
}