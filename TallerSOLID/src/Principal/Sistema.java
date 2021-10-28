/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Adicionales.Aderezo;
import Adicionales.Crema;
import Adicionales.Frutilla;
import Postres.*;
import Procesos.*;
import Leche.*;
import java.util.ArrayList;

/**
 *
 * @author djurado
 */
public class Sistema {

    public static void main(String[] args) {
        //producir un helado de vainilla y uno de torta de chocolate
        //a ambos agregarle crema y frutilla
        //y cambiar el tipo de leche por leche deslactosada
        ArrayList<Postre> arrPostres = new ArrayList<>();
        LecheEntera leche = new LecheDeslactosada();
        ManejadorDeLeche mnj_leche = new ManejadorDeLeche();

        //producir helado
        Postre helado_vainilla = new Helado("Vainilla");
        arrPostres.add(helado_vainilla);
        //producir pastel
        Postre pastel_chocolate = new Pastel("Chocolate");
        arrPostres.add(pastel_chocolate);

        arrPostres.forEach(postre -> {
            postre.anadirAderezo(new Crema());
            postre.anadirAderezo(new Frutilla());
            System.out.println(postre);
            try{
            mnj_leche.cambiarTipoLeche(leche, postre);}
            catch(RuntimeException re){
                System.out.println(re.getMessage());
            }
            System.out.println(ManejadorDePrecio.showPrecioFinal(postre.getPrecioParcial(), postre.getAderezos()));
        });
    }

}
