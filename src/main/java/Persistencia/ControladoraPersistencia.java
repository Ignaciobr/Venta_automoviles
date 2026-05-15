
package Persistencia;

//La persistencia busca/manda  los datos en la base de datos

import Logica.Automovil;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    
    AutomovilJpaController autoJpa = new AutomovilJpaController();
    
    public void agregarAutomovil(Automovil auto) {
        
        autoJpa.create(auto);
        
        
    }


    public List<Automovil> traerAuto() {
        return autoJpa.findAutomovilEntities();
    }

    public void borrarAuto(int id) {
        try {
            autoJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Automovil traerAuto(int id) {
        return autoJpa.findAutomovil(id);
    }

    public void modificarAutomovil(Automovil auto) throws Exception {
        autoJpa.edit(auto);
    }
    
    
    
}
