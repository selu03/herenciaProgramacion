package Tema7.Interfaces.Ikea;

public class TestIkea {
    public static void main(String[] args) {
        Mueble kallax= new Mueble("Kallax","Estanteria con 6 accesorios blanco",199.99,"Estanteria",Tipo.madera);
        Electrodomestico forsa= new Electrodomestico("Forsa","Lampara flexo de trabajo", 14.99, Tipo.plastico,EficiEner.A);
        
        
        Producto[] lista= new Producto[0];
        
        Tienda listaProducto= new Tienda(lista);
        listaProducto.agregarProducto(kallax);
        listaProducto.agregarProducto(forsa);
        
        listaProducto.mostrarProductos();
    }
}
