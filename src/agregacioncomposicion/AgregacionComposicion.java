/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package agregacioncomposicion;


/**
 *
 * @author PC
 */
public class AgregacionComposicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empresa miEmpresa;
        miEmpresa = new Empresa("Mi empresa: ");
        System.out.println(miEmpresa.getNombre());
        
        // Realizacion de agregacion en Cliente:
      
        miEmpresa.RegistrarCliente(new Cliente("Fabian"));
        miEmpresa.RegistrarCliente(new Cliente("Laura"));
        miEmpresa.RegistrarCliente(new Cliente("Andres"));
        
        // Impresion de datos:
        
        miEmpresa.MostrarClientes();
        miEmpresa.MostrarEmpleados();
        
        
    }
    
}
