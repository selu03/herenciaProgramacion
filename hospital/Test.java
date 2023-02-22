package hospital;

public class Test {
    public static void main(String[] args) {
    Medico m1=new Medico("Pepe", 345, 2000, 2, 8, EnumMe.Cardiologos);
    Nomedico nm=new Nomedico("Tomas", 4, 1500, EnumNM.limpiadores);
    System.out.println(m1.NumPac);
    }

    
}
