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
@Table(name = "universidad")
public class Univeridad implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id") 
    private int id;
    @Column
    private String nombre;
    @Column
    private String extension;
    @Column
    private String escudo;

    @OneToMany(mappedBy="Diplomado", cascade=CascadeType.ALL ,fetch=FetchType.LAZY)
    private List<Diplomado> diplomado;
    
    /**
     *
     * @param id
     * @param nombre
     * @param extension
     * @param escudo
     */
    public Univeridad(int id, String nombre, String extension, String escudo) {
        this.id = id;
        this.nombre = nombre;
        this.extension = extension;
        this.escudo = escudo;
    }

    /**
     *
     */
    public Univeridad() {
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
    public List<Diplomado> getDiplomado() {
        return diplomado;
    }

    /**
     *
     * @param diplomado
     */
    public void setDiplomado(List<Diplomado> diplomado) {
        this.diplomado = diplomado;
    }

    public void setNombre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
