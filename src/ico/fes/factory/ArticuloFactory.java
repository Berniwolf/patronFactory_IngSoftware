/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.factory;

import edu.patito.factory.Computador;
import edu.patito.factory.Smartphone;
import edu.patito.factory.Tablet;

/**
 *
 * @author Bernabe Hdz
 */
public class ArticuloFactory {
    public static Articulo createArticulo(int tipo){
        switch (tipo) {
            case Articulo.COMPUTADORA_PORTATIL:
                return new Computador("Lenovo", "10ma generación Intel Core i5-10210U", "8 GB", "Windows 11", "Gris");
            case Articulo.COMPUTADORA_ESCRITORIO:
                return new Computador("All In One HP", "Intel Celeron J4025", "4 GB RAM", "Windows 10 Pro", "Negra");
            case Articulo.TABLET:
                return new Tablet("SAMSUMG Galaxy Tab S6 Lite", "Android", "64 GB", "10.4 pulgadas", "Azul Espacial");
            case Articulo.APPLE_IPAD:
                return new Tablet("2021 Apple iPad", "IOS", "256 GB", "10.2 pulgadas", "Gris");
            case Articulo.SMARTPHONE:
                return new Smartphone("XIAOMI", "Android", "128 GB", "64 MPX", "Azul");
            case Articulo.APPLE_IPHONE:
                return new Smartphone("Apple iPhone 12", "IOS 14", "128 GB", "12MP, f/1.6", "Azul/Patchwork");
            default:
                throw new AssertionError();
        }
    }
}
