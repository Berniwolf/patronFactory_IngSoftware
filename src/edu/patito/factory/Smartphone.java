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
public class Smartphone implements Articulo{
    private String marca;
    private String sistemaOp;
    private String almacenamineto;
    private String camara;
    private String color;

    public Smartphone() {
    }

    public Smartphone(String marca, String sistemaOp, String almacenamineto, String camara, String color) {
        this.marca = marca;
        this.sistemaOp = sistemaOp;
        this.almacenamineto = almacenamineto;
        this.camara = camara;
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

    public String getAlmacenamineto() {
        return almacenamineto;
    }

    public void setAlmacenamineto(String almacenamineto) {
        this.almacenamineto = almacenamineto;
    }

    public void setCamara(String camara) {
        this.camara = camara;
    }
    
    public String getCamara() {
        return camara;
    }
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Smartphone{" + "marca=" + marca + ", sistemaOp=" + sistemaOp + ", almacenamineto=" + almacenamineto + ", camara=" + camara + ", color=" + color + '}';
    }

    

    

    

    

    
    
    
}
