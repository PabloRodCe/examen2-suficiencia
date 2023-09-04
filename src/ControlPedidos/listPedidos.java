/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControlPedidos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Student
 */
public class listPedidos extends AdmiPedidos {
    
    public static List<AdmiPedidos> listpedidos = new ArrayList<>();
    
    public static List<AdmiPedidos> getListpedidos() {
        return listpedidos;
    }
    
    public void agregar(AdmiPedidos listPedidos) {
        
        listpedidos.add(listPedidos);
        
    }
    
    public void eliminar(AdmiPedidos listPedidos) {
        listpedidos.remove(listPedidos);
    }
    
    public int buscar(int numero) {
        for (int i = 0; i == numero;) {
            if (i == numero) {
                
            }
        }
        return numero++;
    }
}
