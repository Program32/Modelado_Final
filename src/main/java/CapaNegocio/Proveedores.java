/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;
import java.util.*;
/**
 *
 * @author user
 */
public class Proveedores {
    public Reserva efectuada;
    public SistemaPago sistemaPago;
    public ArrayList<Paquetes> concreta = new ArrayList();
    
    public Proveedores(){
        sistemaPago = new SistemaPago();
    }
    public String Otorgar()
    {
        return "El metodo Otorgar ya esta implementado";
    }
}
