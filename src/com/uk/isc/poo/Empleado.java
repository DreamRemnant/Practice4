/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uk.isc.poo;

/**
 *
 * @author Juanito
 */
public class Empleado extends Persona{
    String puesto;
    double salario;
    
    public Empleado(String nombre, String apellido, int edad, char sexo, String puesto, double salario) {
        super(nombre, apellido, edad, sexo);
        this.puesto = puesto;
        this.salario = salario;
    }
    
    public void Producir(){
        System.out.println("Se ha producido");
    }
    
}
