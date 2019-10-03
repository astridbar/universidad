/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import Datos.Diplomados;
import Datos.EstudianteS;
import Datos.Universidad;
import Entity.Univeridad;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author astrid
 */
@Local
public interface UniveridadFacadeLocal {

    /**
     *
     * @param univeridad
     */
    void create(Univeridad univeridad);

    /**
     *
     * @param univeridad
     */
    void edit(Univeridad univeridad);

    /**
     *
     * @param univeridad
     */
    void remove(Univeridad univeridad);

    /**
     *
     * @param id
     * @return
     */
    Univeridad find(Object id);

    /**
     *
     * @return
     */
    List<Univeridad> findAll();

    /**
     *
     * @param range
     * @return
     */
    List<Univeridad> findRange(int[] range);

    /**
     *
     * @return
     */
    int count();
    
    /**
     *
     * @param diplomados
     * @param estudiantes
     * @param universidad
     */
    public void CrearUniversidad(Diplomados diplomados,EstudianteS estudiantes,Universidad universidad);
    public void CrearUniversidad1(Diplomados diplomados,Universidad universidad);
}


