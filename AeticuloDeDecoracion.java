package Tema7.Interfaces.Ikea;

public class AeticuloDeDecoracion extends ProductoHogar {
    String nombre;
    String descripcion;
    double precio;

    public AeticuloDeDecoracion(String nombre, String descripción, double precio, Tipo TipoDeMaterial, String nombre2,
            String descripcion, double precio2) {
        super(nombre, descripción, precio, TipoDeMaterial);
        nombre = nombre2;
        this.descripcion = descripcion;
        precio = precio2;
    }

 

    
  
}
