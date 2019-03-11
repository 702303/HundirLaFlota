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
public class TestHundirLaFlota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Tablero t = new Tablero(12,12);
        String jugador = "Florin";
        
        Partida partida = new Partida (jugador, t);
        System.out.println(partida.generarBarcoAleatorio());
    }

}
