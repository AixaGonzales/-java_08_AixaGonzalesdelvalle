/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7.actividad3;

/**
 *
 * @author USUARIO
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Flores_08 rosa = new Flores_08();
        int cantidadRosa = rosa.cantidad();
        String formaRosa = rosa.forma();
        
        System.out.println("te regalo un " + formaRosa + " de " + cantidadRosa + " rosas ");
    }
}
