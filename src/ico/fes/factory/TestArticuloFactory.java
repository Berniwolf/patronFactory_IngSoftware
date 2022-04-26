/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.factory;

import java.util.Scanner;

/**
 *
 * @author Bernabe Hdz
 */
public class TestArticuloFactory {
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
        
        Articulo aparato = ArticuloFactory.createArticulo(eleccion);
        System.out.println(aparato.toString());
    }
}
