/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.List;
import modelo.Provincia;
import servicio.PaisServiceImpl;
import servicio.ProvinciaServiceImpl;

/**
 *
 * @author USUARIO
 */
public class ProvinciaControl {
    
    private ProvinciaServiceImpl provinciaServiceImpl = new ProvinciaServiceImpl();
    private PaisServiceImpl paisServiceImpl = new PaisServiceImpl();

    
    

    public String crear(String [] data){
        var retorno = "No se pudo crear la Provincia";
        var nombre=data[0];
        var expancionTerritorial=Double.valueOf(data[1]).doubleValue();//double
        var inicioCedula=data[2];
        var pais=data[3];
        var nroHabitantes=Double.valueOf(data[4]).doubleValue();//double
        
        if (nroHabitantes < 0) {
            retorno += " El numero de Habitantes no son validos ";
        }else {
            if (expancionTerritorial <= 0 || expancionTerritorial > 300000000) {
                retorno += " No existe la expancion territorial";
            }
            var provincia=new Provincia(nombre, expancionTerritorial, inicioCedula, pais, nroHabitantes);
            this.provinciaServiceImpl.crear(provincia);
        }
        return retorno;     
    }
    
    public String modificar(String [] data){
        var retorno = "No se pudo crear la Provincia";
        var nombre=data[0];
        var expancionTerritorial=Double.valueOf(data[1]).doubleValue();//double
        var inicioCedula=data[2];
        var pais=data[3];
        var nroHabitantes=Double.valueOf(data[4]).doubleValue();//double
        
        if (nroHabitantes < 0) {
            retorno += " El numero de Habitantes no son validos ";
        }else {
            if (expancionTerritorial <= 0 || expancionTerritorial > 300000000) {
                retorno += " No existe la expancion territorial";
            }
            var provincia=new Provincia(nombre, expancionTerritorial, inicioCedula, pais, nroHabitantes);
            this.provinciaServiceImpl.crear(provincia);
        }
        return retorno;     
    }
    public void eliminar(String codigos) {
        var codigo = Integer.valueOf(codigos).intValue();
        this.provinciaServiceImpl.eliminar(codigo);
    }
    public List<Provincia> listar(){
        return this.provinciaServiceImpl.listar();

    }
    
}
