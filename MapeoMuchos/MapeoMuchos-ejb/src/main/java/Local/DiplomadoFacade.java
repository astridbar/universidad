/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Local;

import Datos.Diplomados;
import Datos.EstudianteS;
import Datos.Universidad;
import com.mycompany.DiplomadoFacadeLocal;
import Entity.Diplomado;
import Entity.Estudiante;
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
public class DiplomadoFacade extends AbstractFacade<Diplomado> implements DiplomadoFacadeLocal {
    @PersistenceContext(unitName = "com.mycompany_MapeoMuchos-ejb_ejb_1.0.10-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DiplomadoFacade() {
        super(Diplomado.class);
    }
    @Override
    public void CrearDipomado(Diplomados diplomados,EstudianteS estudiantes){
      
      Diplomado diplomado= new Diplomado();
      diplomado.setNombre(diplomados.getNombre());
      diplomado.setDuracion(diplomados.getDuracion());
      
      Estudiante estudiante = new Estudiante();
      estudiante.setNombre(estudiantes.getNombre());
      estudiante.setCedula(estudiantes.getCedula());
      
      diplomado.setEstudiante((List<Estudiante>) estudiante);
      
      create(diplomado);
    }
}
