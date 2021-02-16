/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicauca.tallerpolimorfismo.modelo;

import java.util.Date;

/**
 *
 * @author Kevin Morales, Hector Dorado
 */
public abstract class Viaje {
    
    /**
     *  atributo Origen de tipo String, guarda el origen de la ciudad
     */
    protected String atrOrigen;

    /**
     * atributo Destino de tipo String, guarda la ciudad destino
     */
    protected String atrDestino;

    /**
     * atributo Costo de tipo entero, guarda el costo del viaje
     */
    protected int atrCosto;

    /**
     * atributo Feha de salida de tipo entero, guarda la fecha en formato (DD,MM,YYYY)
     */
    protected Date atrFechaSalida;

    /**
     * tributo Feha de llegada de tipo entero, guarda la fecha en formato (DD,MM,YYYY)
     */
    protected Date atrFechaLlegada;
    
    /**
     * Constructor clase padre abstracta viaje
     * @param pOrigen parametro origen del viaje
     * @param pDestino parametro destino del viaje
     * @param pCosto parametro costo del viaje 
     * @param pFechaSalida parametro fecha de salida del viaje
     * @param pFechaLlegada parametro fecha de llegada del viaje
     */
    public Viaje(String pOrigen, String pDestino, int pCosto, Date pFechaLlegada, Date pFechaSalida)
    {
        atrOrigen = pOrigen;
        atrDestino = pDestino;
        atrCosto = pCosto;
        atrFechaLlegada = pFechaLlegada;
        atrFechaSalida = pFechaSalida;
    }
    /**
     * @return the atrOrigen, tipo string, se obtiene el origen del viaje
     */
    public String getOrigen() {
        return atrOrigen;
    }
    

    /**
     * @param atrOrigen the atrOrigen to set, modifica el origen del viaje
     */
    public void setOrigen(String atrOrigen) {
        this.atrOrigen = atrOrigen;
    }

    /**
     * @return the atrDestino, se obtiene el destino del viaje
     */
    public String getDestino() {
        return atrDestino;
    }

    /**
     * @param atrDestino the atrDestino to set, se modifica el destino del viaje
     */
    public void setDestino(String atrDestino) {
        this.atrDestino = atrDestino;
    }

    /**
     * @return the atrCosto se obtiene el costo del viaje de tipo entero
     */
    public int getCosto() {
        return atrCosto;
    }

    /**
     * @param atrCosto the atrCosto to set se modifica el costo del viaje
     */
    public void setCosto(int atrCosto) {
        this.atrCosto = atrCosto;
    }

    /**
     * @return the atrFechaSalida, se obtiene la fecha de salida del viaje
     */
    public Date getFechaSalida() {
        return atrFechaSalida;
    }

    /**
     * @param atrFechaSalida the atrFechaSalida to set, se modifica la fecha de salida del viaje
     */
    public void setFechaSalida(Date atrFechaSalida) {
        this.atrFechaSalida = atrFechaSalida;
    }

    /**
     * @return the atrFechaLlegada,  se obtiene la fecha de llegada del viaje
     */
    public Date getFechaLlegada() {
        return atrFechaLlegada;
    }

    /**
     * @param atrFechaLlegada the atrFechaLlegada to set, se modifica la fecha de llegada del viaje
     */
    public void setFechaLlegada(Date atrFechaLlegada) {
        this.atrFechaLlegada = atrFechaLlegada;
    }
    
    /**
     * método abstracto en el cual será implementado en las clases hijas
     * @return descripción del viaje de tipo String o cadena
     */
    public abstract String descripcion();
    
    /**
     * metodo de ejemplo en el que puede ser implementado en la clase base o clases hijas
     * @return cadena = cualquier metodo implementado en la clase base
     */
    public String cualquierMetodo() {
        return "Cualquier método implementado en la clase base";
    }
    
    /**
     * segundo metodo de ejemplo en el que puede ser implementado en la clase base o clases hijas
     * @return cadena = cualquier metodo implementado en la clase base
     */
    public String cualquierMetodo2() {
        return "Cualquier método2 implementado en la clase base";
    }
    
}
