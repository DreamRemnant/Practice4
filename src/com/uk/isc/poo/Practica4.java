/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.uk.isc.poo;

/**
 *
 * @author Juanito
 */
public class Practica4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Enrique Segoviano #32 Col.Chespirito", "Raul.Godinez@hotmail.com", "Raul", "Godinez", 24, 'M');
        Empleado e1 = new Empleado("Eduardo", "Ramirez", 43, 'M', "Gerente", 33000);
        Proveedor p1 = new Proveedor(14, 66221450, "Rosa María", "Escobedo", 38, 'F');
        
        System.out.printf("Cliente:\nNombre: %s\nApellido: %s\nEdad: %d\nSexo: %s\nDireccion: %s\ncorreo: %s", c1.nombre,c1.apellido, c1.edad, c1.sexo, c1.direccion, c1.correo);
        System.out.printf("Empleado:\nNombre: %s\nApellido: %s\nEdad: %d\nSexo: %s\nPuesto: %s\n: %s", e1.nombre,e1.apellido, e1.edad, e1.sexo,e1.puesto, e1.salario);
    }
    
}
