package herencia;

public class Empleado {
	private String nombre;
    private float sueldo;
    private int num_empleado;
    private int antiguedad;
    private int p;
    
    public Empleado(){
        
    }
    
    public Empleado(String nombre, float sueldo, int num_empleado, int antiguedad){
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.num_empleado = num_empleado;
        this.antiguedad = antiguedad;
    }
    
    public Empleado(String nombre, float sueldo, int num_empleado, int antiguedad, int tipo_p){
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.num_empleado = num_empleado;
        this.antiguedad = antiguedad;
        p = tipo_p;
    }
    
    public int getTipo_Plaza(){
        return p;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public int getNum_empleado() {
        return num_empleado;
    }

    public void setNum_empleado(int num_empleado) {
        this.num_empleado = num_empleado;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", sueldo=" + sueldo + ", num_empleado=" + num_empleado + ", antiguedad=" + antiguedad + '}';
    }
    
    public double SueldoN(){
        return getSueldo()+(getSueldo()*0.10);
    }
    
}
