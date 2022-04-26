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
public class Tablet implements Articulo{
    private String marca;
    private String sistemaOp;
    private String capacidad;
    private String tamaño;
    private String color;

    public Tablet() {
    }

    public Tablet(String marca, String sistemaOp, String capacidad, String tamaño, String color) {
        this.marca = marca;
        this.sistemaOp = sistemaOp;
        this.capacidad = capacidad;
        this.tamaño = tamaño;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSistemaOp() {
        return sistemaOp;
    }

    public void setSistemaOp(String sistemaOp) {
        this.sistemaOp = sistemaOp;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Tablet{" + "marca=" + marca + ", sistemaOp=" + sistemaOp + ", capacidad=" + capacidad + ", tama\u00f1o=" + tamaño + ", color=" + color + '}';
    }
    
    
}