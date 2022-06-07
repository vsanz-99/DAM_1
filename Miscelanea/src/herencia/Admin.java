package herencia;

/*
Suponiendo que tipo de plaza es entero:
Administrativo = 1
Intendente = 2
*/
public class Admin extends Empleado{
static int tipo_plaza;

public Admin(){
    
}

public Admin(int tipo_plaza, int grado_academico, String nombre, float sueldo, int num_empleado, int antiguedad){
    super(nombre, sueldo, num_empleado, antiguedad, tipo_plaza);
    this.tipo_plaza = tipo_plaza;
}

    public int getTipo_plaza() {
        return tipo_plaza;
    }

    public void setTipo_plaza(int tipo_plaza) {
        this.tipo_plaza = tipo_plaza;
    }
    
    public double sueldoN(){
        double sueldo_final = 0;
        if(getTipo_plaza() == 1){
            sueldo_final = getSueldo() + (getSueldo()*0.25);
        }else if(getTipo_plaza() == 2){
            sueldo_final = getSueldo() + (getSueldo() * 0.10);
        }
        return sueldo_final;
    }

    @Override
    public String toString() {
        return "Admin{" + "tipo_plaza=" + tipo_plaza + '}'+ super.toString();
    }
    
    
    
}