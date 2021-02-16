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
public class ViajeIncentivo extends Viaje {
    private String atrEmpresa;
    
    /**
     * Constructor de Viaje Incentivo que hereda de la clase viaje
     * @param prmOrigen parametro origen del viaje
     * @param prmDestino parametro destino del viaje
     * @param prmCosto parametro costo del viaje 
     * @param prmFechaSalida parametro fecha de salida del viaje
     * @param prmFechaLlegada parametro fecha de llegada del viaje
     * @param prmEmpresa parametro tipo string, nombre de la empresa
     */
    public ViajeIncentivo(String prmOrigen, String prmDestino, int prmCosto, Date prmFechaSalida, Date prmFechaLlegada,String prmEmpresa){
        super(prmOrigen, prmDestino, prmCosto, prmFechaSalida, prmFechaLlegada);
        atrOrigen = prmOrigen;
        atrDestino = prmDestino;
        atrCosto = prmCosto;
        atrFechaSalida = prmFechaSalida;
        atrFechaLlegada = prmFechaLlegada;
        atrEmpresa = prmEmpresa;
    };
    
    /**
     * @return the atrEmpresa
     */
    public String getEmpresa() {
        return atrEmpresa;
    }

    /**
     * @param atrEmpresa the atrEmpresa to set
     */
    public void setEmpresa(String atrEmpresa) {
        this.atrEmpresa = atrEmpresa;
    }
    
    @Override
    public String descripcion() {
        return "Viaje incentivo que te envia la empresa "+atrEmpresa;
    }

    public String cualquierMetodo2() {
        return "Método implementado en la clase hija viaje de incentivo";
    }    
}
