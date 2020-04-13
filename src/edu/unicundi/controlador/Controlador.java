package edu.unicundi.controlador;

import edu.unicundi.modelo.Modelo;
import edu.unicundi.vista.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Esta clase Controlador recibira como parametros la vista y el modelo
 * Ejecutando los metodos necesarios de cada uno haciendolo independendiente
 * @author Anderson Torres Q.
 * @author ayesidtorres@unicundi.edu.co
 * @version 1.0
 */

//Inicio clase controlador
public class Controlador implements ActionListener{
    
    //Variables clase
    private Vista vista;
    private Modelo modelo;
    
    //Construcroe que recibe parametros vista y modelo, tambien trael evento del boton JUGAR de la vista
    public Controlador(Vista vista, Modelo modelo){
        this.vista = vista;
        this.modelo = modelo;
        this.vista.btnJugar.addActionListener(this);
    }
    
    //Metodo que coloca un titulo a la ventana y la centra
    public void iniciar(){
        vista.setTitle("MVC Juego Piedra - Papel - Tijera!!");
        vista.setLocationRelativeTo(null);
    }
    
    //Metodo que conecta la parte del modelo con la vista
    public void actionPerformed(ActionEvent e){
        modelo.setMovimientoH(vista.labelResH.getText());
        modelo.resultadoMaquina();
        vista.labelResM.setText(modelo.resultadoMaquina());
        modelo.validar();
        vista.labelGanador.setText(modelo.getResultado());        
    }
}
