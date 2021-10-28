/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adicionales;

/**
 *
 * @author Pedro Mendoza
 */
public abstract class Aderezo {
    private String nombreAderezo;
    public void setNombreAderezo(String nombreAderezo) {
        this.nombreAderezo = nombreAderezo;
    }
    public String toString(){
        return nombreAderezo.toUpperCase();
    }
    
}
