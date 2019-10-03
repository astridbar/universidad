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
import java.io.Serializable;
import javax.inject.Named;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
/**
 *
 * @author astrid
 */
@Named
@ViewScoped
public class Block implements Serializable {
    
    @EJB 
    private UniveridadFacadeLocal universidFacade;

    @EJB
     private EstudianteFacadeLocal estudianteFacade;
    
    @EJB
    private DiplomadoFacadeLocal diplomadoFacade;
    Universidad universidad;
    Diplomados  diplomados;
    EstudianteS estudiantes;
    
    public void crearUniversidad(){
    Universidad universidad=new Universidad();
    Diplomados  diplomados= new Diplomados();
    universidad.getDiplomado().add(diplomados);
    universidFacade.CrearUniversidad1(diplomados, universidad);
    }
    public void crearDiplomados(){
    Diplomados  diplomados= new Diplomados();
    EstudianteS estudiantes=new EstudianteS();
    diplomados.getEstudiante().add(estudiantes);
    diplomadoFacade.CrearDipomado(diplomados, estudiantes);
    }
    public void EditarUniversidad(){
      Univeridad universidad=universidFacade.find(1); 
       universidad.setNombre(null);
       universidad.getDiplomado().get(0).setDuracion(30);
       universidFacade.edit(universidad);
    }
      
    public void EliminarUniversidad(){
       Univeridad universidad=universidFacade.find(1); 
       universidFacade.edit(universidad);
    }

    public Universidad getUniversidad() {
        return universidad;
    }

    public void setUniversidad(Universidad universidad) {
        this.universidad = universidad;
    }

    public Diplomados getDiplomados() {
        return diplomados;
    }

    public void setDiplomados(Diplomados diplomados) {
        this.diplomados = diplomados;
    }

    public EstudianteS getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(EstudianteS estudiantes) {
        this.estudiantes = estudiantes;
    }

   

 
    
}
