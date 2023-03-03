package Tema7.Interfaces.Ikea;

public class Electrodomestico extends ProductoHogar{
    
  EficiEner eficienciaEnergetica;

public Electrodomestico(String nombre, String descripción, double precio, Tipo TipoDeMaterial, EficiEner eficienciaEnergetica) {
    super(nombre, descripción, precio, TipoDeMaterial);
    this.eficienciaEnergetica = eficienciaEnergetica;
}




public EficiEner getEficienciaEnergetica() {
    return eficienciaEnergetica;
}

public void setEficienciaEnergetica(EficiEner eficienciaEnergetica) {
    this.eficienciaEnergetica = eficienciaEnergetica;
}}


