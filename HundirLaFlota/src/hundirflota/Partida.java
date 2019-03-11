/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hundirflota;

/**
 *
 * @author victo
 */
public class Partida {

    private Tablero tablero;
    private String jugador;
    private int segundos;
    private Jugada jugadas[];

    public Partida(String jugador, Tablero tablero) {
        this.jugador = jugador;
        this.tablero = tablero;
        this.segundos = 0;
    }

    public void colocarBarco(Barco barco) {

    }

    /*
    Inicializa un tablero con su tamaño y genera un barco totalmente arbitrario
    */
    public String generarBarcoAleatorio() {

        //Tablero t = new Tablero(12,12);
        int maxLongitud = 5;
        
        Barco b = new Barco(tipoAleatorio(), longitudAleatoria(maxLongitud), orientacionAleatoria(),
                filaAleatoria(tablero), columnaAleatoria(tablero));
        String barcoImpreso = b.imprimirBarco();
        return barcoImpreso;
    }

    /*
    Devuelve un tipo de barco aleatorio entre los 4 existentes
     */
    public String tipoAleatorio() {
        String tipo_barco = ""; // Para el tipo de barco
        int num_tipo = (int) (Math.random() * 4); // [0-PORT 1-CRU 2-DEST 3-FRA]

        if (num_tipo == 0) {
            tipo_barco = "PORTAAVIONES";
        }
        if (num_tipo == 1) {
            tipo_barco = "CRUCERO";
        }
        if (num_tipo == 2) {
            tipo_barco = "DESTRUCTOR";
        }
        if (num_tipo == 3) {
            tipo_barco = "FRAGATA";
        }

        return tipo_barco;
    }

    /*
    Devuelve la posicion del barco, 0 es que esta vertical y el barco estará 
    hacia abajo y 1 que el barco esta horizontal y el barco irá a derechas.
     */
    public int orientacionAleatoria() {
        int orientado = (int) (Math.random() * 2); // [0-Vertical 1-Horizontal]
        return orientado;
    }

    /*
    Dado el tamaño de las filas de un tablero, realiza un aleatorio entre el 
    numero de filas del tablero y lo devuelve.
     */
    public int filaAleatoria(Tablero tablero) {
        int numFilas = tablero.getNumFilas();
        int fila_aleatoria = (int) (Math.random() * numFilas);

        return fila_aleatoria;
    }

    /*
    Dado el tamaño de las columnas de un tablero, realiza un aleatorio entre el 
    numero de columnas del tablero y lo devuelve.
     */
    public int columnaAleatoria(Tablero tablero) {
        int numColumnas = tablero.getNumColumnas();
        int col_aleatoria = (int) (Math.random() * numColumnas);

        return col_aleatoria;
    }

    /*
    Dada una máxima longitud definida, genera un numero aleatorio
     */
    public int longitudAleatoria(int maxLongitud) {
        int long_aleatoria = (int) (Math.random() * maxLongitud);

        return long_aleatoria;
    }

    public void guardar() {

    }

    public void cargar() {

    }

    public boolean disparar(int fila, int columna) {
        return false;
    }
}
