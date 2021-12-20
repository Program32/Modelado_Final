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
public class Trabajadores extends Agencia{
    private String dni;
    public ArrayList<Reserva> realizado = new ArrayList();
    
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    public String Organizar()
    {
        return "El metodo Organizar ya esta implementado";
    }
}
