package com.mg.ejempopoo2;
public class Auto {
    int id;
    String patente;
    int cantidadDePuertas;
    String color;
    boolean cajaManual;
    
    //getters y setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getCantidadDePuertas() {
        return cantidadDePuertas;
    }

    public void setCantidadDePuertas(int cantidadDePuertas) {
        this.cantidadDePuertas = cantidadDePuertas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isCajaManual() {
        return cajaManual;
    }

    public void setCajaManual(boolean cajaManual) {
        this.cajaManual = cajaManual;
    }
    
    //metodo toString

    @Override
    public String toString() {
        return "Auto{" + "id=" + id + ", patente=" + patente + ", cantidadDePuertas=" + cantidadDePuertas + ", color=" + color + ", cajaManual=" + cajaManual + '}';
    }
    
    
    
    //constructor

    public Auto() {
    }

    public Auto(int id, String patente, int cantidadDePuertas, String color, boolean cajaManual) {
        this.id = id;
        this.patente = patente;
        this.cantidadDePuertas = cantidadDePuertas;
        this.color = color;
        this.cajaManual = cajaManual;
    }
    
    
    //declaracion de metodos
    
    public void encender() {
        System.out.println("Encendiendo auto");
    }
    public void apagar(){
        System.out.println("Apagando auto");
    }
    public void acelerar(double km){
        System.out.println("Acelerando "+km+ " km");
    }
    public void frenar(double km) {
        System.out.println("Frenando "+km+ " km");
    }
    
    
}
