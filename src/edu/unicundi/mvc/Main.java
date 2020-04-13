package edu.unicundi.mvc;

import edu.unicundi.controlador.Controlador;
import edu.unicundi.modelo.Modelo;
import edu.unicundi.vista.Vista;

/**
 * Este programa simula el juego de piedra papel o tijera contra la maquina
 * Esta clase MAIN es la clase principal del programa
 *
 * @author Anderson Torres Q.
 * @author ayesidtorres@unicundi.edu.co
 * @version 1.0
 */

//Inicia clase principal
public class Main {
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        //Instancia clases Modelo y Vista
        Modelo mod= new Modelo();
        Vista vis = new Vista();
        
        //Instancio el controlador que recibira los parametros de Modelo y Vista
        Controlador ctr = new Controlador(vis, mod);
        ctr.iniciar();
        vis.setVisible(true);
    }
    
}
