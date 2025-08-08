package com.mycompany.jpaprueba.persistencia;

import com.mycompany.jpaprueba.logica.Alumno;
import com.mycompany.jpaprueba.persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ramiro Foglia
 */
public class ControladoraPersistencia {
    //Variables
    AlumnoJpaController alumJpa = new AlumnoJpaController();

    //Metodos
    //Create
    public void crearAlumno(Alumno a) {
        alumJpa.create(a);
    }
    //Delete
    public void eliminarAlumno(int id) {
        try {
            alumJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //Update pasando un Objeto como parametro 
    public void editarAlumno(Alumno a) {
        try {
            alumJpa.edit(a);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //Buscar y retorna un alumno segun un id espedificado
    public Alumno buscarUnAlumno(int id) {
        return alumJpa.findAlumno(id);
    }
    //Busca y retorna una lista con todos los alumnos
    public ArrayList<Alumno> buscarTodosAlumnos() {
        List<Alumno> listaTemp = alumJpa.findAlumnoEntities();
        ArrayList<Alumno> listaFinal = new ArrayList<>(listaTemp);
        return listaFinal;
    }
}
