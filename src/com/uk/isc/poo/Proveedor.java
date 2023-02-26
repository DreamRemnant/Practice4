/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uk.isc.poo;

/**
 *
 * @author Juanito
 */
public class Proveedor extends Persona{
    int id_proveedor;
    long telefono;

    public Proveedor(int id_proveedor, long telefono, String nombre, String apellido, int edad, char sexo) {
        super(nombre, apellido, edad, sexo);
        this.id_proveedor = id_proveedor;
        this.telefono = telefono;
    }
    
    public void Adquirir(){
        System.out.println("");
    }
}
