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
public class SistemaPago {
    private String totalMonto;
    public ArrayList<Deposito> liquida = new ArrayList();

    public String getTotalMonto() {
        return totalMonto;
    }

    public void setTotalMonto(String totalMonto) {
        this.totalMonto = totalMonto;
    }
    
    public String Controlar()
    {
        return "El metodo Controlar ya esta implementado";
    }

}
