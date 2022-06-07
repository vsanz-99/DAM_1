package herencia;

public class Ejecutable {

	public static void main(String[] args) {
		Empleado[] empleados = new Empleado[10];//creando 10 empleados
        empleados[0] = new Docente(2,3,"Osiris Lucena",3500,65,24);
        empleados[1] = new Admin(2,3,"Carlos Mongradon",1500, 98,5);
        empleados[2] = new Docente(2,3,"Luna Lucena",3500,65,24);
        empleados[3] = new Admin(1,3,"Miguel Mongradon",1500, 98,5);
        empleados[4] = new Docente(2,3,"Sol Lucena",3500,65,24);
        empleados[5] = new Admin(2,3,"Julian Mongradon",1550, 98,5);
        empleados[6] = new Docente(2,3,"Estrella Lucena",3200,65,24);
        empleados[7] = new Admin(1,3,"Julio Mongradon",3655, 98,5);
        empleados[8] = new Docente(2,3,"Maritza Lucena",5500,65,24);
        empleados[9] = new Admin(1,3,"Marcos Mongradon",2987, 98,5);
        
        for(int i = 0; i < empleados.length; i++){
            System.out.println("Empleado "+(i+1)+" su sueldo es:"+empleados[i].SueldoN());
        }
        
        for(int i = 0; i < empleados.length; i++){
            System.out.println("Empleado "+(i+1)+" - Información:"+empleados[i].toString());
        }
        
        double suma_sueldos_docentes = 0;
        for(int i = 0; i< empleados.length; i++){
            if(empleados[i] instanceof Docente){
                suma_sueldos_docentes = suma_sueldos_docentes + empleados[i].SueldoN();
            }
        }
        
        System.out.println("La suma de los sueldos de los docentes es:"+suma_sueldos_docentes);
        
        int suma_emple_admin = 0;
        int suma_emple_inten = 0;
        
        for(int i = 0; i< empleados.length; i++){
            if(empleados[i] instanceof Admin){
                if(empleados[i].getTipo_Plaza() == 1){
                    suma_emple_admin = suma_emple_admin + 1;
                }else if (empleados[i].getTipo_Plaza() == 2){
                    suma_emple_inten = suma_emple_inten + 1;
                }
            }
        }
        System.out.println("La suma de empleados admin son:"+suma_emple_admin);
        System.out.println("La suma de empleados intendentes son:"+suma_emple_inten);
        
        
        
    

	}

}
