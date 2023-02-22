package hospital;

public class Nomedico extends trabajador {
    EnumNM traba;

    public Nomedico(String nombre, int id, double sueldo, EnumNM traba) {
        super(nombre, id, sueldo);
        this.traba = traba;
    }

    public EnumNM getTraba() {
        return traba;
    }

    public void setTraba(EnumNM traba) {
        this.traba = traba;
    }
    
}