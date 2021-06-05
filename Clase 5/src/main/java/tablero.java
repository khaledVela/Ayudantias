public class tablero {
    public static void main(String[] args) {
        int casilla[][] = {{5,3,4},{6,7,2},{1,9,8}};
        int user[][]={{0,0,4},{0,7,2},{0,0,0}};
        for (int i=0;i<3;i++){
            System.out.print("|");
            for (int j=0;j<3;j++) {
                System.out.print(+user[i][j]+"|");
            }
            System.out.println();
        }
        System.out.println("dame la fila y columna");
    }
}
