/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hundirflota;

/**
 *  Una jugada consiste en leer las coordenadas de una posición en el tablero. Si estas
    corresponden con la posición ocupada por una parte de un barco estará "tocado",
    descubriéndose en la representación del tablero en pantalla esa posición. Si todas las partes
    de un barco están tocadas pasará a estar "hundido". Si una jugada no toca o hunde un barco
    (es "agua") esa posición quedará marcada y el programa indicará si alrededor está colocado
    algún barco.
 */
public class Jugada {
    
    public int fila, columna;
    public boolean realizada;
    
    public void Jugada() {
        
    }
    
    public void leer() {
        
    }
    
    public void marcar() {
        this.realizada = true;
    }
    
}
