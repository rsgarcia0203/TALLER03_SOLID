/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adicionales;

/**
 *
 * @author Eliot
 */
public class Crema extends Aderezo {
     @Override
     public String toString(){
        return "CREMA";
    }

    @Override
    public void setNombreAderezo(String nombreAderezo) {
         this.nombreAderezo=nombreAderezo;
    }
}
