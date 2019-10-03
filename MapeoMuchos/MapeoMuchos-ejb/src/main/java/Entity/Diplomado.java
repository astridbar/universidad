/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author astrid
 */
@Entity
@Table(name = "diplomado")
public class Diplomado implements Serializable{
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")    
    private int id;
     
    @Column
    private String nombre;
    
    @Column
    private  int duracion;
    
    @OneToMany(mappedBy="Estudiante", cascade=CascadeType.ALL ,fetch=FetchType.LAZY)
     private List<Estudiante> estudiante;
        
    /**
     *
     * @param id
     * @param nombre
     * @param duracion
     */
    public Diplomado(int id, String nombre, int duracion) {
        this.id = id;
        this.nombre = nombre;
        this.duracion = duracion;
    }

    /**
     *
     */
    public Diplomado() {
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
    public List<Estudiante> getEstudiante() {
        return estudiante;
    }

    /**
     *
     * @param estudiante
     */
    public void setEstudiante(List<Estudiante> estudiante) {
        this.estudiante = estudiante;
    }

  
    
}
