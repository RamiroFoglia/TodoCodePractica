package com.mycompany.jpaprueba;

import com.mycompany.jpaprueba.logica.Alumno;
import com.mycompany.jpaprueba.logica.Controladora;
import com.mycompany.jpaprueba.persistencia.ControladoraPersistencia;
import java.util.ArrayList;
import java.util.Date;

public class Principal {

    public static void main(String[] args) {
        //Variables
        Controladora control = new Controladora();
      
//        control.crearAlumno(a);
//        control.eliminarAlumno(3);       

        System.out.println("----------------------------------------------------");
        System.out.println("---------------- BUSQUEDA INDIVIDUAL ---------------");
        System.out.println("El alumno es: " + control.buscarUnAlumno(2));
        System.out.println("----------------------------------------------------");
        System.out.println("------------------ BUSQUEDA GRUPAL -----------------");
        ArrayList<Alumno> listaAlumnos = control.buscarTodosAlumnos();
        for (Alumno a : listaAlumnos) {
            System.out.println("El alumno es: " + a.toString());
        }
        System.out.println("----------------------------------------------------");

    }
}
