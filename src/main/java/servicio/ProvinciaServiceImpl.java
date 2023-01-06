/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Provincia;

/**
 *
 * @author USUARIO
 */
public class ProvinciaServiceImpl implements ProvinciaService {
    
   private static List<Provincia> provinciaList;
    

    public ProvinciaServiceImpl() {
        this.provinciaList = new ArrayList<>();
        
    }

    @Override
    public void crear(Provincia provincia) {
        this.provinciaList.add(provincia);
        
    }

    @Override
    public List<Provincia> listar() {
        return this.provinciaList;
    }

    @Override
    public void modificar(Provincia provincia, int codigo) {
    var indice = -1;
        for (var provincias : this.provinciaList) {
            indice++;
            if (codigo == provincias.getCodigoProvincia()) {
                this.provinciaList.set(indice, provincia);
            }
        } }

    @Override
    public void eliminar(int codigo) {
        var indice = -1;
        for (var provincias : this.provinciaList) {
            indice++;
            if (codigo == provincias.getCodigoProvincia()) {
                this.provinciaList.remove(indice);

            }

        }
    }

}