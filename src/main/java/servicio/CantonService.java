/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import java.util.List;
import modelo.Canton;

/**
 *
 * @author USUARIO
 */
public interface CantonService {
    
    public abstract void crear(Canton canton);

    public Canton buscarPorCodigo(int codigo);
    public Canton buscarPorNombre(String nombre);
    public void modificar(Canton canton, int codigo);

    public void eliminar(int codigo);

    public abstract List<Canton> listar();
    
}
