/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agregacioncomposicion;

import java.util.ArrayList;


/**
 *
 * @author PC
 */
public class Empresa {
    private String nombre;
    ArrayList <Cliente> clientes = new ArrayList<Cliente>();
    Empleado empleados [];
    
    // En la composicion tiene que estar creado en su constructor la clase hija.
    public Empresa(String nombre){
        this.nombre = nombre;
        empleados = new Empleado[3];
        empleados[0] = new Empleado("Carlos");
        empleados[1] = new Empleado("Sofia");
        empleados[2] = new Empleado("Gaitan");
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void RegistrarCliente(Cliente cliente){
        clientes.add(cliente);
    }
    
    public void MostrarClientes(){
        System.out.println("Mostrando los clientes: ");
        for(int i = 0; i < clientes.size(); i++){
            System.out.println(clientes.get(i));
        }
    }
    
    public void MostrarEmpleados(){
        System.out.println("Mostrando los empleados: ");
        for(int i = 0; i < empleados.length; i++){
            System.out.println(empleados[i].toString());
        }
    }
}
