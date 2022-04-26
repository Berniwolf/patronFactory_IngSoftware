/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.patito.factory;

import ico.fes.factory.Articulo;

/**
 *
 * @author Bernabe Hdz
 */
public class Computador implements Articulo{
    private String marca;
    private String procresador;
    private String memRam;
    private String sistemaOp;
    private String color;
    

    public Computador() {
    }

    public Computador(String marca, String procresador, String memRam, String sistemaOp, String color){
        this.marca = marca;
        this.procresador = procresador;
        this.memRam = memRam;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getProcresador() {
        return procresador;
    }

    public void setProcresador(String procresador) {
        this.procresador = procresador;
    }

    public String getMemRam() {
        return memRam;
    }

    public void setMemRam(String memRam) {
        this.memRam = memRam;
    }


    public String getSistemaOp() {
        return sistemaOp;
    }

    public void setSistemaOp(String sistemaOp) {
        this.sistemaOp = sistemaOp;
    }
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", procresador=" + procresador + ", memRam=" + memRam + ", sistemaOp=" + sistemaOp + ", color=" + color + '}';
    }

    
    

    
    
    
    
   
    
    
}
