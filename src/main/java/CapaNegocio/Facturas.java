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
public class Facturas {
    private String nroRuc;
    private Currency subTotal;
    private Currency igv;
    private Date fechaCancelacion;

    public String getNroRuc() {
        return nroRuc;
    }

    public void setNroRuc(String nroRuc) {
        this.nroRuc = nroRuc;
    }

    public Currency getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(Currency subTotal) {
        this.subTotal = subTotal;
    }

    public Currency getIgv() {
        return igv;
    }

    public void setIgv(Currency igv) {
        this.igv = igv;
    }

    public Date getFechaCancelacion() {
        return fechaCancelacion;
    }

    public void setFechaCancelacion(Date fechaCancelacion) {
        this.fechaCancelacion = fechaCancelacion;
    }

}
