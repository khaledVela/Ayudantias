import java.util.Scanner;

public class Movimiento {
    String user[][] = {{" ", " ", ""},
                       {" ", " ", " "},
                       {" ", " ", " "}};
    String bar[][] = {{" ", "-", " "},
            {" ", "-", " "},
            {" ", "-", " "}};
    String con[][] = new String[4][4];
    String aux;
    String personaje = "X";
    int mov[] = {0, 0};
    int meta[] = {2, 2};
    String met = "#";
    int nume;
    int a,b;
    Scanner teclado = new Scanner(System.in);
    boolean salida = false;

    public Movimiento() {
        while (!salida) {
            System.out.println("donde va a disparar");
            a = teclado.nextInt();
            b = teclado.nextInt();
            mp(a, b);
        }

        /*
        dificultades Difi=new dificultades();
        while (!salida){
            movimiento();
        }
        */
        /*
        cone();
        */
    }

    public void mapa() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                user[i][j] = " ";
                user[meta[0]][meta[1]] = met;
            }
        }
        System.out.println("-------");
        for (int i = 0; i < 3; i++) {
            System.out.print("|");
            for (int j = 0; j < 3; j++) {
                user[mov[0]][mov[1]] = personaje;
                System.out.print(user[i][j] + "|");
            }
            System.out.println();
            System.out.println("-------");
        }
    }

    public void movimiento() {
        String tecla;
        if ((mov[0] == meta[0]) && (mov[1] == meta[1])) {
            salida = true;
            System.out.println("has escapado");
        } else {
            System.out.println("presione una tecla para moverse");
            tecla = teclado.nextLine();
            aux = tecla;
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
            if (tecla.toLowerCase().equals("w")) {
                mov[0]--;
                System.out.println(mov[0] + "," + mov[1]);
                mapa();
            }
        }
    }

    public void mp(int a, int b) {
        System.out.println("-------");
        for (int i = 0; i < 3; i++) {
            System.out.print("|");
            for (int j = 0; j < 3; j++) {
                user[a - 1][b - 1] = "-";
                System.out.print(user[i][j] + "|");
            }
            System.out.println();
            System.out.println("-------");
        }
        if (user[a - 1][b - 1].equals(bar[a - 1][b - 1])) {
            System.out.println("le diste a un barco");
        } else {
            user[a - 1][b - 1] = " ";
            System.out.println("fallaste");
        }
    }

    public void cone() {
        System.out.println("----------");
        for (int i = 0; i < 4; i++) {
            System.out.print("|");
            for (int j = 0; j < 4; j++) {
                con[i][j] = " ";
                System.out.print(con[i][j] + "|");
            }
            System.out.println();
            System.out.println("----------");
        }
        while (!salida) {
            System.out.println("indica la columna");
            nume = teclado.nextInt();
            nume--;
            for (int a=3; a>0;a--){
                if(con[a][nume].equals(" ")){
                    con[a][nume]="x";
                    break;
                }
            }
            for (int i = 0; i < 4; i++) {
                System.out.print("|");
                for (int j = 0; j < 4; j++) {
                    System.out.print(con[i][j] + "|");
                }
                System.out.println();
                System.out.println("----------");
            }
        }
    }

    public static void main(String[] args) {
        new Movimiento();
    }
}
