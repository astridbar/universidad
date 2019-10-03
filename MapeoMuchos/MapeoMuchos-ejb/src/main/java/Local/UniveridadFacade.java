/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Local;

import Datos.Diplomados;
import Datos.EstudianteS;
import Datos.Universidad;
import Entity.Diplomado;
import Entity.Estudiante;
import com.mycompany.UniveridadFacadeLocal;
import Entity.Univeridad;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author astrid
 */
@Stateless
public class UniveridadFacade extends AbstractFacade<Univeridad> implements UniveridadFacadeLocal {
    @PersistenceContext(unitName = "com.mycompany_MapeoMuchos-ejb_ejb_1.0.10-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UniveridadFacade() {
        super(Univeridad.class);
    }
    

    @Override
    public void CrearUniversidad(Diplomados diplomados,EstudianteS estudiantes,Universidad universidad){
      Univeridad universida=new Univeridad();
      universida.setNombre(universidad.getNombre());
      universida.setExtension(universidad.getExtension());
      universida.setEscudo(universidad.getEscudo());
              
      Diplomado diplomado= new Diplomado();
      diplomado.setNombre(diplomados.getNombre());
      diplomado.setDuracion(diplomados.getDuracion());
      
      Estudiante estudiante = new Estudiante();
      estudiante.setNombre(estudiantes.getNombre());
      estudiante.setCedula(estudiantes.getCedula());
      
      universida.setDiplomado((List<Diplomado>) diplomado);
      diplomado.setEstudiante((List<Estudiante>) estudiante);
      
      create(universida);
    }
    @Override
    public void CrearUniversidad1(Diplomados diplomados,Universidad universidad){
       Univeridad universida=new Univeridad();
      universida.setNombre(universidad.getNombre());
      universida.setExtension(universidad.getExtension());
      universida.setEscudo(universidad.getEscudo());
              
      Diplomado diplomado= new Diplomado();
      diplomado.setNombre(diplomados.getNombre());
      diplomado.setDuracion(diplomados.getDuracion());
      universida.setDiplomado((List<Diplomado>) diplomado);
      create(universida);
}
    
}
