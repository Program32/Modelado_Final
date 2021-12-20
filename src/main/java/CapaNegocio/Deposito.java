/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

/**
 *
 * @author user
 */
public class Deposito {
    private String nroCuenta;
    public SistemaPago necesita;
    public Facturas facturas;
    
    public Deposito(){
        facturas = new Facturas();
    }
    public String getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(String nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

}
