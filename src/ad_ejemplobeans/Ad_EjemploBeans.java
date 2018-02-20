/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ad_ejemplobeans;

import beans.Pedido;
import beans.Producto;

/**
 *
 * @author oracle
 */
public class Ad_EjemploBeans {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Producto producto1=new Producto();
        Pedido pedido=new Pedido();
        //Añadimos pedido como receptor del propertyChangeEvent
        producto1.addPropertyChangeListener(pedido);
        System.out.println("Sin Cambios");
        producto1.setStockactual(2);
        System.out.println("Cambio 1");
        producto1.setStockactual(-1);
        System.out.println("Cambio 2");
    }
    
}
