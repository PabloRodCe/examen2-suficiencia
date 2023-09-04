/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControlPedidos;

import javax.swing.JTextField;

/**
 *
 * @author Student
 */
public class AdmiPedidos {
    private int numero;
    private String descripcion ;

    AdmiPedidos(JTextField txtpedido) {
       
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public AdmiPedidos(int numero, String descripcion) {
        this.numero = numero;
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "AdmiPedidos{" + "numero=" + numero + ", descripcion=" + descripcion + '}';
    }
    
    

}
