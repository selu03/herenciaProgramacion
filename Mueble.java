package Tema7.Interfaces.Ikea;

public class Mueble extends ProductoHogar {
 Tipo TipodeMueble;

public Mueble(String nombre, String descripción, double precio, String string, Tipo tipodeMueble) {
    super(nombre, descripción, precio, tipodeMueble);
    TipodeMueble = tipodeMueble;
}

public Tipo getTipodeMueble() {
    return TipodeMueble;
}

public void setTipodeMueble(Tipo tipodeMueble) {
    TipodeMueble = tipodeMueble;
}
   
}

