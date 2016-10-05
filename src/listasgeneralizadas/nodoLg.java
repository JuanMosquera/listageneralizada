/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasgeneralizadas;

/**
 *
 * @author Juan
 */
public class nodoLg {
    private int sw;
    private Object dato;
    private nodoLg liga;

    public nodoLg() {
    }

    public nodoLg(int sw, Object dato, nodoLg liga) {
        this.sw = sw;
        this.dato = dato;
        this.liga = liga;
    }

    
    /**
     * @return the sw
     */
    public int getSw() {
        return sw;
    }

    /**
     * @param sw the sw to set
     */
    public void setSw(int sw) {
        this.sw = sw;
    }

    /**
     * @return the dato
     */
    public Object getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(Object dato) {
        this.dato = dato;
    }

    /**
     * @return the liga
     */
    public nodoLg getLiga() {
        return liga;
    }

    /**
     * @param liga the liga to set
     */
    public void setLiga(nodoLg liga) {
        this.liga = liga;
    }
    
    
    
    
    
}
