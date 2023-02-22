package hospital;

public class Medico extends trabajador {
   int numColeg;
   int NumPac; 
   EnumMe profesion;

   
   public Medico(String nombre, int id, double sueldo, int numColeg, int numPac, EnumMe profesion) {
      super(nombre, id, sueldo);
      this.numColeg = numColeg;
      NumPac = numPac;
      this.profesion = profesion;
   }
   
   public int getNumColeg() {
      return numColeg;
   }
   public void setNumColeg(int numColeg) {
      this.numColeg = numColeg;
   }
   public int getNumPac() {
      return NumPac;
   }
   public void setNumPac(int numPac) {
      NumPac = numPac;
   }
   public EnumMe getProfesion() {
      return profesion;
   }
   public void setProfesion(EnumMe profesion) {
      this.profesion = profesion;
   }
}

  


   