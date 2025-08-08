package com.mycompany.jpaprueba.logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
  * @author BarrileteCosmico
 */
@Entity
public class Carrera implements Serializable {
    //Variables
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)    
    private int id;
    @Basic
    private String nombre;
    
    
    //Metodos
    public Carrera() {
    }
    public Carrera(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String toString() {
        return "Carrera{" + "id= " + id + ", nombre= " + nombre + '}';
    }
    
    
    
}
