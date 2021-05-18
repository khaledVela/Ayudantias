import java.util.Scanner;

public class Mes {
    public static void main(String[] args) {
        String fecha;
        String dia= "";
        String mes= "";
        String año= "";
        String signo;
        String sig;
        int num;
        boolean veri =false;
        Scanner teclado = new Scanner(System.in);
        while (veri==false) {
            System.out.println("ingrese el mes");
            fecha = teclado.nextLine();
            dia = fecha.substring(0, 2);
            sig =fecha.substring(2,3);
            mes = fecha.substring(3, 5);
            signo = fecha.substring(5,6);
            año = fecha.substring(6);
            try {
              num=Integer.parseInt(dia);
              num=Integer.parseInt(mes);
              num=Integer.parseInt(año);
              if((sig.equals("/"))&&(signo.equals("/"))) {
                  veri = true;
              }
            }catch (Exception e){
                System.out.println("Ingrese solo una fecha nada mas");
            }
        }
        System.out.print(dia);
        switch (mes){
            case "01":
                System.out.print(" de enero de ");
                break;
        }
        System.out.println(año);
    }
}
