import java.util.Scanner;

public class Movimiento {
    String user[][] = {{" ", " ", ""},
                       {" ", " ", " "},
                       {" ", " ", " "}};
    String bar[][] = {{" ", "-", " "},
                      {" ", "-", " "},
                      {" ", "-", " "}};
    String aux;
    String personaje = "X";
    int mov[] ={0,0};
    int meta[]={2,2};
    String met = "#";
    Scanner teclado = new Scanner(System.in);
    boolean salida=false;
    public Movimiento() {
        /*int a,b;
        System.out.println("donde va a disparar");
        a=teclado.nextInt();
        b= teclado.nextInt();
        mp(a,b);
        */
        while (!salida){
            movimiento();
        }
    }

    public void mapa() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                user[i][j] = " ";
                user[meta[0]][meta[1]]=met;
            }
        }
        System.out.println("-------");
        for (int i = 0; i < 3; i++) {
            System.out.print("|");
            for (int j = 0; j < 3; j++) {
                user[mov[0]][mov[1]]=personaje;
                System.out.print(user[i][j] + "|");
            }
            System.out.println();
            System.out.println("-------");
        }
    }

    public void movimiento() {
        String tecla;
        if((mov[0]==meta[0])&&(mov[1]==meta[1])){
            salida=true;
            System.out.println("has escapado");
        }else {
            System.out.println("presione una tecla para moverse");
            tecla = teclado.nextLine();
            aux=tecla;
            if (tecla.toLowerCase().equals("d")) {
                mov[1]++;
                System.out.println(mov[0] + "," + mov[1]);
                mapa();
            }
            if (tecla.toLowerCase().equals("s")) {
                mov[0]++;
                System.out.println(mov[0] + "," + mov[1]);
                mapa();
            }
        }
    }

    public void mp(int a,int b){

        System.out.println("-------");
        for (int i = 0; i < 3; i++) {
            System.out.print("|");
            for (int j = 0; j < 3; j++) {
                user[a-1][b-1]="-";
                System.out.print(user[i][j] + "|");
            }
            System.out.println();
            System.out.println("-------");
        }
        if(user[a-1][b-1].equals(bar[a-1][b-1])){
            System.out.println("le diste a un barco");
        }

    }
    public static void main(String[] args) {
        new Movimiento();
    }
}
