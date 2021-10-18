/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasoporvalor;

/**
 *
 * @author LORENA
 */
public class PasoPorValor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      var a=10;
        System.out.println("A : "+a);
      cambiarvalor(a);
      
    }
    public static void cambiarvalor(int arg1){
           System.out.println("Arg1 : "+arg1);
           arg1=15;
           System.out.println("Arg1 : "+arg1);
    }
}
