/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.patito.factory;

import java.util.Scanner;

/**
 *
 * @author Bernabe Hdz
 */
public class TestArticulos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int eleccion = 0;
        
       //Pintamos el menu
        System.out.println("Digite el número del artículo que requiere:");
        System.out.println("1) Computadora portátil");
        System.out.println("2) Computadora de Escritorio");
        System.out.println("3) Tablet");
        System.out.println("4) Apple iPad");
        System.out.println("5) Smartphone");
        System.out.println("6) iPhone");
        System.out.println("...) etc");
        
        try {
            System.out.println("Número: ");
            eleccion = teclado.nextInt();
        } catch (Exception e) {
            System.out.println("No capturaste un número");
        }
        
        switch (eleccion) {
            case 1:
                Computador c = new Computador("Lenovo", "10ma generación Intel Core i5-10210U", "8 GB", "Windows 11", "Gris");
                System.out.println(c);
                break;
            case 2:
                Computador cDos = new Computador("All In One HP", "Intel Celeron J4025", "4 GB RAM", "Windows 10 Pro", "Negra");
                System.out.println(cDos);
                break;
            case 3:
                Tablet tb = new Tablet("SAMSUMG Galaxy Tab S6 Lite", "Android", "64 GB", "10.4 pulgadas", "Azul Espacial");
                System.out.println(tb);    
                break;
            case 4:
                Tablet tbDos = new Tablet("2021 Apple iPad", "IOS", "256 GB", "10.2 pulgadas", "Gris");
                System.out.println(tbDos);
                break;
            case 5:
                Smartphone sp = new Smartphone("XIAOMI", "Android", "128 GB", "64 MPX", "Azul");
                System.out.println(sp);
                break;
            case 6:
                Smartphone spDos = new Smartphone("Apple iPhone 12", "IOS 14", "128 GB", "12MP, f/1.6", "Azul/Patchwork");
            default:
                throw new AssertionError();
        }
        
    }
}
