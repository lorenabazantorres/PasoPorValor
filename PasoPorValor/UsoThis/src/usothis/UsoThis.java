/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usothis;

/**
 *
 * @author LORENA
 */
public class UsoThis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Persona P1=new Persona("Santiago", "MRV");
        System.out.println(P1);
    }
}

//CLASE PERSONA
     class Persona {

        String nombre;
        String apellidos;

        public Persona(String nombre, String apellidos) {

            this.nombre = nombre;
            this.apellidos = apellidos;

            System.out.println("Acceso a persona con uno de this: " + this);
        }
    }


