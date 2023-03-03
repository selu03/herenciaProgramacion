package Tema7.Interfaces.Ikea;



abstract class ProductoHogar extends Producto{
  Tipo TipoDeMaterial;

public ProductoHogar(String nombre, String descripción, double precio, Tipo tipoDeMaterial2) {
    super(nombre, descripción, precio);
}

public Tipo getTipoDeMaterial() {
    return TipoDeMaterial;
}

public void setTipoDeMaterial(Tipo tipoDeMaterial) {
    TipoDeMaterial = tipoDeMaterial;
}
}


 
   

