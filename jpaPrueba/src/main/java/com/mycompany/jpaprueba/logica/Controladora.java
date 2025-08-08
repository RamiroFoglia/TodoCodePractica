package com.mycompany.jpaprueba.logica;

import com.mycompany.jpaprueba.persistencia.ControladoraPersistencia;
import java.util.ArrayList;

/**
 *
 * @author BarrileteCosmico
 */
public class Controladora {
    //Variables
    ControladoraPersistencia controlPersi = new ControladoraPersistencia();
    
    //Metodos
    //Create
    public void crearAlumno(Alumno a){
        controlPersi.crearAlumno(a);
    }
    //Delete
    public void eliminarAlumno(int id){
        controlPersi.eliminarAlumno(id);
    } 
    //Update pasando como parametro el objeto en si.
    public void editarAlumno(Alumno a) {
        controlPersi.editarAlumno(a);
    }
    //Buscar y retorna un alumno segun el id especificado 
    public Alumno buscarUnAlumno(int id){
        return controlPersi.buscarUnAlumno(id);
    }
    //Buscar y retorna una lista con todos los alumnos
    public ArrayList<Alumno> buscarTodosAlumnos(){
        return controlPersi.buscarTodosAlumnos();
    }
            
}
