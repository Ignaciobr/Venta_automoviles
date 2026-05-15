
package Logica;

//Recibe peticiones de IGU y manda a persistencia 

import Persistencia.ControladoraPersistencia;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void agregarAutomovil(String modelo, String marca, String color, 
            String patente, int cantPuertas) {
          
        Automovil auto = new Automovil();
        
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setColor(color);
        auto.setPatente(patente);
        auto.setCantPuertas(cantPuertas);
        
        controlPersis.agregarAutomovil (auto);
        
    }

    public List<Automovil> traerAuto() {
        
        return controlPersis.traerAuto();
        
    }

    public void borrarAuto(int id) {
        controlPersis.borrarAuto(id);
    }

    public Automovil traerAuto(int id) {
        return controlPersis.traerAuto(id);
    }

    public void modificarAutomovil(Automovil auto) {
    try {
        controlPersis.modificarAutomovil(auto);
    } catch (Exception e) {
        e.printStackTrace();
    }
}
 

 
    
    
    
}
