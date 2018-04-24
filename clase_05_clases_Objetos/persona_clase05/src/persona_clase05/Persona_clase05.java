/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona_clase05;

import java.util.Date;


public class Persona_clase05 {

    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
    public Persona_clase05(){
        this.nombre  = "Anonymus";
    }
    
    public Persona_clase05(String nombre){
        this.nombre = nombre; 
    }
    
    public Persona_clase05(String nombre, String apellido){  // nombre puede ser puesto a voluntad
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    public Persona_clase05(String nombre, String apellido, String fechaNaciemiento){
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    //getters
    public String getNombre(){
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    
    public Date getFechaNacimiento(){
        return this.fechaNacimiento;
    }
    // setters
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setFechaNacimiento(Date fehaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public static void main(String[] args) {
        Persona_clase05 p = new Persona_clase05();
        System.out.println("El nombre de P es: "+p.nombre);
        
        p.apellido = "Rodriguez";
        p.nombre = "Mauricio";
        p.fechaNacimiento = new Date("1991/09/20");
        System.out.println("El nombre de P es: "+p.nombre);
        
        Persona_clase05 p1 = new Persona_clase05("Maury");
        System.out.println("El nombre de P1 es: "+p1.nombre);
        System.out.println("El nombre de P es: "+p.nombre);
        
        p.nombre = p.nombre + " Juan";
        System.out.println("El nombre plus es: "+p.nombre);
    }
    
}
