/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.tallerpolimorfismo.cliente;

import co.edu.unicauca.tallerpolimorfismo.modelo.Viaje;
import co.edu.unicauca.tallerpolimorfismo.modelo.ViajeFamiliar;
import co.edu.unicauca.tallerpolimorfismo.modelo.ViajeIncentivo;
import co.edu.unicauca.tallerpolimorfismo.modelo.ViajeIndividual;
import co.edu.unicauca.tallerpolimorfismo.modelo.ViajeTodoIncluido;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kevin Morales, Hector Dorado
 */
public class ClienteMain {

    /**
     * @param args the command line arguments
     */
    public static List<Viaje> viajes = new ArrayList();
    
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        
        leerViajes();
        mostrarViajes();
    }

    private static void leerViajes() {
        try
        {
            Viaje viaje1 = new ViajeFamiliar("Popayan", "Bogota", 100000, 
                    new SimpleDateFormat("dd/MM/yyyy").parse("01/05/2019"), 
                    new SimpleDateFormat("dd/MM/yyyy").parse("05/05/2019"), 4);
                    viajes.add(viaje1);
            
            Viaje viaje2 = new ViajeIncentivo("Popayán", "Medellin", 2100000, 
                    new SimpleDateFormat("dd/MM/yyyy").parse("03/06/2019"), 
                    new SimpleDateFormat("dd/MM/yyyy").parse("09/06/2019"), "Emtel");
                    viajes.add(viaje2);
             
            Viaje viaje3 = new ViajeIndividual("Popayán", "San Andres", 4250000, 
                    new SimpleDateFormat("dd/MM/yyyy").parse("01/07/2019"), 
                    new SimpleDateFormat("dd/MM/yyyy").parse("12/07/2019"));
                    viajes.add(viaje3);
                    
            Viaje viaje4 = new ViajeTodoIncluido("Popayán", "Cartagena", 7350000, 
                    new SimpleDateFormat("dd/MM/yyyy").parse("01/07/2019"), 
                    new SimpleDateFormat("dd/MM/yyyy").parse("12/07/2019"));
                    viajes.add(viaje4);
                    
        }catch(ParseException ex)
        {
            Logger.getLogger(ClienteMain.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }

    private static void mostrarViajes() {
        
        for(Viaje viaje : viajes)
        {
            System.out.println("Origen: " + viaje.getOrigen());
            System.out.println("Destino: " + viaje.getDestino());
            System.out.println("Fecha salida: " + viaje.getFechaSalida());
            System.out.println("Fecha llegada: " + viaje.getFechaLlegada());
            System.out.println("Costo: " + viaje.getCosto());
            System.out.println("Descripcion: " + viaje.descripcion());
            System.out.println("Cualquier metodo: " + viaje.cualquierMetodo());
            System.out.println("Cualquier metodo 2: " + viaje.cualquierMetodo2());
            System.out.println("");
        }
    }
}
