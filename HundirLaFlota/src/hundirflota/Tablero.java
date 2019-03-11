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
public class Tablero {
    /*
        Cada vez que hay un movimiento, se imprime el tablero
    
        A   B   C   D   E
    1
    
    2
    
    3       x   x   x
        
    4
    
    */
    
    private Barco barcos[];
    private int numFilas; // Para las dimensiones del tablero
    private int numColumnas;

    
    public Tablero(int numFilas, int numColumnas) {
        this.numFilas = numFilas;
        this.numColumnas = numColumnas;
    }
    
    
     
    /*
    Coloca un barco aleatoriamente en el tablero
    */
    public void colocarBarco (Barco barco) {
        
    }
    
    public boolean disparar(int fila, int columna) {
        return false;
    }
    public String imprimirTablero () {
        
        return "";
    }

    public int getNumFilas() {
        return numFilas;
    }

    public int getNumColumnas() {
        return numColumnas;
    }
}
