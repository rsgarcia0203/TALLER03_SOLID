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
/**
 *
 * @author djurado
 */
public class Sistema {
    public static void main(String [ ] args){
        // Producir un helado de vainilla y una torta de chocolate, 
        // a ambos agregarles CREMA y FRUTILLAS
        // y cambiar el tipo de leche por Leche Descremada
        // Finalmente mostrar el precio final de cada uno
        LecheEntera leche = new LecheDeslactosada();
        ManejadorDeLeche mnj_leche = new ManejadorDeLeche();
        
        // Producir Helado
       Postre helado_vainilla = new Helado("Vainilla");
       Aderezo c= new Crema(); 
       helado_vainilla.anadirAderezo( c);
        Aderezo f = new Frutilla();
        helado_vainilla.anadirAderezo( f);
        System.out.println(helado_vainilla);
//        mnj_leche.cambiarTipoLeche(leche, helado_vainilla);
        System.out.println(ManejadorDePrecio.showPrecioFinal(helado_vainilla.getPrecioParcial(),helado_vainilla.getAderezos() ));
       
        // Producir Pastel
        Postre pastel_chocolate = new Pastel("Chocolate");
        pastel_chocolate.anadirAderezo(c);
        pastel_chocolate.anadirAderezo(f);
        System.out.println(pastel_chocolate);
//        mnj_leche.cambiarTipoLeche(leche, pastel_chocolate);
        System.out.println(ManejadorDePrecio.showPrecioFinal(pastel_chocolate.getPrecioParcial(),pastel_chocolate.getAderezos() ));
        
        
        
        
        
    }
}
