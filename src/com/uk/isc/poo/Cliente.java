/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uk.isc.poo;

/**
 *
 * @author Juanito
 */
public class Cliente extends Persona {
    String direccion;
    String correo;

    public Cliente(String direccion, String correo, String nombre, String apellido, int edad, char sexo) {
        super(nombre, apellido, edad, sexo);
        this.direccion = direccion;
        this.correo = correo;
    }
    
    public void Comprar(){
        System.out.println("El cliente a comprado un producto!");
    }
}
