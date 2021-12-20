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
public class Paquetes {
    private String precio;
    public Proveedores hechos;
    public ArrayList<Economicos> pide = new ArrayList();
    public ArrayList<Estandar> precisa = new ArrayList();
    public ArrayList<Plus> requiere = new ArrayList();

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
}
