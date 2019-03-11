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
public class Barco {

    private String tipo; // PORTAAVIONES, CRUCERO, DESTRUCTOR, FRAGATA
    private int longitud; // Ocupa 1,2,3 ... x casillas
    private int orientacion; // VERTICAL(el barco ira hacia abajo) U HORIZONTAL (el barco ira a derechas)
    private int fila, columna; // Coordenadas del barco
    private int partesTocadas; // Cuantas partes de la longitud del barco estan tocadas
    private boolean hundido; // SI EL BARCO ESTA HUNDIDO = TRUE

    public Barco() {

    }

    public Barco(String tipo, int longitud, int orientacion, int fila, int columna) {
        this.tipo = tipo;
        this.longitud = longitud;
        this.orientacion = orientacion;
        this.fila = fila;
        this.columna = columna;
    }
    
    

    public boolean disparar(int fila, int columna) { // Acierto o fallo del disparo

        return false;
    }

    public void colocar() {

    }

   
    public String getTipo() {
        return tipo;
    }

    public int getLongitud() {
        return longitud;
    }

    public int getOrientacion() {
        return orientacion;
    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }
    
    public String imprimirBarco() {
        String tipoBarco = getTipo();
        int longBarco = getLongitud();
        int orienBarco = getOrientacion();
        int filaBarco = getFila();
        int colBarco = getColumna();
        
        String toString = tipoBarco + "\n" + longBarco + "\n" + orienBarco + 
                "\n" + filaBarco + "\n" + colBarco;
        
        return toString;
    }
}
