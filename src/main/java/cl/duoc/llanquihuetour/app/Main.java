package cl.duoc.llanquihuetour.app;

import cl.duoc.llanquihuetour.model.Direccion;
import cl.duoc.llanquihuetour.model.Empleado;
import cl.duoc.llanquihuetour.model.Persona;

public class Main {

    public static void main(String[] args){
        System.out.println("=====================================================");
        System.out.println("         SISTEMA DE REGISTRO LLANQUIHUE TOUR         ");
        System.out.println("=====================================================");
        System.out.println( );

        //Paso 1: Creación de direcciones
        Direccion dirccion1 = new Direccion("Av. Manuel Antonio Matta", "909", "Llanquihue", "Los Lagos");
        Direccion dirccion2 = new Direccion("Hernando de Magallanes", "548", "Puerto Montt", "Los Lagos");
        Direccion dirccion3 = new Direccion("Juan Ignacio Molina", "717", "Alerce", "Los Lagos");

        //Paso 2: Registro de personas y empleados
        Persona cliente1 = new Persona("Javiera Navarro", "20.365.750-9", "javiera.navarro@gmail.com", "+56975126498", dirccion1);
        Empleado empleado1 = new Empleado("Mónica Lazo", "19.853.478-5", "monica.lazo@gmail.com", "+56951478325", dirccion2, "Empleado 01", "Guía turístico", 800000);
        Empleado empleado2 = new Empleado("Raquel Molina", "17.684.245.7", "raquel.molina@gmail.com", "+56956891237", dirccion3, "Empleado 02", "Recepcionista", 750000);

        //Paso 3: Salida de información
        System.out.println(" ---- REGISTRO DE CLIENTES ---- ");
        System.out.println(cliente1);
        System.out.println( );

        System.out.println(" ---- REGISTRO DE EMPLEADOS ---- ");
        System.out.println(empleado1);
        System.out.println( );
        System.out.println(empleado2);
        System.out.println( );

        System.out.println("====================================================");
        System.out.println("Resgistro completo");
    }
}
