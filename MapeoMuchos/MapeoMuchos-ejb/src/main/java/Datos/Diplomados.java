/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author astrid
 */
public class Diplomados implements Serializable {
    private int id;
    private String nombre;
    private  int duracion;
    private List<EstudianteS> estudiante;
        
    /**
     *
     * @param id
     * @param nombre
     * @param duracion
     */
    public Diplomados(int id, String nombre, int duracion) {
        this.id = id;
        this.nombre = nombre;
        this.duracion = duracion;
    }

    /**
     *
     */
    public Diplomados() {
    }

    /**
     *
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return
     */
    public int getDuracion() {
        return duracion;
    }

    /**
     *
     * @param duracion
     */
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    /**
     *
     * @return
     */
    public List<EstudianteS> getEstudiante() {
        return estudiante;
    }

    /**
     *
     * @param estudiante
     */
    public void setEstudiante(List<EstudianteS> estudiante) {
        this.estudiante = estudiante;
    }

  
    
}

