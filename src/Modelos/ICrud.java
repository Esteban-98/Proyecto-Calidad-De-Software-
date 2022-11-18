
package Modelos;

import java.util.List;


public interface ICrud {
    
    public List listar();
    public int agregar(Object[] o);
    public int modificar(Object[] o);
    public int habilitarDeshabilitar (Object[] o);
    public void eliminar(String identificador);
    
    
    
}
