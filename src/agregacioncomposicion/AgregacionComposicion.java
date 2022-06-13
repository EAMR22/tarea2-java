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
        miEmpresa = new Empresa(3);
        miEmpresa.setNombre("Mi empresa: ");
        System.out.println(miEmpresa.getNombre());
        
        miEmpresa.clientes = new Cliente[3];
        Cliente c1 = new Cliente("David");
        Cliente c2 = new Cliente("Laura");
        Cliente c3 = new Cliente("Perez");
        
        miEmpresa.clientes[0] = c1;
        miEmpresa.clientes[1] = c2;
        miEmpresa.clientes[2] = c3;
        
        System.out.println("Impresion de clientes: ");
        for(int i = 0; i < miEmpresa.clientes.length; i++){
            System.out.println(miEmpresa.clientes[i]);         // Imprime pocisiones de memoria.
        }
    }
    
}
