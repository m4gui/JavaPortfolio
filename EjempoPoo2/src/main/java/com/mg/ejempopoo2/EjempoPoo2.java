package com.mg.ejempopoo2;
public class EjempoPoo2 {

    public static void main(String[] args) {
       Auto auto1 = new Auto();
       Auto auto2 = new Auto(1, "AA123lb", 3, "blanco", true);
        
        /*auto2.encender();
        auto2.acelerar(20);
        auto2.frenar(10);
        auto2.apagar();
        
        System.out.println("El valor del id es: "+ auto2.getId());
        auto2.setId(23);
        System.out.println("El nuevo valor del id es :"+ auto2.getId());
        
        System.out.println("El id del auto 1 es: "+ auto1.getId());
        System.out.println("El color del auto 1 es: "+ auto1.getColor());
        
        auto1.setId(41);
        auto1.setPatente("AA123QW"); 
        auto1.setCantidadDePuertas(5); 
        auto1.setColor("Negro"); 
        auto1.setCajaManual(false);
        System.out.println("----------");
        /*System.out.println("El nuevo id de auto1 es: " + auto1.getId()); 
        System.out.println("El nuevo color de auto1 es: " + auto1.getColor());
        */
        System.out.println(auto2.toString());
        System.out.println(auto1.toString());
        
    }
}
