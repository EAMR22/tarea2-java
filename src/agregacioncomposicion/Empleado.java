/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agregacioncomposicion;

/**
 *
 * @author PC
 */
public class Empleado {
    private String nombre;
    
    public Empleado(String nombre){
        this.nombre = nombre;
    }
    
    void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    String getNombre(){
        return this.nombre;
    }
}
