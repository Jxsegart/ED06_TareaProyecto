/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed06_tareaproyecto1;

/**
 *
 * @author JxseGart
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             Empleado Empleado1 = new Empleado("1245678M","Perico de los Palotes");
        
        Empleado1.setDireccion("C/del Pez,6");
        Empleado1.setNumHijos(3);
        imprimir_emp(Empleado1);
    }

    /**
     *
     * @param Empleado1
     */
    public static void imprimir_emp(Empleado Empleado1) {
        System.out.println("DNI: "+Empleado1.getDni());
        System.out.println("Nombre: "+Empleado1.getNombre());
        System.out.println("Cargo: "+Empleado1.getCargo());
        System.out.println("Número de hijos: "+Empleado1.getNumHijos());
        System.out.println("Sueldo: "+Empleado1.calcula_sueldo(1200));
    }
    
}
