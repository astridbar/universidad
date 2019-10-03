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
public class Universidad implements Serializable{
    private int id;
    private String nombre;
    private String extension;
    private String escudo;
    private List<Diplomados> diplomado;
    
    /**
     *
     * @param id
     * @param nombre
     * @param extension
     * @param escudo
     */
    public Universidad(int id, String nombre, String extension, String escudo) {
        this.id = id;
        this.nombre = nombre;
        this.extension = extension;
        this.escudo = escudo;
    }

    /**
     *
     */
    public Universidad() {
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
    public String getExtension() {
        return extension;
    }

    /**
     *
     * @param extension
     */
    public void setExtension(String extension) {
        this.extension = extension;
    }

    /**
     *
     * @return
     */
    public String getEscudo() {
        return escudo;
    }

    /**
     *
     * @param escudo
     */
    public void setEscudo(String escudo) {
        this.escudo = escudo;
    }

    /**
     *
     * @return
     */
    public List<Diplomados> getDiplomado() {
        return diplomado;
    }

    /**
     *
     * @param diplomado
     */
    public void setDiplomado(List<Diplomados> diplomado) {
        this.diplomado = diplomado;
    }

   
}

          

