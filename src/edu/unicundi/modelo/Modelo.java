package edu.unicundi.modelo;

import java.util.Random;

/**
 * Esta clase Modelo manejara todo lo relacionado con el movimiento de los participantes
 * Como tambien poseera toda la logica del juego.
 *
 * @author Anderson Torres Q.
 * @author ayesidtorres@unicundi.edu.co
 * @version 1.0
 */

//Inicio clase modelo
public class Modelo {

    //Inicialiacion de variables principales
    private String movimientoM;
    private String movimientoH;
    private String resultado;

    //Metodos set y get de las variables principales
    public String getMovimientoM() {
        return movimientoM;
    }

    public void setMovimientoM(String movimientoM) {
        this.movimientoM = movimientoM;
    }

    public String getMovimientoH() {
        return movimientoH;
    }

    public void setMovimientoH(String movimientoH) {
        this.movimientoH = movimientoH;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
    
    //Este metodo calculara el movimiento de la maquina mediante un random de 3 posibilidades a las cuales les asignara un valor
    public String resultadoMaquina() {
        Random aleatorio = new Random();
        int opcionM = 1 + aleatorio.nextInt(3);
        switch (opcionM) {
            case 1:
                movimientoM = "Piedra";
                break;
            case 2:
                movimientoM = "Papel";
                break;
            case 3:
                movimientoM = "Tijera";
                break;
        }
        return movimientoM;
    }
    // El metodo validar comparara los movimientos de la maquina y el usuario definiendo el estado final.
    public String validar() {
        
        if (movimientoM == "Piedra" && movimientoH == "Piedra") {
            resultado = "EMPATE";
        }
        if (movimientoM == "Piedra" && movimientoH == "Papel") {
            resultado = "Papel le gana a piedra, GANA HUMANO";
        }
        if (movimientoM == "Piedra" && movimientoH == "Tijera") {
            resultado = "Piedra le gana a tijera, GANA MAQUINA";
        }
        if (movimientoM == "Papel" && movimientoH == "Papel") {
            resultado = "EMPATE";
        }
        if (movimientoM == "Papel" && movimientoH == "Piedra") {
            resultado = "Papel le gana a piedra, GANA MAQUINA";
        }
        if (movimientoM == "Papel" && movimientoH == "Tijera") {
            resultado = "Tijera le gana a papel, GANA HUMANO";
        }
        if (getMovimientoM() == "Tijera" && movimientoH == "Tijera") {
            resultado = "EMPATE";
        }
        if (getMovimientoM() == "Tijera" && movimientoH == "Papel") {
            resultado = "Tijera le gana a papel, GANA MAQUINA";
        }
        if (movimientoM == "Tijera" && movimientoH == "Piedra") {
            resultado = "Piedra le gana a tijera, GANA HUMANO";
        }
        return resultado;
    }
}
