/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControlPedidos;

/**
 *
 * @author Student
 */
public class controlador extends listPedidos{
    
    public String crearPedido(){
       int i;
        this.buscar(numero);
        this.agregar(descripcion);
        if (numero == i) {
            System.out.println("el numero no ha cambiado");
        } else {
            System.out.println("el numero es " + i++);
        }
        return crearPedido();
     
    }
    
}
