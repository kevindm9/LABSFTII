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
public class ViajeFamiliar extends Viaje{
    
    private int atrFamilia;
    
    /**
     * @param prmOrigen
     * @param prmLlegada
     * @param prmCosto
     * @param prmFechaSalida
     * @param prmFechaLlegada
     * @param prmFamilia
     */
    public ViajeFamiliar(String prmOrigen, String prmLlegada, int prmCosto, Date prmFechaSalida, Date prmFechaLlegada, int prmFamilia)
    {
        super(prmOrigen, prmLlegada, prmCosto, prmFechaSalida, prmFechaLlegada);
        atrOrigen = prmOrigen;
        atrDestino = prmLlegada;
        atrCosto = prmCosto;
        atrFechaSalida = prmFechaSalida;
        atrFechaLlegada = prmFechaLlegada;
        atrFamilia = prmFamilia;
    }
    
    @Override
    public String descripcion()
    {
        return "Viaje para disfrutar con toda tu familia";
    }
    
    public void setFamilia(int prmFamilia)
    {
        atrFamilia = prmFamilia;
    }
    
    public int getFamilia()
    {
        return atrFamilia;
    }
    
    @Override
    public String cualquierMetodo2()
    {
        return "Método implementado en la clase hija viaje familiar";
    }
}
