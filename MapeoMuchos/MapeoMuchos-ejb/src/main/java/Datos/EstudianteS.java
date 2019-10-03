/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.io.Serializable;

/**
 *
 * @author astrid
 */
public class EstudianteS implements Serializable{
    private int id;
    private String nombre;
    private String cedula ;

    /**
     *
     * @param id
     * @param nombre
     * @param cedula
     */
    public EstudianteS(int id, String nombre, String cedula) {
        this.id = id;
        this.nombre = nombre;
        this.cedula = cedula;
    }

    /**
     *
     */
    public EstudianteS() {
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
    public String getCedula() {
        return cedula;
    }

    /**
     *
     * @param cedula
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
}


