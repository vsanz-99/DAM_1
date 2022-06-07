package herencia;

/*
Suponiendo que categoria es entero:
Licenciatura = 1
Maestría = 2
Doctorado = 3
*/
public class Docente extends Empleado{
private int categoria;
private int grado_academico;

public Docente(){
    
}

public Docente(int categoria, int grado_academico, String nombre, float sueldo, int num_empleado, int antiguedad){
    super(nombre, sueldo, num_empleado, antiguedad);
    this.categoria = categoria;
    this.grado_academico = grado_academico;
}

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public int getGrado_academico() {
        return grado_academico;
    }

    public void setGrado_academico(int grado_academico) {
        this.grado_academico = grado_academico;
    }
    
    public double SueldoN(){
        double sueldo_total = 0;
        int sal_min = 70;
        if(getCategoria() == 1){
            sueldo_total = getSueldo() + sal_min;
        }else if(getCategoria() == 2){
            sueldo_total = getSueldo() + (sal_min * 3);
        }else if(getCategoria() == 3){
            sueldo_total = getSueldo() + (sal_min * 5);
        }
        
        return sueldo_total;
    }

    @Override
    public String toString() {
        return "Docente{" + "categoria=" + categoria + ", grado_academico=" + grado_academico + '}'+ super.toString();
    }
    
}