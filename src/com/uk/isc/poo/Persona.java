/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uk.isc.poo;

import com.sun.xml.internal.messaging.saaj.packaging.mime.util.OutputUtil;

/**
 *
 * @author Juanito
 */
public class Persona {
    String nombre;
    String apellido;
    int edad;
    char sexo;

    public Persona(String nombre, String apellido, int edad, char sexo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
    }
    
    public void Comer(){
        System.out.println(nombre + " está comiendo.");
    }
    
    public void Hablar(){
        System.out.println("Hola, soy "+nombre);
    }
}
