package laboratorio4;

public class Tablero {

    private Pieza[][] tablero = new Pieza[10][10];
    private Jugador jugador1;
    private Jugador jugador2;

    public Tablero() {
    }

    public Tablero(Jugador jugador1, Jugador jugador2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
    }

    public Pieza[][] getTablero() {
        return tablero;
    }

    public void setTablero(Pieza[][] tablero) {
        this.tablero = tablero;
    }

    public Jugador getJugador1() {
        return jugador1;
    }

    public void setJugador1(Jugador jugador1) {
        this.jugador1 = jugador1;
    }

    public Jugador getJugador2() {
        return jugador2;
    }

    public void setJugador2(Jugador jugador2) {
        this.jugador2 = jugador2;
    }

    //editar cuando las piezas esten terminadas
    public void llenarTablero() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (i == 0 || i == 1) {
                    if ((i == 0 && (j == 0 || j == 9)) || (i == 1 && j == 4)) {
                        tablero[i][j] = new Caballero();
                    }
                    if ((i == 0 && (j == 2 || j == 7)) || (i == 1 && j == 5)) {
                        tablero[i][j] = new Dragon();
                    }

                    if ((i == 0 && (j == 3 || j == 6)) || (i == 1 && (j == 2 || j == 7))) {
                        tablero[i][j] = new Arquero();
                    }
                    if (i == 0 && j == 5) {
                        tablero[i][j] = new Rey();
                    }
                    if (i == 0 && j == 6) {
                        tablero[i][j] = new Mago();
                    }
                } else {
                    if ((i == 9 && (j == 0 || j == 9)) || (i == 8 && j == 5)) {
                        tablero[i][j] = new Caballero();
                    }
                    if ((i == 9 && (j == 2 || j == 7)) || (i == 8 && j == 4)) {
                        tablero[i][j] = new Dragon();
                    }
                    if ((i == 8 && (j == 2 || j == 7)) || (i == 9 && (j == 3 || j == 6))) {
                        tablero[i][j] = new Arquero();
                    }
                    if (i == 9 && j == 5) {
                        tablero[i][j] = new Mago();
                    }
                    if (i == 9 && j == 6) {
                        tablero[i][j] = new Rey();
                    }
                }
            }
        }
    }
}