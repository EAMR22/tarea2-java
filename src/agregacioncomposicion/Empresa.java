/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agregacioncomposicion;

/**
 *
 * @author PC
 */
public class Empresa {
    private String nombre;
    Cliente [] clientes;
    
    public Empresa(int n){
        clientes = new Cliente[n];
    }
    
    void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    String getNombre(){
        return nombre;
    }
}
