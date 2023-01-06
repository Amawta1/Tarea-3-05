/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import java.util.List;
import modelo.Pais;

/**
 *
 * @author USUARIO
 */
public interface PaisService {
    
   public abstract void crear(Pais pais);

    public Pais buscarPorCodigo(int codigo);

    public Pais buscarPorNombre(String nombre);

    public void modificar(Pais pais, int codigo);

    public void eliminar(int codigo);

    public abstract List<Pais> listar();
    
}
