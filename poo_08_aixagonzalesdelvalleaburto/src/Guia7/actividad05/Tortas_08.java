/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7.actividad05;

/**
 *
 * @author USUARIO
 */
public class Tortas_08 {
    String sabor;
    String color;
    int pisos;
    double peso;
    
    public Tortas_08( String sabor , String color){
        this.sabor = sabor;
        this.color = color;
    }
    
    public void mostrarDatos(){
        System.out.println("la torta sera de " + sabor + " y tendra el color  " + color );
    }
}