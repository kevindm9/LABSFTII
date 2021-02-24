/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.Unicauca.Parkinglot.domain;

import java.util.logging.Logger;

/**
 *
 * @author kdmor
 */
public class Vehicle {
    
    private String plate;
    
   private TypeEnum type;

    public Vehicle(String plate, TypeEnum type) {
        this.plate = plate;
        this.type = type;
    }

    public Vehicle() {
    }

    public String getPlate() {
        return plate;
    }

    public TypeEnum getType() {
        return type;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "plate=" + plate + ", type=" + type + '}';
    }
    
    
}

